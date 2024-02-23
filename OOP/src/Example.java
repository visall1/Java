
import java.util.Scanner;

class Student{
    Scanner sc= new Scanner(System.in);
    private int id;
    private String name;
    private String sex;
    private float s1,s2,s3;
    public void Input()
    {
        System.out.print("Input ID = ");
        id = sc.nextInt();
        System.out.print("Input Name= ");
        name = sc.next();
        System.out.print("Input Sex = ");
        sex = sc.next();
        System.out.print("Input Java = ");
        s1=sc.nextFloat();
        System.out.print("Input C++ = ");
        s2=sc.nextFloat();
        System.out.print("Input C3 =");
        s3=sc.nextFloat();
        
        
    }
    public String Grade()
    {
        if(avg() >= 90 && avg() <100)
        {
            return "A";
        }
        else if(avg() >= 80 && avg() <90)
        {
            return "B";
        }
        else if(avg() >= 70 && avg() <80)
        {
            return "C";
        }
        else if(avg() >= 60 && avg() <70)
        {
            return "D";
        }
        else if(avg() >= 50 && avg() <60)
        {
            return "E";
        }
        else{
            return "F";
        }
        
        
    }
    public float total()
    {
        return s1+s2+s3;
    }
    public float avg()
    {
        return total()/3;
    }
    
    public void Output()
    {
        System.out.println("Total = "+ total());
        System.out.println("Avg = "+ avg());
        System.out.println("Grade = "+ Grade());
    }
}
public class Example {
    public static void main(String[] args) {
      Student stu = new Student();
      stu.Input();
      stu.Output();
    }
    
}
