import java.util.*;
import java.util.Scanner;

class Employee{
    
    
    public ArrayList<Integer> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    private int id;
    private float salary;
    private String name;
    private String sex;
     
    public Employee()
    {
        id=0;
        name="N/A";
        sex="N/A";
        salary = 0;
    }
    public Employee(int i,String n,String s,float r)
    {
        this.id=i;
        this.name=n;
        this.sex=s;
        this.salary=r;
    }
    public void Input()
    {
        System.out.print("Input ID = ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Input Name = ");
        name = sc.nextLine();
        System.out.print("Input Sex = ");
        sex = sc.next();
        System.out.print("Input Salary = ");
        salary = sc.nextFloat();
    }
    public void Ouput()
    {
        System.out.println("ID = "+ id);
        System.out.println("Name = "+ name);
        System.out.println("Sex = ");
        System.out.println("Salary = ");
    }
}
public class Emp {
    
    public static void main(String[] args) {
        int n = 0,i;
        Employee emp1 = new Employee();
        emp1.Input();
               
    }
    
}
