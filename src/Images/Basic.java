package Images;

import javax.swing.*;//window settings
import java.awt.*;

public class Basic extends JFrame
{
     public static void main(String[] args)
     {
          Basic b = new Basic() ;
          b.setDefaultCloseOperation(EXIT_ON_CLOSE);
          b.setVisible(true);
          b.setDefaultCloseOperation(EXIT_ON_CLOSE);
          b.setSize(500,500);
     }
     Basic()
     {
          this.setLayout(null);
          Container c = this.getContentPane() ;
          String data[][] = {
                    {"Phani","18","200"},
                    {"Phani","21","200000"},
                    {"Phani","25","20000000"},
          } ;
          String row[] = { "Name","Age","Salary"
          } ;
          JTable jt = new JTable(data,row) ;
          JScrollPane jsp = new JScrollPane(jt) ;
          jsp.setBounds(200,200,500,700);
          jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
          jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
          c.add(jsp) ;

     }
}
