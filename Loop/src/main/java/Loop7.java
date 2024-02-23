
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
public class Loop7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int rows, number = 1, counter,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows for floyd's triangle: ");
        rows = sc.nextInt();
        System.out.println("Floyd's triangle");
        System.out.println("******************************");
        for(counter =1; counter <= rows;counter++)
        {
            for(j=1;j<=counter;j++)
            {
                System.out.print(number +" ");
                number++;
            }
            System.out.println();
        }
    }
    
}
