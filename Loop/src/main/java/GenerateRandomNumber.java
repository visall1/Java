
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class GenerateRandomNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int counter;
        Random rnum= new Random();
        System.out.println("Random Numbers: ");
        System.out.println("*********************");
        for(counter =1; counter <=5;counter++)
        {
            System.out.println(rnum.nextInt(200));
        }
    }
    
}
