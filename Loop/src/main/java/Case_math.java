
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Case_math {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int op=0;
       do{
           System.out.println("============ M E N U =============");
           System.out.println("1 >> Sum = 1/2! + 2/2! +......n/2!");
           System.out.println("2 >> Sum = cos(0) + cos(1)+......+cos(i)");
           System.out.println("3 >> Sum = sqrt(1) + sqrt(2)+....+sqrt(i)");
           System.out.println("4 >> Sum = 1^2 + 2^2 + .....+ i^2");
           System.out.println("Choose One [1-4]=");
           op=sc.nextInt();
           switch(op)
           {
               case 1:
               {
                   float i,n,sum=0,f=1;
                   System.out.println("Input N=");
                   n=sc.nextFloat();
                   i=1;
                   while(i<=n)
                   {
                       f=f*i;
                       sum+=f/2;
                       i++;
                   }
                   System.out.println("Sum1 = "+sum+"!");
               }break;
               case 2:
               {
                   float i,n,sum=0;
                   System.out.println("Input N=");
                   n=sc.nextFloat();
                   i=1;
                   while(i<=n)
                   {
                       sum=(float) (sum+Math.cos(i));
                       i++;
                   }
                   System.out.println("Cos = "+sum);
               }break;
               case 3:
               {
                   int i,n,sum=0;
                   System.out.println("Input N=");
                   n=sc.nextInt();
                   i=1;
                   while(i<=n)
                   {
                       sum+=Math.sqrt(i);
                       i++;
                   }
                   System.out.println("Sqrt = "+sum);
                   
               }break;
               case 4:
               {
                   int i,n,sum=0;
                   System.out.println("Input N=");
                   n=(int) sc.nextFloat();
                   i=1;
                   while(i<=n)
                   {
                       sum = (int)(sum +Math.pow(i, 2));
                       i++;
                   }
                   System.out.println("Pow = "+sum);
               }
           }
           
       }while(op != 0);
    }
    
}
