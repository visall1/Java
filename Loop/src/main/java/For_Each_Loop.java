/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class For_Each_Loop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] numbers = {10,20,30,40,50};
        
        for(int x : numbers){
            System.out.print(x);
            System.out.print(",");
        }
        System.out.print("\n");
        String [] names = {"James","Larry","Tom","Lacy"};
        
        for(String name : names ){
            System.out.print(name);
            System.out.print(",");
        }
    }
    
}
