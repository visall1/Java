
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
public class DecimalToHexa10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a decimal Numbem: ");
        int num =sc.nextInt();
        int rem;
        String str2="";
        char hex[]={'1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(num>0)
        {
            rem=num%16;
            str2=hex[rem]+str2;
            num/=16;
        }
        System.out.println("Method 2: Decimal To Hexadecimal :" +str2);
    }
    
}
