
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
public class Loop8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean isVowel=false;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch=sc.next().charAt(0);
        sc.close();
        switch(ch)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U': isVowel = true;
        }
        if(isVowel==true)
        {
            System.out.println(ch+" is a vowel");
        }
        else
        {
            if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
            {
                System.out.println(ch+" is a Consonant");
            }
            else
            {
                System.out.println("Input is not an alphabet");
            }
        }
    }
    
}
