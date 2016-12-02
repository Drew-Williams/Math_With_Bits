package my.mathwithbits;

import java.util.Arrays;


public class BitMath {
    String bits1;
    String bits2;
    String bits3;
    String bits4;
    String outOfBounds = "Out Of Bounds";
    boolean negative1 = false;
    boolean negative2 = false;
    StringBuilder strBuilder1 = new StringBuilder();
    String bit2String;
    int[] sumArray = new int[8];
    boolean subtract = false;
    
    
//    public BitMath(String bits1, String bits2){
    public BitMath(String bits1, String bits2, Boolean subtract){
        this.bits1 = bits1;
        this.bits2 = bits2;
        this.subtract = subtract;
    }   
    //receives the binary strings from both text boxes as well as add/subtract flag
    public String bitReveiver(String bits1, String bits2, Boolean subtract){
        
        int[] intArray1 = new int[8];
        int[] intArray2 = new int[8];
        
        //parse bits1 String into an the array of Ints intArray1
        for(int i = 0; i < intArray1.length; i++){
            if(bits1.charAt(i) == '0'){
                intArray1[i] = 0;
            }else{
                intArray1[i] = 1;
            }                     
            if(bits1.charAt(0) == '1'){negative1 = true;}       
        }
        //System.out.println("intArray1 : " + Arrays.toString(intArray1));
        //parse bits2 into an the array of Ints intArray2
        //If subtract = true than flip these
        for(int i = 0; i < intArray2.length; i++){
            if(bits2.charAt(i) == '0'){
                intArray2[i] = 0;
            }else{
                intArray2[i] = 1;
            }
            if(bits2.charAt(0) == '1'){negative2 = true;}
        }
            //System.out.println("intArray2 : " + Arrays.toString(intArray2));      
            //System.out.println("negative = "+negative2);               
            //check if negative if so send to flipBits()
            //ONLY flip these bits when subtracting
            if(subtract == true){
                intArray2 = bitFlip(intArray2);
            }
            //System.out.println("Array2 Two's Compliment  : " + Arrays.toString(intArray2));
            //negative2 = false;

            //add the int arrays togeather
            for(int i = 0; i < sumArray.length; i++){
                sumArray[i] = intArray1[i] + intArray2[i];
            }
            //System.out.println("Pre-sumArray  : " + Arrays.toString(sumArray));           
            sumArray = shiftBits(sumArray);
            //System.out.println("Post-sumArray  : " + Arrays.toString(sumArray));
            
        //check for out of bounds answer  
        if(negative1 && negative2 && sumArray[0] != 1 
            || negative1 == false && negative2 == false && sumArray[0] != 0){
            return outOfBounds;
        }else{
            return Arrays.toString(sumArray);
        }  
    }  

        public int[] shiftBits(int[] sumArray){
            for(int x = sumArray.length -1; x >= 0; x--){
           //check for arrayoutofbounds exception
            try{//if sumArray index = 2 or 3 subtract 2 & add 1 to the the next index value
                if (sumArray[x] == 2 || sumArray[x] == 3){
                    sumArray[x] -= 2;
                    //carry 1 to the next index. It goes down from 7 to 0
                    sumArray[x - 1] += 1;
                }
            //check for array going out of bounds which will truncate the carry out
            }catch(ArrayIndexOutOfBoundsException ex){
                System.out.println("Out of bounds caught. A carry-out occured");
            }
        }      
        return sumArray;
    }
    //flip the bits & add one
    public int[] bitFlip(int[] intArrayLocal){
        for(int x = 0; x < intArrayLocal.length; x++){
            if(intArrayLocal[x] == 1){
                intArrayLocal[x] = 0;
            }else{
                intArrayLocal[x] = 1;
            }
        }
        //System.out.println("######Flipped : " + Arrays.toString(intArrayLocal));
        //add one to last index
        intArrayLocal[7] += 1;
        //itterate backwards through flipped bits and add 1
        for(int x = intArrayLocal.length -1; x >= 0; x--){
            //add one to the last bit on the right
            if (intArrayLocal[x] == 2){
                //subtract 2
                intArrayLocal[x] -= 2;
                //go to the next index and add one
                intArrayLocal[x - 1] += 1;
            }
        }
        //System.out.println("######Flipped+Add One : " + Arrays.toString(intArrayLocal));
        
        return intArrayLocal;
    }
}