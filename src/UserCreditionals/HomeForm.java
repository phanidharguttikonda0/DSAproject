package UserCreditionals;


/**
 *
 * @author phani
 */
public class HomeForm extends javax.swing.JFrame {
       static String MobileNumber ;
     /**
      * Creates new form HomeForm
      */
     public HomeForm() {
          initComponents();
     }

     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">
     private void initComponents() {

          jLabel1 = new javax.swing.JLabel();
          wallet = new javax.swing.JButton();
          history = new javax.swing.JButton();
          AddAccount = new javax.swing.JButton();
          TranferViaBank = new javax.swing.JButton();
          TransferViaNumber = new javax.swing.JButton();
          BankBalance = new javax.swing.JButton();
          LABEL_1 = new javax.swing.JLabel();
          label_3 = new javax.swing.JLabel();
          jLabel4 = new javax.swing.JLabel();
          jLabel2 = new javax.swing.JLabel();
          jLabel3 = new javax.swing.JLabel();
          jLabel5 = new javax.swing.JLabel();
          Settings = new javax.swing.JButton();
          jLabel6 = new javax.swing.JLabel();

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

          jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
          jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
          jLabel1.setText("WELCOME TO HOME PAGE");

          wallet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/account_balance_wallet_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
          wallet.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    walletActionPerformed(evt);
               }
          });

          history.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/history.png"))); // NOI18N
          history.setText("jButton2");
          history.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    historyActionPerformed(evt);
               }
          });

          AddAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AddAccount.png"))); // NOI18N
          AddAccount.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    AddAccountActionPerformed(evt);
               }
          });

          TranferViaBank.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/TransferMoneyThroughBank.png"))); // NOI18N
          TranferViaBank.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    TranferViaBankActionPerformed(evt);
               }
          });

          TransferViaNumber.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user.png"))); // NOI18N
          TransferViaNumber.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    TransferViaNumberActionPerformed(evt);
               }
          });

          BankBalance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BankBalance.png"))); // NOI18N
          BankBalance.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    BankBalanceActionPerformed(evt);
               }
          });

          LABEL_1.setText("Wallet");

          label_3.setText("Add Account");

          jLabel4.setText("History");

          jLabel2.setText("Transfer Money via Bank");

          jLabel3.setText("Transfer Money By Number");

          jLabel5.setText("Bank Balance");

          Settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/settings.png"))); // NOI18N
          Settings.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    SettingsActionPerformed(evt);
               }
          });

          jLabel6.setText("Settings");

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                            .addComponent(label_3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(242, 242, 242))
                                                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                            .addComponent(TransferViaNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(171, 171, 171)
                                                            .addComponent(BankBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(234, 234, 234))
                                                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                            .addComponent(Settings)
                                                            .addGap(521, 521, 521))))
                              .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                  .addGroup(layout.createSequentialGroup()
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                      .addGroup(layout.createSequentialGroup()
                                                                                .addGap(219, 219, 219)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                          .addComponent(wallet, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                          .addComponent(TranferViaBank, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                          .addGroup(layout.createSequentialGroup()
                                                                                                    .addGap(6, 6, 6)
                                                                                                    .addComponent(LABEL_1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                      .addGroup(layout.createSequentialGroup()
                                                                                .addGap(199, 199, 199)
                                                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                      .addGroup(layout.createSequentialGroup()
                                                                                .addGap(190, 190, 190)
                                                                                .addComponent(history, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(158, 158, 158)
                                                                                .addComponent(AddAccount))
                                                                      .addGroup(layout.createSequentialGroup()
                                                                                .addGap(161, 161, 161)
                                                                                .addComponent(jLabel3)
                                                                                .addGap(160, 160, 160)
                                                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                      .addGroup(layout.createSequentialGroup()
                                                                                .addGap(210, 210, 210)
                                                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                  .addGroup(layout.createSequentialGroup()
                                                            .addGap(48, 48, 48)
                                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                  .addGroup(layout.createSequentialGroup()
                                                            .addGap(529, 529, 529)
                                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addContainerGap(235, Short.MAX_VALUE))
          );
          layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                  .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                            .addGap(206, 206, 206)
                                                            .addComponent(TranferViaBank))
                                                  .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(wallet, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(AddAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                      .addComponent(history, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                      .addComponent(LABEL_1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(label_3)))
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(BankBalance))
                                                  .addComponent(TransferViaNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                  .addComponent(jLabel2)
                                                  .addComponent(jLabel5)
                                                  .addComponent(jLabel3))
                                        .addGap(34, 34, 34)
                                        .addComponent(Settings, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)
                                        .addContainerGap(49, Short.MAX_VALUE))
          );

          pack();
     }// </editor-fold>
    public HomeForm(String MobileNumber)
     {
          this.MobileNumber = MobileNumber ;
          initComponents();
     }

     private void walletActionPerformed(java.awt.event.ActionEvent evt)
     {
          dbms db = new dbms() ;
         Wallet w = new Wallet() ;
         w.setBalance(db.WalletBalance());
         w.setVisible(true);
         this.dispose();
     }

     private void historyActionPerformed(java.awt.event.ActionEvent evt)
     {
          History hi = new History() ;
          hi.setSize(1200,800) ;
          hi.setVisible(true) ;
          this.dispose() ;
     }

     private void AddAccountActionPerformed(java.awt.event.ActionEvent evt)
     {
         AddAccount ac = new AddAccount() ;
         ac.setVisible(true);
         this.dispose();
     }
     private void TranferViaBankActionPerformed(java.awt.event.ActionEvent evt)
     {
          if(new dbms().dbms())
          {
               TransferMoney tm = new TransferMoney() ;
               tm.setVisible(true);
               this.dispose();
          }
          else
          {
               AddAccount ac = new AddAccount() ;
               ac.setVisible(true);
               this.dispose();
          }
     }
     private void TransferViaNumberActionPerformed(java.awt.event.ActionEvent evt)
     {
          if(new dbms().dbms())
          {
               SelectCard sc = new SelectCard("TransferNumber");
               sc.setVisible(true);
               this.dispose();
          }
          else
          {
               AddAccount ac = new AddAccount() ;
               ac.setVisible(true);
               this.dispose();
          }
     }

     private void BankBalanceActionPerformed(java.awt.event.ActionEvent evt)
     {
          if(new dbms().dbms())
          {
               SelectCard sc = new SelectCard("Balance");
               sc.setVisible(true);
               this.dispose();
          }
          else
          {
               AddAccount ac = new AddAccount() ;
               ac.setVisible(true);
               this.dispose();
          }
     }

     private void SettingsActionPerformed(java.awt.event.ActionEvent evt)
     {
          Settings s = new Settings() ;
          s.setVisible(true) ;
          this.dispose();
     }




     // Variables declaration - do not modify
     private javax.swing.JButton AddAccount;
     private javax.swing.JButton BankBalance;
     private javax.swing.JLabel LABEL_1;
     private javax.swing.JButton Settings;
     private javax.swing.JButton TranferViaBank;
     private javax.swing.JButton TransferViaNumber;
     private javax.swing.JButton history;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JLabel jLabel2;
     private javax.swing.JLabel jLabel3;
     private javax.swing.JLabel jLabel4;
     private javax.swing.JLabel jLabel5;
     private javax.swing.JLabel jLabel6;
     private javax.swing.JLabel label_3;
     private javax.swing.JButton wallet;
     // End of variables declaration
}

