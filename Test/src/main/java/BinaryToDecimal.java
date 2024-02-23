
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
public class BinaryToDecimal {
    Scanner sc = new Scanner(System.in);
    int binary;
    void Input()
    {
        System.out.println("Input Binary Number = ");
        binary=sc.nextInt();
    }
    int Decimal()
    {
        int decimal= 0;
        int i=1;
        while(binary !=0)
        {
            decimal+=(binary%10)*Math.pow(2, i);
            binary/=10;
            i++;
        }
        return decimal;
    }
    void Output()
    {
        System.out.println("Element an Decimal Number is = "+ Decimal());
    }
    public BinaryToDecimal()
    {
        Input();
        Output();
        
    }
    public static void main(String[] args) {
        new BinaryToDecimal();
    }
    
}
