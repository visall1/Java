
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
public class Loopst {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int temp;
        boolean isPrime=true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        int num=sc.nextInt();
        sc.close();
        for(int i=2;i<=num;i++)
        {
            temp=num%i;
            if(temp==0)
            {
                isPrime=false;
                break;
            }
        }
        if(isPrime)
        {
            System.out.print(num +" is a Prime Number");
        }
        else{
            System.out.print(num+" Is not a Prime Number");
        }
    }
    
}
