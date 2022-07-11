package UserCreditionals;

import com.sun.source.tree.WhileLoopTree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

class TransactionHistory
{
     // SendedTo   | ReceviedFrom | SendedAmount | RecievedAmount | CreditedTo | Debitedfrom
     String SendedTo ;
     String ReceviedFrom ;
     String SendedAmount ;
     String RecievedAmount ;
     String CreditedTo ;
     String Debitedfrom ;
     TransactionHistory(String SendedTo ,String ReceviedFrom,String SendedAmount,String RecievedAmount,String CreditedTo,String Debitedfrom)
     {
          this.SendedTo = SendedTo ;
          this.CreditedTo =CreditedTo ;
          this.Debitedfrom = Debitedfrom ;
          this.ReceviedFrom = ReceviedFrom ;
          this.RecievedAmount = RecievedAmount ;
          this.SendedAmount = SendedAmount ;
     }
}
public class History extends JFrame implements ActionListener
{
//     public static void main(String[] args)
//     {
//          History h = new History() ;
//          h.setSize(1200,800);
//          h.setVisible(true);
//          h.setDefaultCloseOperation(EXIT_ON_CLOSE);
//     }
     JScrollPane jsp ;
     public History()
     {
         this.setLayout(null);
          Container con = this.getContentPane() ;
          JLabel jl = new JLabel("Transaction History") ;
          jl.setBounds(70,70,300,40) ;
          jl.setFont(new Font("Serif", Font.BOLD, 30));
          con.add(jl) ;
          Stack st = new Transaction().Transaction() ;
          st.traversal();
          String column[] = {"SendedTo" ,  "ReceviedFrom" , "SendedAmount" , "RecievedAmount" , "CreditedTo" , "Debitedfrom"} ;
          String row[][] = new Transaction().Rows(st) ;
          String rr[][] = {{"SendedTo" ,  "ReceviedFrom" , "SendedAmount" , "RecievedAmount" , "CreditedTo" , "Debitedfrom"},
                    {"SendedTo" ,  "ReceviedFrom" , "SendedAmount" , "RecievedAmount" , "CreditedTo" , "Debitedfrom"}} ;
          JTable jt = new JTable(row,column) ;

          jsp = new JScrollPane(jt) ;
          jsp.setBounds(120,120,900,600) ;
          con.add(jsp) ;
          jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS) ;
          jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
          JButton jb = new JButton("Back") ;
          jb.setBounds(20,40,70,30);
          jb.addActionListener(this);
          con.add(jb) ;
     }

     @Override
     public void actionPerformed(ActionEvent e)
     {
          HomeForm hf = new HomeForm() ;
          hf.setVisible(true) ;
          this.dispose();
     }
}
class Transaction
{
     public Stack Transaction()
     {
          Stack TranSactions = new Stack() ;
          try
          {
            Class.forName(DataBaseDetails.driver) ;
            Connection con = DriverManager.getConnection(DataBaseDetails.url,DataBaseDetails.un,DataBaseDetails.pwd) ;
               Statement st = con.createStatement() ;
               ResultSet rs = st.executeQuery("select * from "+HomeForm.MobileNumber+"_transactions") ;
               int i = 0 ;
               while (rs.next())
               {
                    TransactionHistory th = new TransactionHistory(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)) ;
                    System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6));
                    TranSactions.Push(th);
               }

          }
          catch (SQLException sql)
          {
               sql.printStackTrace();
          }
          catch (ClassNotFoundException e)
          {
               e.printStackTrace();
          }
         return TranSactions ;
     }
     /**
      This Function Will return the 2D-Array of strings and takes the input
      as the Stack.....
      */
     public String[][] Rows(Stack row)
     {
          String rows[][] = new String[row.size][6] ;
          int i = 0 ;
          TransactionHistory th ;
          while (i!= rows.length)
          {
               int j = 0 ;
               th = row.Pop() ;
                    rows[i][j] = th.SendedTo ;
                    j++ ;
                    rows[i][j] = th.ReceviedFrom ;
                    j++ ;
                    rows[i][j] = th.SendedAmount ;
                    j++ ;
                    rows[i][j] = th.RecievedAmount ;
                    j++ ;
                    rows[i][j] = th.CreditedTo ;
                    j++ ;
                    rows[i][j] = th.Debitedfrom ;
                    i++ ;

          }
          for (int k = 0 ; k < rows.length;k++)
          {
               for (int l = 0 ; l < 6 ; l++)
               {
                    System.out.println(rows[k][l]);
               }
          }
          return rows ;
     }
}
class Stack
{
     private node  top ;
     int size = 0 ;
     class node
     {
          TransactionHistory transaction ;
          node previous ;
          node(TransactionHistory transaction)
          {
                this.transaction = transaction ;
          }
     }
     public void Push(TransactionHistory tran)
     {
          node n = new node(tran) ;
          if(top==null)
          {
               top = n;
               size++ ;
          }
          else
          {
               n.previous = top ;
               top = n ;
               size++ ;
          }
     }
     public TransactionHistory Pop()
     {
          if (top==null) return null ;
          else
          {
               node th = top ;
               top = top.previous ;
               size-- ;
               return th.transaction ;
          }
     }
     public void traversal()
     {
          node st = top ;
          while(st!=null)
          {
               System.out.println(st.transaction);
               st = st.previous ;
          }
     }
}
