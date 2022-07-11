import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC
{
     public static String driver = "com.mysql.cj.jdbc.Driver" ;
     public static String url = "jdbc:mysql://localhost:3306/E_Banking" ;
     public static String un = "root" ;
     public static String pwd = "Phani@9090K" ;
     public static void main(String[] args) throws Exception {
          Class.forName(driver) ;
          Connection con = DriverManager.getConnection(url,un,pwd) ;
          Statement st = con.createStatement() ;
          ResultSet rs = st.executeQuery("select * from E_BANKINGcREDITIONALS") ;
          while (rs.next())
          {
               System.out.println("Email "+rs.getString(1)+"  "
               +"Mobile Number "+rs.getString(2)+" "+" PassWord "+rs.getString(3));
          }
          String mobile = "8885858760" ;
          long l = Long.parseLong(mobile) ;
          String mobile2 = "9704663579" ;
          long l1 = Long.parseLong(mobile2) ;
          if(l1>l)
          {
               System.out.println(l1+" is always greater ");
          }
          else System.out.println(l+" is always greater");
          int l11 = 1234567890 ;
     }

}
