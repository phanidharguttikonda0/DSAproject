package UserCreditionals;

import javax.swing.*;

/**
 *
 * @author phani
 */
public class TransferMoney extends javax.swing.JFrame {

     /**
      * Creates new form TransferMoney
      */
     public TransferMoney()
     {
          initComponents();
     }

     /**
      * This method is called from within the constructor to initialize the form.
      * WARNING: Do NOT modify this code. The content of this method is always
      * regenerated by the Form Editor.
      */
     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">
     private void initComponents() {

          jLabel1 = new javax.swing.JLabel();
          Back = new javax.swing.JButton();
          Wallet = new javax.swing.JButton();
          Continue = new javax.swing.JButton();
          jLabel2 = new javax.swing.JLabel();
          jLabel3 = new javax.swing.JLabel();
          cardNumber = new javax.swing.JTextField();
          Pin = new javax.swing.JPasswordField();

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

          jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
          jLabel1.setText("Select Card");

          Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/arrow_back_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
          Back.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    BackActionPerformed(evt);
               }
          });

          Wallet.setText("Go With Wallet");
          Wallet.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    WalletActionPerformed(evt);
               }
          });

          Continue.setText("Continue");
          Continue.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    ContinueActionPerformed(evt);
               }
          });

          jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
          jLabel2.setText("Card Number");

          jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
          jLabel3.setText("Pin");

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                  .addGroup(layout.createSequentialGroup()
                                                            .addGap(315, 315, 315)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                      .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                                                      .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                      .addComponent(Pin, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                                                      .addComponent(cardNumber)))
                                                  .addGroup(layout.createSequentialGroup()
                                                            .addGap(42, 42, 42)
                                                            .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(211, 576, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                            .addComponent(Continue, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(402, 402, 402))
                                                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                            .addComponent(Wallet)
                                                            .addGap(84, 84, 84))))
                              .addGroup(layout.createSequentialGroup()
                                        .addGap(76, 76, 76)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
          );
          layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Wallet, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(79, 79, 79)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                  .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                  .addComponent(cardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(83, 83, 83)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                  .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                  .addComponent(Pin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                                        .addComponent(Continue, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(197, 197, 197))
          );

          pack();
     }// </editor-fold>

     private void WalletActionPerformed(java.awt.event.ActionEvent evt)
     {
          WalletAmount wa = new WalletAmount() ;
          wa.setVisible(true) ;
          this.dispose() ;
     }

     private void ContinueActionPerformed(java.awt.event.ActionEvent evt)
     {
          // TODO add your handling code here:
          String CardNumber = cardNumber.getText() ;
          String PassWord = Pin.getText() ;
          if(new RegExAddAccount(CardNumber,PassWord).CardNumberCheck())
          {
               if(new RegExAddAccount(CardNumber,PassWord).PinCheck())
               {
                    InsertInDataBase idb = new InsertInDataBase(CardNumber,PassWord) ;
                    if(idb.SearchingCardNumber())
                    {
                         TransferMoneyViaNumber tm = new TransferMoneyViaNumber(CardNumber,"Bank") ;
                         tm.setVisible(true) ;
                         this.dispose();
                    }
                    else
                    {
                         JOptionPane.showMessageDialog(this,"Card Number doesn't exists");
                    }
               }
               else
               {
                    JOptionPane.showMessageDialog(this,"Pin must be 6 digits");
               }
          }
          else
          {
               JOptionPane.showMessageDialog(this,"Invalid Card Number");
          }
     }

     private void BackActionPerformed(java.awt.event.ActionEvent evt)
     {
          HomeForm hf = new HomeForm() ;
          hf.setVisible(true) ;
          this.dispose();
     }

     // Variables declaration - do not modify
     private javax.swing.JButton Back;
     private javax.swing.JButton Continue;
     private javax.swing.JPasswordField Pin;
     private javax.swing.JButton Wallet;
     private javax.swing.JTextField cardNumber;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JLabel jLabel2;
     private javax.swing.JLabel jLabel3;
     // End of variables declaration
}
