package UserCreditionals;

public class BinarySearchTree
{
      node root ;
     class  node
     {
          Long data ;
          String Password ;
          node left ;
          node right ;
          node(Long data,String PassWord)
          {
               this.data = data ;
               this.Password = PassWord ;
          }
     }
     public void add(Long data,String Password)
     {
          node n = new node(data,Password) ;
          if(root==null)
          {
               root = n ;
          }
          else
          {
               node Main = root ;
               while (Main!=null)
               {
                    if(Main.data>n.data)
                    {
                         if(Main.left==null)
                         {
                              Main.left = n ;
                              return;
                         }
                         Main = Main.left ;
                    }
                    else if(Main.data<n.data)
                    {
                         if(Main.right==null)
                         {
                             Main.right = n ;
                             return;
                         }
                         Main = Main.right ;
                    }
                    else
                    {
                         return;
                    }
               }
          }
     }
     public boolean SearchMobile(Long l)
     {
          if(root==null) return false ;
          else
          {
               node Main = root ;
               while (Main!=null)
               {
                    if(Main.data>l)
                    {
                         if(Main.left==null) return false ;
                         Main = Main.left ;
                    }
                    else if(Main.data<l)
                    {
                         if(Main.right==null) return false ;
                         Main = Main.right ;
                    }
                    else
                    {
                         return true ;
                    }
               }
               return false ;
          }
     }
     public boolean SearchDetails(Long l,String Password)
     {
          if(root==null) return false ;
          else
          {
               node Main = root ;
               while(Main!=null)
               {
                    if(Main.data>l)
                    {
                         if(Main.left==null) return false ;
                         Main = Main.left ;
                    }
                    else if(Main.data<l)
                    {
                         if(Main.right==null) return false ;
                         Main = Main.right ;
                    }
                    else
                    {
                         // System.out.println(Main.data==l) ;
                              if(Main.Password.equals(Password)) return true ;
                              else return false ;
                    }
               }
          }
          return false ;
     }
}
