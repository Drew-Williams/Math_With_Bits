/**
 * Name: Drew Williams
 * Course: Computer Organization I (11533)
 * Section: 221
 * Semester: Fall 2016
 * Class Time: Tuesday/Thursday 10:00-11:50am
 * Lab: #3
 * 
This program allows the user to add or subtract binary 8 bit signed numbers. It 
* prints out both the binary answer as well as the numeric answer
 */

package my.mathwithbits;

import java.util.Arrays;

public class Math_With_BitsUi extends javax.swing.JFrame {

    private String theAnswer = "";
    private String errorMsg = "";
    private boolean subtract = false;
    private boolean negative = false;
    
    
    public Math_With_BitsUi() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        Input1 = new javax.swing.JTextField();
        Input2 = new javax.swing.JTextField();
        Answer = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        decimalAnswer = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Math With Bits");

        jLabel2.setText("Enter First Binary");

        jLabel3.setText("Enter Second Binary");

        jButton1.setText("Quit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Add", "Subtract" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Binary Answer");

        jButton3.setText("Calculate");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Input1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Input1ActionPerformed(evt);
            }
        });

        Input2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Input2ActionPerformed(evt);
            }
        });

        Answer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnswerActionPerformed(evt);
            }
        });

        jLabel5.setText("Decimal Answer");

        decimalAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalAnswerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Input1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(68, 68, 68)
                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(decimalAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(17, 17, 17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Input2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Answer, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Input1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Input2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Answer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(decimalAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Input1.setText("");
        Input2.setText("");
        Answer.setText("");
        decimalAnswer.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        String dAnswer = "";
        //Add    
        if(jComboBox1.getSelectedItem().toString() == "Add"){
            //try{
                //set subtract to false for adding
                subtract = false;
                //get string from input fields
                String input1 = Input1.getText();
                String input2 = Input2.getText();
                //remove whitespace
                String noWhite1 = input1.replaceAll("\\s", "");
                String noWhite2 = input2.replaceAll("\\s", "");

                //check for correct input length
                if(noWhite1.length() > 8 || noWhite1.length() < 8 && 
                        noWhite2.length() > 8 || noWhite2.length() < 8 ){
                    //alert the user if input is incorrect 
                    errorMsg = "Inputs must contain 8 bits";
                }else{
                    //instantiate the object
                    BitMath bitMath = new BitMath(noWhite1, noWhite2, subtract);
                    //send the binary number to BitMath
                    //and take off the array elements
                    theAnswer = bitMath.bitReveiver(noWhite1, noWhite2, subtract).toString().replace("[", "").replace("]", "").replace(",", "").replace(" ", "");
                    //System.out.println("THE Answer : "+theAnswer);
                }
                //print answer or error message to screen
                if(errorMsg.equals("")){
                    Answer.setText(theAnswer);
                    dAnswer = BinaryToDecimal(theAnswer);
                }else{
                    Answer.setText(errorMsg);
                    errorMsg = "";
                }
           //print answer to gui
            decimalAnswer.setText(dAnswer);
        //Subtract
        }else{
                //set subtract to true
                subtract = true;
                //get string from input fields
                String input1 = Input1.getText();
                String input2 = Input2.getText();
                //remove whitespace
                String noWhite1 = input1.replaceAll("\\s", "");
                String noWhite2 = input2.replaceAll("\\s", "");

                //check for correct input length
                if(noWhite1.length() > 8 || noWhite1.length() < 8 && 
                        noWhite2.length() > 8 || noWhite2.length() < 8 ){
                    //alert the user if input is incorrect 
                    errorMsg = "Inputs must contain 8 bits";
                }else{
                    //instantiate the object
                    BitMath bitMath = new BitMath(noWhite1, noWhite2, subtract);
                    //send the binary number to BitMath
                    theAnswer = bitMath.bitReveiver(noWhite1, noWhite2, subtract).toString().replace("[", "").replace("]", "").replace(",", "").replace(" ", "");
                    //System.out.println("THE Answer : "+theAnswer);
                }
                //print answer or error message to screen
                if(errorMsg.equals("")){
                    Answer.setText(theAnswer);
                    dAnswer = BinaryToDecimal(theAnswer);
                }else{
                    Answer.setText(errorMsg);
                    errorMsg = "";
                }       
        }
            decimalAnswer.setText(dAnswer);            
    }//GEN-LAST:event_jButton3ActionPerformed
	public String BinaryToDecimal(String i) {
                int[] preflipped = new int[8];
                boolean negative = false;
                
        for(int x = 0; x < i.length(); x++){
                preflipped[x] = Integer.parseInt(String.valueOf(i.charAt(x)));
                if(preflipped[0] == 0){
                    negative = false;
                }else{
                    negative = true;
                }
            }
                //System.out.println("______Arrays to String: "+Arrays.toString(preflipped));
            
        if(negative == true){        
            for(int x = 0; x < preflipped.length; x++){
            if(preflipped[x] == 1){
                preflipped[x] = 0;
            }else{
                preflipped[x] = 1;
            }
        }
        //System.out.println("_______Post-Flipped : " + Arrays.toString(preflipped));
        //add one to last index
        preflipped[7] += 1;
        //itterate backwards through flipped bits and add 1
        for(int x = preflipped.length -1; x >= 0; x--){
            //add one to the last bit on the right
            if (preflipped[x] == 2){
                //subtract 2
                preflipped[x] -= 2;
                //go to the next index and add one
                preflipped[x - 1] += 1;
            }
        }
                
        }
            //find the decimal value of the bit   
            int sumbits = 0;
		for (int n = 0; n <= 7; n++) {                   
                    if (preflipped[n] != 0) {
				sumbits += Math.pow(2, 7 - n);
			}
		}
                //System.out.println("Decimal : " + sumbits);
                String sumbitsString = "";
                if(negative == true){
                    sumbitsString = Integer.toString(sumbits * -1);
                }else{
                    sumbitsString = Integer.toString(sumbits);
                }
		return sumbitsString;
	}
        
    private void Input1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Input1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Input1ActionPerformed

    private void Input2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Input2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Input2ActionPerformed

    private void AnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnswerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnswerActionPerformed

    private void decimalAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimalAnswerActionPerformed
        //#######
    }//GEN-LAST:event_decimalAnswerActionPerformed

      
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Math_With_BitsUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Math_With_BitsUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Math_With_BitsUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Math_With_BitsUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Math_With_BitsUi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Answer;
    private javax.swing.JTextField Input1;
    private javax.swing.JTextField Input2;
    private javax.swing.JTextField decimalAnswer;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}