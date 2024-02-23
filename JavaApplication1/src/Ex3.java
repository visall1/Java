
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;


public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int i,n,op = 0;
       Hashtable<Integer,dictionary> hm = new Hashtable<Integer,dictionary>();
       do{
           System.out.println("1 >> Input ");
           System.out.println("2 >> Output ");
           System.out.println("3 >> Search ");
           System.out.println("4 >> Update ");
           
           System.out.print("Choose One Option = ");
           op = sc.nextInt();
           switch(op)
           {
               case 1:
               {
                   System.out.print("Input Number = ");
                   n = sc.nextInt();
                   for(i=0;i<n;i++)
                   {
                       dictionary dic = new dictionary();
                       dic.Input();
                       hm.put(i, dic);
                   }
               }break;
               case 2:
               {
                   for(Map.Entry<Integer, dictionary> dic : hm.entrySet())
                   {
                       dic.getValue().Output();
                   }
               }break;
               case 3:
               {
                   sc.nextLine();
                   System.out.print("Input to search = ");
                   String sword = sc.nextLine();
                   for(Map.Entry<Integer,dictionary> dic: hm.entrySet())
                   {
                       if(sword == dic.getValue().GetWord())
                       {
                           dic.getValue().Output();
                       }
                   }
               }break;
           }
       }while(op != 0);
       
    }
    
}
