package UserCreditionals;

import javax.swing.*;

/**
 *
 * @author phani
 */
public class SelectCard extends javax.swing.JFrame {

     /**
      * Creates new form SelectCard
      */

     String obj ;
     public SelectCard()
     {
          initComponents();
     }
     public SelectCard(String obj)
     {
          initComponents();
          this.obj = obj ;
     }

     /**
      * This method is called from within the constructor to initialize the form.
      * WARNING: Do NOT modify this code. The content of this method is always
      * regenerated by the Form Editor.
      */
     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">
     private void initComponents() {

          jScrollPane1 = new javax.swing.JScrollPane();
          jTextPane1 = new javax.swing.JTextPane();
          jLabel1 = new javax.swing.JLabel();
          CardNumber = new javax.swing.JTextField();
          Pin = new javax.swing.JLabel();
          PinData = new javax.swing.JPasswordField();
          Continue = new javax.swing.JToggleButton();
          jToggleButton1 = new javax.swing.JToggleButton();

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

          jTextPane1.setBackground(new java.awt.Color(153, 255, 153));
          jTextPane1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
          jTextPane1.setText("Select Ur Card that already registered");
          jScrollPane1.setViewportView(jTextPane1);

          jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
          jLabel1.setText("Card Number");

          Pin.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
          Pin.setText("Pin");

          Continue.setText("Continue");
          Continue.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    ContinueActionPerformed(evt);
               }
          });

          jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/arrow_back_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
          jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jToggleButton1ActionPerformed(evt);
               }
          });

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                      .addGap(353, 353, 353)
                                                                      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(Pin, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                      .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                .addComponent(CardNumber)
                                                                                .addComponent(PinData, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)))
                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                      .addContainerGap()
                                                                      .addComponent(Continue, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                  .addGroup(layout.createSequentialGroup()
                                                            .addGap(63, 63, 63)
                                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                  .addGroup(layout.createSequentialGroup()
                                                            .addGap(34, 34, 34)
                                                            .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addContainerGap(469, Short.MAX_VALUE))
          );
          layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(63, 63, 63)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                  .addComponent(CardNumber)
                                                  .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                  .addComponent(PinData, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                  .addComponent(Pin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(50, 50, 50)
                                        .addComponent(Continue, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(316, 316, 316))
          );

          pack();
     }// </editor-fold>


     private void ContinueActionPerformed(java.awt.event.ActionEvent evt)
     {
          if(obj==null)
          {
               RegExAddAccount reg = new RegExAddAccount(CardNumber.getText(), PinData.getText());
               if (reg.CardNumberCheck())
               {
                    InsertInDataBase idb = new InsertInDataBase(CardNumber.getText(), PinData.getText()) ;
                    if (idb.SearchingCardNumber())
                    {
                         Amount am = new Amount(CardNumber.getText());
                         am.setVisible(true);
                         this.dispose();
                    }
                    else
                    {
                         JOptionPane.showMessageDialog(this,"Invalid Card Details");
                    }
               }
               else
               {
                    JOptionPane.showMessageDialog(this, "InCorrect Card NUmber");
               }
          }
          else if(obj.equalsIgnoreCase("Balance"))
          {
               System.out.println("Hello");
               RegExAddAccount reg = new RegExAddAccount(CardNumber.getText(), PinData.getText());
               if (reg.CardNumberCheck()) {
                    InsertInDataBase idb = new InsertInDataBase(CardNumber.getText(), PinData.getText()) ;
                    if (idb.SearchingCardNumber()) {
                         BankBalance b = new BankBalance();
                         b.SetText(new Balance(CardNumber.getText(), PinData.getText()).Balance());
                         b.setVisible(true);
                         this.dispose();
                    }
                    else
                    {
                         JOptionPane.showMessageDialog(this,"Invalid Card Details");
                    }
               }
               else
               {
                    JOptionPane.showMessageDialog(this, "InCorrect Card NUmber");
               }

               }
          else if (obj.equals("TransferNumber"))
          {
               RegExAddAccount reg = new RegExAddAccount(CardNumber.getText(), PinData.getText());
               if (reg.CardNumberCheck()) {
                    InsertInDataBase idb = new InsertInDataBase(CardNumber.getText(), PinData.getText());
                    if (idb.SearchingCardNumber()) {
                         TransferMoneyViaNumber tmvn = new TransferMoneyViaNumber(CardNumber.getText(),"Balance");
                         tmvn.setVisible(true);
                         this.dispose();
                    }
                    else
                    {
                         JOptionPane.showMessageDialog(this,"Invalid Card Details");
                    }
               }
               else
               {
                    JOptionPane.showMessageDialog(this, "InCorrect Card NUmber");
               }
          }
     }

     private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt)
     {
          HomeForm hf = new HomeForm() ;
          hf.setVisible(true);
          this.dispose();
     }

     /**
      * @param args the command line arguments
      */


     // Variables declaration - do not modify
     private javax.swing.JTextField CardNumber;
     private javax.swing.JToggleButton Continue;
     private javax.swing.JLabel Pin;
     private javax.swing.JPasswordField PinData;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JScrollPane jScrollPane1;
     private javax.swing.JTextPane jTextPane1;
     private javax.swing.JToggleButton jToggleButton1;
     // End of variables declaration
}