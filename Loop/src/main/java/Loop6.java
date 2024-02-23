
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
public class Loop6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double sum;
        int n,i;
        String op,st;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("A. Sum Loop1");
            System.out.println("B. Sum Loop2");
            System.out.println("C. Sum Loop3");
            System.out.println("D. Sum Loop4");
            System.out.println("E. Sum Loop5");
            System.out.println("F. Sum Loop6");
            
            System.out.println("CHoose One A-F=");
            op=sc.next();
            System.out.println("Input Number of Loop=");
            n=sc.nextInt();
            switch(op)
            {
                case "A":
                case "a":{
                    sum=0;
                    for(i=1;i<n;i++)
                    {
                        sum=sum+i;
                    }
                    System.out.println("Sum Of Loop1=" +sum);
                }break;
                case "B":
                case "b":{
                    sum=0;
                    for(i=1;i<n;i++)
                    {
                        sum=sum+Math.sqrt(i);
                    }
                    System.out.print("Sum Of Loop2="+sum+"\n");
                }break;
                case "C":
                case "c":{
                    sum=0;
                    for(i=1;i<n;i++)
                    {
                        sum=sum+Math.pow(i,3);
                    }
                    System.out.print("Sum Of Loop3="+sum);
                }break;
                case "D":
                case "d":{
                    sum=0;
                    for(i=1;i<n;i++)
                    {
                        sum=sum+Math.sin(i);
                    }
                    System.out.print("Sum Of Loop4="+sum);
                }break;
                case "E":
                case "e":{
                    sum=0;
                    for(i=1;i<n;i++)
                    {
                        sum=sum+Math.log(i);
                    }
                    System.out.print("Sum Of Loop5="+sum);
                }break;
            }
            
            
            System.out.println("Write yes To Continue.....!");
            st=sc.next();
        }while(st.equals("yes"));
    }
    
}
