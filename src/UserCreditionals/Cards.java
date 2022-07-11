package UserCreditionals;

import com.mysql.cj.xdevapi.Column;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Cards extends JFrame implements ActionListener
{
//     public static void main(String[] args)
//     {
//          Cards cd = new Cards() ;
//          cd.setVisible(true);
//          cd.setSize(1161,711);
//          cd.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//     }
     private int size = 0 ;
     JButton rows[][] ;
     Cards()
     {
          this.setLayout(null);
          Container con = this.getContentPane() ;
          JLabel jl = new JLabel("Accounts") ;
          jl.setFont(new Font(jl.getFont().getName(), jl.getFont().getStyle(), 30));
          jl.setBounds(50,50,300,50);
          this.add(jl) ;
//          JScrollPane jsp = new JScrollPane() ;
//          jsp.setBounds(100,100,1000,500);
//          jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
//          jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
//          con.add(jsp) ;
          JButton jb = new JButton("1231");
          DataBaseData dbd = new DataBaseData() ;
          int size = dbd.DataCount() ;
          this.size = size ;
           rows = dbd.Adding_rows(size,this);
          JLabel jl1 = new JLabel("Select Any Below Cards") ;
          jl1.setFont(new Font(jl1.getFont().getName(), jl1.getFont().getStyle(), 20));
          String Columns[] = {""} ;
          JTable jt = new JTable(rows, Columns) ;
          jt.setFillsViewportHeight(true);
        jt.setBounds(120,120,800,500);
          JScrollPane scrollPane = new JScrollPane(jt);
          scrollPane.setBounds(200,100,700, 500);
          scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
          con.add(scrollPane) ;
          JButton jb1 = new JButton("Back") ;
          jb1.setBounds(20,20,100,30);
          jb1.addActionListener(this);
          con.add(jb1) ;
     }

     @Override
     public void actionPerformed(ActionEvent e)
     {
          if (e.getActionCommand().equals("Back"))
          {
               HomeForm hf = new HomeForm() ;
               hf.setVisible(true);
               this.dispose();
          }
          else
          {
           String cardDetails = e.getActionCommand() ;
           System.out.println(cardDetails);
          }
     }
}
class DataBaseData
{

 public int DataCount()
 {
      try
      {
           int size = 0;
           Class.forName(DataBaseDetails.driver) ;
           Connection con = DriverManager.getConnection(DataBaseDetails.url,DataBaseDetails.un,DataBaseDetails.pwd) ;
           Statement st = con.createStatement();
           ResultSet rs = st.executeQuery("select * from "+HomeForm.MobileNumber+"_addaccount") ;
                while (rs.next())
                {
                     size++ ;
                }
                st.close();
                con.close();
                return size ;
      }
      catch (SQLException sql)
      {

      } catch (ClassNotFoundException e) {
           e.printStackTrace();
      }
      return 0 ;
 }
 public JButton[][] Adding_rows(int size,Cards cd)
 {
      JButton jj[][] = new JButton[size][1] ;
      try
      {

           Class.forName(DataBaseDetails.driver) ;
           Connection con = DriverManager.getConnection(DataBaseDetails.url,DataBaseDetails.un,DataBaseDetails.pwd) ;
           Statement st = con.createStatement();
           String s = HomeForm.MobileNumber+"_addaccount" ;
          ResultSet rs = st.executeQuery("select * from "+s) ;
          int i = 0 ;
          while (rs.next())
          {
               jj[i][0] = new JButton(rs.getString(2)) ;
               System.out.println(jj[i][0].getActionCommand()+" hi");
               jj[i][0].addActionListener(cd);
               i++ ;
          }
          con.close();
          st.close();
      } catch (SQLException e) {
           e.printStackTrace();
      } catch (ClassNotFoundException e) {
           e.printStackTrace();
      }
      return jj ;
 }
}
