package UserCreditionals;

import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;




/**
 *
 * @author phani
 */
public class LoginForm extends JFrame {

     /**
      * Creates new form LoginForm
      */

     public LoginForm()
     {
          initComponents();
     }
       BinarySearchTree bst  ;
     // static BinarySearchTree bt = bst ;
     public LoginForm(BinarySearchTree bst)
     {
          initComponents() ;
          this.bst = bst ;
     }

     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">
     private void initComponents() {

          jLabel1 = new javax.swing.JLabel();
          feild1 = new javax.swing.JTextField();
          jLabel2 = new javax.swing.JLabel();
          jLabel3 = new javax.swing.JLabel();
          jSeparator1 = new javax.swing.JSeparator();
          Login = new javax.swing.JButton();
          jLabel4 = new javax.swing.JLabel();
          fdetails = new javax.swing.JButton();
          jLabel5 = new javax.swing.JLabel();
          SignUp = new javax.swing.JButton();
          feild2 = new javax.swing.JPasswordField();

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

          jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
          jLabel1.setText("                                 E-Banking");

          jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
          jLabel2.setText("Mobile Number");

          jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
          jLabel3.setText("PassWord");

          Login.setText("Login");
          Login.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    LoginActionPerformed(evt);
               }
          });

          jLabel4.setText("Forgotten Login Creditionals ");

          fdetails.setText("click here");
          fdetails.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    fdetailsActionPerformed(evt);
               }
          });

          jLabel5.setText("New User sign Up");

          SignUp.setText("Sign Up");
          SignUp.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    SignUpActionPerformed(evt);
               }
          });

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap(306, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                      .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                      .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGap(10, 10, 10)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                      .addComponent(jSeparator1)
                                                                      .addComponent(feild1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                                                      .addComponent(feild2))
                                                            .addGap(345, 345, 345))
                                                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                      .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(SignUp))
                                                                      .addGroup(layout.createSequentialGroup()
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                                                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                          .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                          .addComponent(fdetails, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                            .addGap(364, 364, 364))))
                              .addGroup(layout.createSequentialGroup()
                                        .addGap(167, 167, 167)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 847, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(46, Short.MAX_VALUE))
          );
          layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(68, 68, 68)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                  .addComponent(feild1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                  .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(1, 1, 1)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                  .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                  .addGroup(layout.createSequentialGroup()
                                                            .addComponent(feild2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(5, 5, 5)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                  .addComponent(jLabel4)
                                                  .addComponent(fdetails, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                  .addGroup(layout.createSequentialGroup()
                                                            .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(55, 55, 55)
                                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                  .addComponent(SignUp))
                                        .addContainerGap(232, Short.MAX_VALUE))
          );

          pack();
     }// </editor-fold>

     private void fdetailsActionPerformed(java.awt.event.ActionEvent evt)
     {
          ForgetDetails fd = new ForgetDetails() ;
          fd.setVisible(true) ;
          this.dispose() ;
     }

     private void SignUpActionPerformed(java.awt.event.ActionEvent evt) {
          RegisterForm rf = new RegisterForm() ;
          rf.setVisible(true) ;
          this.dispose() ;
     }

     private void LoginActionPerformed(java.awt.event.ActionEvent evt) {
          String MobileNumber = feild1.getText() ;
          String PassWord = feild2.getText() ;
          MobileChecks mc = new MobileChecks(MobileNumber) ;
          if(mc.MobileNumberCheck()) {
               if (PassWord.length() >= 6) {
                   // System.out.println("Binary Search Tree "+bst.root.data);
                    System.out.println(Long.parseLong(MobileNumber)+" is ");
                    System.out.println(bst.SearchDetails(Long.parseLong(MobileNumber),PassWord));
                    System.out.println("Binary Sear==");
                    if (bst.SearchDetails(Long.parseLong(MobileNumber),PassWord))
                    {
                         System.out.println("After Home Page ") ;
                         HomeForm hf = new HomeForm(MobileNumber);
                         hf.setVisible(true);
                         this.dispose();
                    }
                    else
                    {
                         JOptionPane.showMessageDialog(this, "InCorrect Creditionals");
                    }
               }
               else
               {
                    JOptionPane.showMessageDialog(this, "Password lenght Must be atleast 6");
               }
          }
          else
          {
               JOptionPane.showMessageDialog(this, "InCorrect Mobile Number");
          }

     }

     /**
      * @param args the command line arguments
      */


     // Variables declaration - do not modify
     private javax.swing.JButton Login;
     private javax.swing.JButton SignUp;
     private javax.swing.JButton fdetails;
     private javax.swing.JTextField feild1;
     private javax.swing.JPasswordField feild2;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JLabel jLabel2;
     private javax.swing.JLabel jLabel3;
     private javax.swing.JLabel jLabel4;
     private javax.swing.JLabel jLabel5;
     private javax.swing.JSeparator jSeparator1;
     // End of variables declaration
}
class DataBaseDetails
{
     public static String driver = "com.mysql.cj.jdbc.Driver" ;
     public static String url = "jdbc:mysql://localhost:3306/E_Banking" ;
     public static String un = "root" ;
     public static String pwd = "Phani@9090K" ;
}
class MobileNumber
{

}
/*
 this class is used to check whether the given or passed details are in the database or not
*/
class DetailsCheck
{
     String MobileNumber ;
     String PassWord ;
     DetailsCheck(String MobileNumber,String PassWord)
     {
          this.MobileNumber = MobileNumber ;
          this.PassWord = PassWord ;
     }

     public boolean DataBaseCheck()
     {
          /**
           *  Here we can use the Skip List because here the executeQuery() function
           *  also will check row by row until the given details matches to the given
           *  columns in the database which takes the linear search time complexity
           *  so we will take the whole table from the database and from their we will
           *  preapare a node class which consists of the mobile number and the pass-
           *  -word and by using the skip list we will find the mobile number in O(logn)
           *  time complexity .
           */

          try
          {
               Class.forName(DataBaseDetails.driver) ;
               Connection con = DriverManager.getConnection(DataBaseDetails.url,DataBaseDetails.un,DataBaseDetails.pwd) ;
               PreparedStatement stmt = con.prepareStatement("select * from E_BANKINGcREDITIONALS where" +
                         " MOBILENUMBER=? and PassWord=?");
               stmt.setString(1,MobileNumber);
               stmt.setString(2,PassWord);
               ResultSet rs = stmt.executeQuery() ;
               if(rs.next())
               {
                    System.out.println("hii");
                    stmt.close();
                    con.close();
                    return true ;
               }
               else
               {
                    stmt.close();
                    con.close();
                    return false ;
               }

          }
          catch (NullPointerException ne)
          {
              ne.printStackTrace();
          }
          catch (SQLException sqe)
          {
               System.out.println(sqe);
          } catch (ClassNotFoundException e) {
               e.printStackTrace();
          }
         return false ;
     }
}
class MobileChecks
{
     String MobileNumber;
     MobileChecks(String MobileNumber)
     {
          this.MobileNumber = MobileNumber ;
     }
     public boolean MobileNumberCheck()
     {
          Pattern p = Pattern.compile("[6789][0-9]{9}") ;
          Matcher m = p.matcher(MobileNumber);
          return m.matches() ;
     }
}