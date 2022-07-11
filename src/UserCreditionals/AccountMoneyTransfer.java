package UserCreditionals;

import java.sql.*;

public class AccountMoneyTransfer
{
     String MobileNumber ; // Mobile Number of the User to add Amount in to his Account
     String CardNumber ;// ur's CardNumber to cut amount from ur Card
     String Amount ; // The Amount that ur are going to transferr
     String MyBalance ;
     String WalletAmount ;
     String Entered ;
     AccountMoneyTransfer(String MobileNumber,String CardNumber,String Amount,String MyBalance)
     {
          this.MobileNumber = MobileNumber ;
          this.CardNumber = CardNumber ;
          this.Amount = Amount ;
          this.MyBalance = MyBalance ;
     }
     AccountMoneyTransfer(String MobileNumber,String WalletAmount,String entered)
     {
         this.MobileNumber = MobileNumber ;
         this.WalletAmount = WalletAmount ;
         this.Entered = entered ;
     }
     /**
      This Function will Cut the Amount in our Bank of the CardNumber we
      with draw from .
      */
     public void CutAmount()
     {
         try
         {
            String Table = HomeForm.MobileNumber+"_cardbalance" ;
            String transactions = HomeForm.MobileNumber+"_transactions" ;
            Class.forName(DataBaseDetails.driver) ;
            Connection con = DriverManager.getConnection(DataBaseDetails.url,DataBaseDetails.un,DataBaseDetails.pwd) ;
            Statement st = con.createStatement() ;
            int Myamount = Integer.parseInt(MyBalance) ;
            int cutOffAmount = Myamount - Integer.parseInt(Amount) ;
            st.executeUpdate("Update "+Table+" set Balance="+String.valueOf(cutOffAmount)+" where CardNumber="+CardNumber) ;
            st.executeUpdate("insert into "+transactions+" values ('"+MobileNumber+"'"+","+"'"+"----"+"'"+","+"'"+Amount+"'"+","+"'"+"----'"+","+"'----'"+","+CardNumber+")") ;
           st.close();
           con.close();
         }
         catch (SQLException sql)
         {
              sql.printStackTrace();
         } catch (ClassNotFoundException e) {
              e.printStackTrace();
         }
     }
     /**
      This Function will add the Amount in to the User's Wallet
      */
     public void AddWallet()
     {
          try
          {
               String transactions = MobileNumber+"_transactions" ;
               Class.forName(DataBaseDetails.driver) ;
               Connection con = DriverManager.getConnection(DataBaseDetails.url,DataBaseDetails.un,DataBaseDetails.pwd) ;
               Statement st = con.createStatement() ;
               ResultSet rs = st.executeQuery("select * from e_bankingcreditionals where MOBILENUMBER="+MobileNumber) ;
               String WalletAmount = "" ;
               if(rs.next())
               {
                WalletAmount = rs.getString("wallet") ;
               }
               Integer walletamount = Integer.parseInt(WalletAmount) ;
               int TotalWallet = walletamount + Integer.parseInt(Amount) ;
               st.executeUpdate("update e_bankingcreditionals set  wallet="+String.valueOf(TotalWallet)+" where MOBILENUMBER="+MobileNumber) ;
               st.executeUpdate("insert into "+transactions+" values ('"+"----"+"'"+","+"'"+HomeForm.MobileNumber+"'"+","+"'"+"----"+"'"+","+"'"+Amount+"'"+","+"'Wallet'"+","+"'----')") ;
               st.close();
               con.close();
          }
          catch (SQLException sql)
          {
               sql.printStackTrace();
          } catch (ClassNotFoundException e) {
               e.printStackTrace();
          }
     }
     /**
      This Function will add the With drawed Amount from the bank
      and directly adds to the User's Bank
      */
     public void AddAmount()
     {
          try
          {
               String table = MobileNumber+"_cardbalance" ;
               String transactions = MobileNumber+"_transactions" ;
               Class.forName(DataBaseDetails.driver) ;
               Connection con = DriverManager.getConnection(DataBaseDetails.url,DataBaseDetails.un,DataBaseDetails.pwd) ;
               Statement st = con.createStatement() ;
               ResultSet rs = st.executeQuery("select * from "+table) ;
               if(rs.next())
               {
                    String balance = rs.getString("Balance") ;
                    String AccountNumber = rs.getString("CardNumber") ;
                    int Balance = Integer.parseInt(balance) ;
                    int Total = Balance + Integer.parseInt(Amount) ;
                    st.executeUpdate("update "+table+" set Balance="+String.valueOf(Total)+" where CardNumber="+AccountNumber) ;
                    st.executeUpdate("insert into "+transactions+" values ('"+"----"+"'"+","+"'"+HomeForm.MobileNumber+"'"+","+"'"+"----"+"'"+","+"'"+Amount+"'"+","+"'"+AccountNumber+"'"+","+"'----')") ;
               }
               /**
                Here , we are getting two conditions if the user didn't have any bank account
                registered with e_banking then automatically it will add to the Wallet...
                */
               else
               {
                    AddWallet();
               }
          }
          catch (SQLException sql)
          {
               sql.printStackTrace();
          } catch (ClassNotFoundException e) {
               e.printStackTrace();
          }
     }
     public void WalletTransfer()
     {
String tablebalance = MobileNumber+"_cardbalance" ;
          try
          {
              /**
               Here we have to update the amount  in our wallet first and then we have to
               check for the bank account linked with the MobileNumber if it is linked then
               we have to write in to the transactions of our transaction table  and we have
               else we have to transfer directly to their wallet if the bank
               * */
               Class.forName(DataBaseDetails.driver) ;
               Connection con = DriverManager.getConnection(DataBaseDetails.url,DataBaseDetails.un,DataBaseDetails.pwd) ;
               Statement st = con.createStatement() ;
               int remainig = Integer.parseInt(WalletAmount) - Integer.parseInt(Entered) ;
               st.executeUpdate("update e_bankingcreditionals set wallet="+String.valueOf(remainig)+" where MOBILENUMBER="+HomeForm.MobileNumber) ;
               ResultSet rs = st.executeQuery("select * from "+tablebalance) ;
               if(rs.next())
               {
                    String CardNumber = rs.getString("CardNumber") ;
                    int balance = Integer.parseInt(Entered) + Integer.parseInt(rs.getString("Balance")) ;
                    st.executeUpdate("update "+tablebalance+" set Balance="+String.valueOf(balance)+" where CardNumber="+CardNumber) ;
                    st.executeUpdate("insert into "+HomeForm.MobileNumber+"_transactions values('"+MobileNumber+"'"+","+"'----'"+","+"'"+Entered+"'"+",'----',"+"'----',"+"'Wallet')") ;
                    st.executeUpdate("insert into "+MobileNumber+"_transactions values('-----',"+"'"+HomeForm.MobileNumber+"',"+"'"+Entered+"',"+"'"+CardNumber+"',"+"'----'") ;
               }
               else
               {
                    ResultSet rss = st.executeQuery("select * from e_bankingcreditionals where MOBILENUMBER="+MobileNumber) ;
                    rss.next() ;
                    int balance = Integer.parseInt(Entered) + Integer.parseInt(rss.getString("wallet")) ;
                    st.executeUpdate("update e_bankingcreditionals set wallet="+String.valueOf(balance)+" where MOBILENUMBER="+MobileNumber) ;
                    st.executeUpdate("insert into "+HomeForm.MobileNumber+"_transactions values('"+MobileNumber+"'"+","+"'----'"+","+"'"+Entered+"'"+",'----',"+"'----',"+"'Wallet')") ;
                    st.executeUpdate("insert into "+MobileNumber+"_transactions values('-----'"+","+"'"+HomeForm.MobileNumber+"'"+","+"'"+Entered+"'"+","+"'"+"Wallet"+"'"+","+"'----'") ;
               }
               st.close();
          }
          catch (SQLException sql)
          {
               sql.printStackTrace();
          }
          catch (ClassNotFoundException e)
          {
               e.printStackTrace();
          }
     }
}
