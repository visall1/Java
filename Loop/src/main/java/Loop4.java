/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Loop4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           int i;
        System.out.println("From Incremental Loop");
        i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("\nForm Decremental Loop");
        i = 10;
        while (i >= 1) {
            System.out.print(i + " ");
            i--;
        }
    }
    
}
