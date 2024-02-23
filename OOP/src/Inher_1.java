
import java.util.Scanner;
class Person{
    Scanner Input = new Scanner(System.in);
    protected int id;
    protected String name;
    protected String sex;
    Person(){
        this.id=0;
        this.name="N/A";
        this.sex="N/A";
    }
    Person(int i,String n,String s){
        this.id=i;
        this.name=n;
        this.sex=s;
    }
    public void Input(){
        System.out.print("Input ID = ");
        id= Input.nextInt();
        System.out.print("Input Name = ");
        name = Input.next();
        System.out.print("Input Sex = ");
        sex = Input.next();
    }
    public void Output(){
        System.out.println("ID = "+id);
        System.out.println("Name = "+name);
        System.out.println("Sex = "+sex);
    }
}
class Employees extends Person{
    private float salary;
    public void Input(){
        super.Input();
        System.out.print("Input Salary = ");
        salary = Input.nextFloat();
    }
    public void Output(){
        super.Output();
        System.out.println("Salary = "+salary);
    }
}
class Students extends Person{
    private float score;
    public void Input(){
        super.Input();
        System.out.print("Input score = ");
        score = Input.nextFloat();
    }
    public void Output(){
        super.Output();
        System.out.println("Score = "+score);
    }
}
public class Inher_1 {
    public static void main(String[] args) {
        Employees emp = new Employees();
        Students stu = new Students();
        stu.Input();
        stu.Output();
        emp.Input();
        emp.Output();
    }
    
}
