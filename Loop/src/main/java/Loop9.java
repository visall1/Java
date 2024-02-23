
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
public class Loop9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Decimal Number = ");
        int num =sc.nextInt();
        String octalString = Integer.toOctalString(num);
        System.out.println("Method 1: Decimal to Octal : "+octalString);
        int rem;
        String str="";
        char dig[]={'0','1','2','3','4','5','6','7'};
        while(num>0)
        {
            rem=num%8;
            str=dig[rem]+str;
            num=num/8;
        }
        System.out.println("Method 2: Decimal to Octal = "+str);
    }
    
}
