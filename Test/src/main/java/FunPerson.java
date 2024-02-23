
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
public class FunPerson {
    Scanner sc = new Scanner(System.in);
    int id;
    String name;
    String gander;
    float s1,s2,s3;
    void Input()
    {
        System.out.println("Input ID = ");
       id=sc.nextInt();
        System.out.println("Input Name = ");
        name=sc.next();
        System.out.println("Input Gander = ");
        gander=sc.next();
        System.out.println("Input score1 = ");
        s1=sc.nextFloat();
        System.out.println("Input score2 = ");
        s2=sc.nextFloat();
        System.out.println("Input score3 = ");
        s3=sc.nextFloat();
    }
    float total()
    {
        return s1+s2+s3;
    }
    float avg()
    {
       return total()/3;
    }
    String grade()
    {
        String grade;
        if(avg()>=90&& avg() < 100)
        {
            grade ="A";
        }
        else if(avg() >= 70&& avg()> 89)
        {
            grade ="B";
        }
          else if(avg() >= 70&& avg()> 89)
        {
            grade ="C";
        }
          else if(avg() >= 60&& avg()> 70)
        {
            grade ="D";
        }
          else if(avg() >= 50 && avg()> 60)
        {
            grade ="E";
        }
        else
        {
            grade ="F";
        }
        return grade;
    }
    void Output()
    {
        System.out.println("Total ="+total());
        System.out.println("Avg ="+avg());
        System.out.print("Grade = "+ grade());
    }
    public FunPerson()
    {
        Input();
        Output();
    }
    public static void main(String[] args) {
        new FunPerson();
    }
    
}
