
import java.util.Collections;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;


public class Ex2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int i,n,op = 0;
       Hashtable<Integer,Employee> hm = new Hashtable<>();
       do{
           System.out.println("1 >> Input ");
           System.out.println("2 >> Output ");
           System.out.println("3 >> Search ");
           System.out.println("4 >> Update");
           System.out.print("Please Choose one option = ");
           op = sc.nextInt();
           switch(op)
           {
               case 1:
               {
                   System.out.print("Input N = ");
                   n= sc.nextInt();
                  for(i=0;i<n;i++)
                  {
                      Employee emp = new Employee();
                      emp.Input();
                      hm.put(i, emp);
                  }
               }break;
               case 2:
               {
                   for(Map.Entry<Integer,Employee> emp : hm.entrySet() )
                   {
                       emp.getValue().Output();   
                   }
               }break;
               case 3:
               {
                   System.out.print("Input ID To Search = ");
                   int sid= sc.nextInt();
                   for(Map.Entry<Integer,Employee> emp : hm.entrySet())
                   {
                       if(sid == emp.getValue().num())
                       {
                           emp.getValue().Output();
                       }
                   }
               }break;
               case 4:
               {
                   System.out.print("Input ID To Update = ");
                   int sid= sc.nextInt();
                   for(Map.Entry<Integer,Employee> emp : hm.entrySet())
                   {
                       if(sid == emp.getValue().num())
                       {
                           emp.getValue().Update();
                       }
                   }
               }break;
          
           }
       }while(op != 0);
    }
    
}
