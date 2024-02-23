
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
public class DiToBin {
    Scanner sc = new Scanner(System.in);
    int decimal;
    void Input()
    {
        System.out.println("Input Decimal Number = ");
        decimal=sc.nextInt();
    }
    int Binary()
    {
        int binary= 0;
        int i=1;
        while(decimal !=0)
        {
            binary+=(decimal%2)*Math.pow(10, i);
            decimal/=2;
            i++;
        }
        return binary;
    }
    void Output()
    {
        System.out.println("Element an Binary Number is = "+ Binary());
    }
    public DiToBin()
    {
        Input();
        Output();
        
    }
    public static void main(String[] args) {
        new DiToBin();
    }
    
}
