/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Fun2 {
    int Sum1()
    {
        int x,y;
        x=100;
        y=200;
        return (x+y);
    }
    int Sum2(int x,int y)
    {
        return (x+y);
    }
    double Sum3(double x,double y,double z)
    {
        return (x+y+z);
    }
    public Fun2()
    {
        //Calling Function
        System.out.println("Calling function Sum1="+ Sum1());
        System.out.println("Calling function Sum2="+ Sum2(100,400));
        System.out.println("Calling function Sum3="+ Sum3(45.9,25.6,36.8));
    }
    public static void main(String[] args) {
        new Fun2();
    }
    
}
