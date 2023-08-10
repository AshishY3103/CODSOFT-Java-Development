/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.toy.anagrams.ui;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class ATMInterface extends javax.swing.JFrame {
    private StringBuilder inputText;
    private ATM atm;
    
    /**
     * Creates new form ATMInterface
     */
    public ATMInterface(String operation,ATM atm) {
        initComponents();
        this.atm = atm;
        
        inputText = new StringBuilder("");
        operationBtn.setText(operation);
        if(operation=="Deposit"){
            heading1.setText("Enter Amount to Deposite");
            operationBtn.setBackground(new java.awt.Color(255, 204, 102));
            operationBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255,153,0), 3, true));
        }else if(operation=="Withdraw"){
            heading1.setText("Enter Amount to Withdraw");
            operationBtn.setBackground(new java.awt.Color(255, 102, 102));
            operationBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255,0,0), 3, true));
        }else if(operation=="Change Pin"){
            heading1.setText("Enter New Pin");
            operationBtn.setBackground(new java.awt.Color(0, 204, 0));
            operationBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 51), 3, true));
        
        }else{
            operationBtn.setBackground(new java.awt.Color(102, 204, 255));
            operationBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0,51,255), 3, true));           
        }
        
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        heading = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        oneBtn = new javax.swing.JButton();
        twoBtn = new javax.swing.JButton();
        threeBtn = new javax.swing.JButton();
        fourBtn = new javax.swing.JButton();
        sevenBtn = new javax.swing.JButton();
        fiveBtn = new javax.swing.JButton();
        eightBtn = new javax.swing.JButton();
        nineBtn = new javax.swing.JButton();
        sixBtn = new javax.swing.JButton();
        zeroBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        backspaceBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        operationBtn = new javax.swing.JButton();
        outputArea = new javax.swing.JLabel();
        heading1 = new javax.swing.JLabel();

        heading.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        heading.setForeground(new java.awt.Color(0, 153, 255));
        heading.setText("Enter Pin Number");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });

        oneBtn.setBackground(new java.awt.Color(204, 204, 204));
        oneBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        oneBtn.setText("1");
        oneBtn.setActionCommand("");
        oneBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        oneBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneBtnActionPerformed(evt);
            }
        });

        twoBtn.setBackground(new java.awt.Color(204, 204, 204));
        twoBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        twoBtn.setText("2");
        twoBtn.setActionCommand("");
        twoBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        twoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoBtnActionPerformed(evt);
            }
        });

        threeBtn.setBackground(new java.awt.Color(204, 204, 204));
        threeBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        threeBtn.setText("3");
        threeBtn.setActionCommand("");
        threeBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        threeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeBtnActionPerformed(evt);
            }
        });

        fourBtn.setBackground(new java.awt.Color(204, 204, 204));
        fourBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        fourBtn.setText("4");
        fourBtn.setActionCommand("");
        fourBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fourBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourBtnActionPerformed(evt);
            }
        });

        sevenBtn.setBackground(new java.awt.Color(204, 204, 204));
        sevenBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        sevenBtn.setText("7");
        sevenBtn.setActionCommand("");
        sevenBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sevenBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenBtnActionPerformed(evt);
            }
        });

        fiveBtn.setBackground(new java.awt.Color(204, 204, 204));
        fiveBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        fiveBtn.setText("5");
        fiveBtn.setActionCommand("");
        fiveBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fiveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveBtnActionPerformed(evt);
            }
        });

        eightBtn.setBackground(new java.awt.Color(204, 204, 204));
        eightBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        eightBtn.setText("8");
        eightBtn.setActionCommand("");
        eightBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        eightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightBtnActionPerformed(evt);
            }
        });

        nineBtn.setBackground(new java.awt.Color(204, 204, 204));
        nineBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        nineBtn.setText("9");
        nineBtn.setActionCommand("");
        nineBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineBtnActionPerformed(evt);
            }
        });

        sixBtn.setBackground(new java.awt.Color(204, 204, 204));
        sixBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        sixBtn.setText("6");
        sixBtn.setActionCommand("");
        sixBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sixBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixBtnActionPerformed(evt);
            }
        });

        zeroBtn.setBackground(new java.awt.Color(204, 204, 204));
        zeroBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        zeroBtn.setText("0");
        zeroBtn.setActionCommand("");
        zeroBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        zeroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroBtnActionPerformed(evt);
            }
        });

        backspaceBtn.setBackground(new java.awt.Color(204, 0, 0));
        backspaceBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        backspaceBtn.setForeground(new java.awt.Color(255, 255, 255));
        backspaceBtn.setText("Backspace");
        backspaceBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 3, true));
        backspaceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backspaceBtnActionPerformed(evt);
            }
        });

        cancelBtn.setBackground(new java.awt.Color(0, 153, 0));
        cancelBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelBtn.setText("Cancel");
        cancelBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 0), 3, true));
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        operationBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        operationBtn.setForeground(new java.awt.Color(255, 255, 255));
        operationBtn.setText("Operation");
        operationBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 255), 3, true));
        operationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operationBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backspaceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(operationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(backspaceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(operationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sevenBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fourBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oneBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(zeroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(twoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(threeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(fiveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sixBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(eightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(nineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(threeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(twoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(oneBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fourBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fiveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sixBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sevenBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(zeroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        heading1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        heading1.setForeground(new java.awt.Color(0, 153, 255));
        heading1.setText("Enter Amount");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(outputArea, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(heading1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(outputArea)
                .addGap(18, 18, 18)
                .addComponent(heading1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btnClicked(String str){
        
        inputText.append(str);
        input.setText(""+inputText);
        
    }
    private void oneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneBtnActionPerformed
            btnClicked("1");
            
    }//GEN-LAST:event_oneBtnActionPerformed

    private void twoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoBtnActionPerformed
        btnClicked("2");

    }//GEN-LAST:event_twoBtnActionPerformed

    private void threeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeBtnActionPerformed
        btnClicked("3");

    }//GEN-LAST:event_threeBtnActionPerformed

    private void backspaceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backspaceBtnActionPerformed
        if(inputText != null){
            inputText.delete(inputText.length()-1,inputText.length());
            input.setText(""+inputText);
        } 
    }//GEN-LAST:event_backspaceBtnActionPerformed

    private void fourBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourBtnActionPerformed
        btnClicked("4"); 
    }//GEN-LAST:event_fourBtnActionPerformed

    private void fiveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveBtnActionPerformed
        btnClicked("5");
    }//GEN-LAST:event_fiveBtnActionPerformed

    private void sixBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixBtnActionPerformed
        btnClicked("6");
    }//GEN-LAST:event_sixBtnActionPerformed

    private void sevenBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenBtnActionPerformed
        btnClicked("7");
    }//GEN-LAST:event_sevenBtnActionPerformed

    private void eightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightBtnActionPerformed
        btnClicked("8");
    }//GEN-LAST:event_eightBtnActionPerformed

    private void nineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineBtnActionPerformed
        btnClicked("9");
    }//GEN-LAST:event_nineBtnActionPerformed

    private void zeroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroBtnActionPerformed
        btnClicked("0");
    }//GEN-LAST:event_zeroBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed

        double balance = atm.checkBalance();
        int pin = atm.getPin();
        new ATMMain(balance,pin).setVisible(true);
        dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void operationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operationBtnActionPerformed

        String command = operationBtn.getText();
        double amount;
        /*
        try {
            amount = Double.parseDouble(input.getText());
        } catch (NumberFormatException ex) {
            outputArea.setText("Invalid input. Please enter a valid amount.");
            return;
        }
*/
        switch (command) {
            case "Withdraw":
                try {
            amount = Double.parseDouble(input.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter a valid amount.", "Error", JOptionPane.ERROR_MESSAGE);                
            return;
        }
                boolean success = atm.withdraw(amount);
                if (success) {
                    JOptionPane.showMessageDialog(this, "Withdrawal successful.\nCurrent Balance:"+ atm.checkBalance(), "Sucess", JOptionPane.INFORMATION_MESSAGE);                
                    
                } else {
                    JOptionPane.showMessageDialog(this, "Insufficient balance for withdrawal.", "Error", JOptionPane.ERROR_MESSAGE);                
                    
                }
                break;
            case "Deposit":
                try {
            amount = Double.parseDouble(input.getText());
        } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid input. Please enter a valid amount.", "Error", JOptionPane.ERROR_MESSAGE);                
            return;
        }
                atm.deposit(amount);
                JOptionPane.showMessageDialog(this, "Deposit successful.\nCurrent Balance:"+ atm.checkBalance(), "Success", JOptionPane.INFORMATION_MESSAGE);                
                
                break;
            case "Change Pin":
                
                String pinstr = input.getText();
                        if(pinstr.length()==4){
                            atm.changePin(Integer.parseInt(pinstr));
                            JOptionPane.showMessageDialog(this, "PIN Changed.","Success",JOptionPane.INFORMATION_MESSAGE);
                            double balance = atm.checkBalance();
                            int pin = atm.getPin();
                            new ATMMain(balance,pin).setVisible(true);
                            dispose();
                        }else{
                            JOptionPane.showMessageDialog(this, "Invalid PIN. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);                
                            input.setText("");
                        }
                        break;
        }
  
    }//GEN-LAST:event_operationBtnActionPerformed

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backspaceBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton eightBtn;
    private javax.swing.JButton fiveBtn;
    private javax.swing.JButton fourBtn;
    private javax.swing.JLabel heading;
    private javax.swing.JLabel heading1;
    private javax.swing.JTextField input;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton nineBtn;
    private javax.swing.JButton oneBtn;
    private javax.swing.JButton operationBtn;
    private javax.swing.JLabel outputArea;
    private javax.swing.JButton sevenBtn;
    private javax.swing.JButton sixBtn;
    private javax.swing.JButton threeBtn;
    private javax.swing.JButton twoBtn;
    private javax.swing.JButton zeroBtn;
    // End of variables declaration//GEN-END:variables

    private void dispole() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
