/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Loop5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        System.out.println("Form Incremental Loop");
        i=1;
        do{
            System.out.print(i+ " ");
            i++;
        }while(i<=10);
        System.out.println("\nForm Decremental Loop");
        i=10;
        do{
            System.out.print(i+ "   ");
            i--;
        }while(i>=1);
    }
    
}
