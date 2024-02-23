
import java.util.Scanner;
class Employee{
    Scanner sc = new Scanner(System.in);
    private int id;
    private String name;
    private String sex;
    private float salary;
    public void Input()
    {
        System.out.print("Input ID = ");
        id = sc.nextInt();
        System.out.print("Input Name = ");
        name = sc.next();
        System.out.print("Input Sex = ");
        sex = sc.next();
        System.out.print("Input Salary = ");
        salary = sc.nextFloat();
        
    }
    public float bonus()
    {
        if(salary >= 100 && sex.equals("F")||salary >= 100 && sex.equals("female"))
        {
            return (float) (salary * 0.20);
        }
        else if(salary >= 100 && sex.equals("M") || salary >= 100 && sex.equals("male"))
        {
            return (float) (salary * 0.15);
        }else{
            return (float) (salary *0.10);
        }
        
    }
    public float total()
    {
        return salary + bonus();
    }
    public void Output()
    {
        System.out.println("ID = "+ id);
        System.out.println("Name = "+ name);
        System.out.println("Sex = "+ sex);
        System.out.println("salary = "+ salary);
        System.out.println("Bonus = "+ bonus());
        System.out.println("Total = "+ total());
    }
}
public class Example1 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.Input();
        emp.Output();
    }
    
}
