package UserCreditionals;

import com.sun.tools.javac.Main;

import java.sql.*;

/**
 *
 * @author phani
 */
public class MyPage
{
     public static void main(String[]args)
     {
          Main() ;
     }

   public static  void Main()
   {
        DBBMS db = new DBBMS() ;
        BinarySearchTree bst = db.DBMS() ;
        System.out.println("Hii");
        LoginForm l = new LoginForm(bst) ;
        l.setVisible(true);
   }
}
class  DBBMS
{
     public BinarySearchTree DBMS()
     {
          BinarySearchTree bst = new BinarySearchTree() ;
          try
          {
               System.out.println("Hello");
             Class.forName(DataBaseDetails.driver) ;
               Connection con = DriverManager.getConnection(DataBaseDetails.url,DataBaseDetails.un,DataBaseDetails.pwd) ;
               Statement stmt = con.createStatement() ;
               ResultSet rs = stmt.executeQuery("select * from e_bankingcreditionals") ;
               while (rs.next())
               {
                    System.out.println("Hii e_banking Application");
                    bst.add(Long.parseLong(rs.getString("MOBILENUMBER")),rs.getString("PASSWORD"));
               }
               System.out.println("Helloooo");
               stmt.close() ;
               con.close() ;
          }
          catch (SQLException sql)
          {
               System.out.println(sql) ;
          }
          catch (ClassNotFoundException e)
          {
               e.printStackTrace();
          }
          return bst ;
     }
}
