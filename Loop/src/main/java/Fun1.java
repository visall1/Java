/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Fun1 {
    void Sum1()
    {
        int x,y;
        x=100;
        y=200;
        System.out.println("Result of x+y="+(x+y));
    }
    void Sum2(int x,int y)
    {
        System.out.println("Result of x+y="+(x+y));
    }
    public Fun1()
    {
        Sum1();
        Sum2(100,400);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Fun1();
    }
    
}
