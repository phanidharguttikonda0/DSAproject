public class cl
{
     String StudentName ;
     String RollNo ;
     cl(String StudentName,String RollNo)
     {
          this.StudentName = StudentName ;
          this.RollNo = RollNo ;
     }
}
class impl
{
      cl[][]c;
     impl()
     {
          c =hi(5) ;
     }
     public static void main(String[] args)
     {
         int i = 0 ;
         impl im = new impl() ;
         while (i!=5)
         {
              System.out.println(im.c[i][0]);
          i++;
        }
     }
     public cl[][] hi(int size)
     {
          cl[][]s = new cl[size][1] ;
          int i = 0 ;
          s[i][0] = new cl("a","1") ;
          i++ ;
          s[i][0] = new cl("a","1") ;
          i++;
          s[i][0] = new cl("a","1") ;
          i++;
          s[i][0] = new cl("a","1") ;
          i++;
          s[i][0] = new cl("a","1") ;
          return s ;
     }
}
