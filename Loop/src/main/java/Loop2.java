
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
public class Loop2 {
    public static void main(String[] args){
        int n,op,i;
        String st;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1 >> Loop 1");
            System.out.println("2 >> Loop 2");
            System.out.println("3 >> Loop 3");
            System.out.println("4 >> Loop 4");
            System.out.println("5 >> Loop 5");
            System.out.println("6 >> Loop 6");
            
            System.out.println("Choose one Option = ");
            op=sc.nextInt();
            System.out.println("Input Numbers of Loop =");
            n=sc.nextInt();
            switch(op)
            {
                case 1:
                {
                    for(i=2;i<=n;i+=2)
                    {
                        System.out.print(i+ "   ");
                    }
                }break;
                case 2:
                {
                    for(i=2;i<=n;i+=3)
                    {
                        System.out.print(i+ "   ");
                    }
                }break;
                case 3:
                {
                    for(i=10;i>=n;i=i-2)
                    {
                        System.out.print(i+ "   ");
                    }
                }break;
                case 4:
                {
                    for(i=20;i>=n;i=i-3)
                    {
                        System.out.print(i+ "   ");
                    }
                }break;
                case 5:
                {
                    for(i=10;i>=n;i=i-1)
                    {
                        System.out.print(i+ "   ");
                    }
                }break;
            }
            System.out.println("\nWrite Yes To Continue...!");
            st=sc.next();
        }while(st.equals("yes"));
    }
}
