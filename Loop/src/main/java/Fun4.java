
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
public class Fun4 {
    void ReversString()
    {
        String original, reverse ="";
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a string to reverse");
        original = sc.nextLine();
        
        int length = original.length();
        for(int i= length-1;i>=0;i--)
            reverse = reverse + original.charAt(i);
        System.out.println("Reverse of entered string is : "+ reverse);
    }
    public Fun4()
    {
        ReversString();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Fun4();
    }
    
}
