
import java.util.Scanner;


public class Studentt {
    Scanner sc= new Scanner(System.in);
    int n;
   public void Input()
   {
       
       System.out.print("Input Nnumber=");
       n=sc.nextInt();
    }
   public void Output()
   {
       System.out.println("Value is = "+ n);
   }
   public int getnum()
   {
       return n;
   }
}
