/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Fun3 {
    int Sum2(int x,int y)
    {
        return (x+y);
    }
    int Sum3(int a,int b,int c,int d)
    {
        return Sum2(a,b)+Sum2(c,d);
    }
    int Sum4(int a,int b,int c)
    {
        return Sum2(a,b)+c;
    }
    public Fun3()
    {
        System.out.println("Calling Function Sum2="+Sum2(23,5));
        System.out.println("Calling Function Sum3="+Sum3(100,400,6,8));
        System.out.println("Calling Function Sum4="+Sum4(45,78,10));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       new Fun3();
    }
    
}
