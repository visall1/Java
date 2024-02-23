
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
public class Test2 {
    Scanner sc = new Scanner(System.in);
    int id;
    String name;
    String sex;
    float salary,bonus,total;
    void Input()
    {
        System.out.println("Input ID = ");
       id=sc.nextInt();
        System.out.println("Input Name = ");
        name=sc.next();
        System.out.println("Input sex = ");
        sex=sc.next();
        System.out.println("Input Salary =");
        salary=sc.nextFloat();
        
    }
    float Bonus()
    {
        if(salary >= 100 || sex.equals("F"))
        {
           return (float) (salary *0.20);
        }
        else if(salary >= 100 || sex.equals("M"))
        {
            return (float) (salary *0.15);
        }else
        {
            return (float) (salary *0.10);
        }
         
    }
    float total()
    {
        return salary +Bonus();
        
    }
        
    void Output()
    {
       System.out.println("Bonus = " + Bonus());
       System.out.println("Total = "+total());
        System.out.println("Bonus = "+ Bonus());
       
    }
    public Test2()
    {
        Input();
        Output();
    }
    public static void main(String[] args) {
       new Test2();
    }
    
}
