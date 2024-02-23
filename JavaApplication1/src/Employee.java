
import java.util.Scanner;


public class Employee {
    Scanner sc= new Scanner(System.in);
    int id;
    String name;
    String sex;
    float salary;
    public void Input()
    {
        System.out.print("Input Id = ");
        id=sc.nextInt();
        sc.nextLine();
        System.out.print("Input Name = ");
        name = sc.nextLine();
        System.out.print("Input Gender = ");
        sex= sc.next();
        System.out.print("Input Salary = ");
        salary= sc.nextFloat();
    }
    public double bouse()
    {
        if(salary >= 100 && sex.equals("Female")||salary >= 100 && sex.equals("F"))
        {
            return salary * 0.20;
        }
        else if(salary >= 100 && sex.equals("M")||salary >= 100 && sex.equals("male"))
        {
            return salary * 0.15;
        }else{
                return salary *0.10;
         }
    }
    public double Total()
    {
        return salary + bouse();
    }
    public void Output()
    {
        System.out.println("ID = " + id);
        System.out.println("Name = " + name);
        System.out.println("Gender = " + sex);
        System.out.println("Salary = " + salary);
        System.out.println("Bouse = " + bouse()+"%");
        System.out.println("Total = "+ Total());
        
    }
    public int num()
    {
        return id;
    }
    public void Update()
    {
        System.out.print("Input New Id = ");
        id=sc.nextInt();
        sc.nextLine();
        System.out.print("Input New Name = ");
        name = sc.nextLine();
        System.out.print("Input New Gender = ");
        sex= sc.next();
        System.out.print("Input New Salary = ");
        salary= sc.nextFloat();
    }
}
