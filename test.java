
/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test
{
 public static void main(String[] args)
 {
     int x;
     int i = 1;
     while(i < 9)
     {

         x = (i + 1)%2;
         
         System.out.println(x);
         i++;
        }
     System.out.println("-----------------------------------------------------------");
     
     int a = 0;
     int v = 0;
     while(a<9)
     {
      v = 1 - v;
      System.out.println(v);
      a++;
     }
 }
}
