
import java.util.Scanner;
class Person{
    Scanner sc = new Scanner(System.in);
    protected int id;
    protected String name;
    protected String sex;
    protected String Address;
    protected String DOB;
    Person(){
        this.id=0;
        this.name="N/A";
        this.sex="N/A";
        this.Address="N/A";
        this.DOB="N/A";
    }
    Person(int i,String n,String s,String a,String d){
        this.id=i;
        this.name=n;
        this.sex=s;
        this.Address=a;
        this.DOB=d;
    }
    public void Input(){
        System.out.print("Input ID = ");
        id=sc.nextInt();
        System.out.print("Input Name = ");
        name = sc.next();
        System.out.print("Input Sex = ");
        sex = sc.next();
        System.out.print("Input Address = ");
        Address = sc.next();
        System.out.print("Input DOB =");
        DOB = sc.next();
    }
    public void Output(){
        System.out.println("ID = "+id);
        System.out.println("Name= "+name);
        System.out.println("Sex = "+sex);
        System.out.println("Address = "+Address);
        System.out.println("DOB = "+DOB);
    }
}
class Employee extends Person{
    private float salary;
    Employee(){
        super();
        this.salary=0;
    }
    Employee(float sa,int i,String n,String s,String a,String d){
        this.salary=sa;
        this.id=i;
        this.name=n;
        this.sex=s;
        this.Address=a;
        this.DOB=d;
    }
    public void Input(){
        super.Input();
        System.out.print("Input Salary = ");
        salary = sc.nextFloat();
    }
    public void Output(){
        super.Output();
        System.out.println("Salary = "+salary);
    }
}
class Student extends Person{
    protected float score;
    Student(){
        super();
        this.score=0;
    }
    Student(float sc,int i,String n,String s,String a,String d){
        this.score=sc;
        this.id=i;
        this.name=n;
        this.sex=s;
        this.Address=a;
        this.DOB=d;
    }
    public void Input(){
        super.Input();
        System.out.print("Input Score = ");
        score = sc.nextFloat();
    }
    public void Output(){
        super.Output();
        System.out.println("Score = "+score);
    }
}
class Teacher extends Student{
    private String subject;
    private String RoomNO;
    Teacher(){
        super();
        this.subject="N/A";
        this.RoomNO="N/A";
    }
    Teacher(String su,String r,float sc,int i,String n,String s,String a,String d){
        this.subject=su;
        this.RoomNO=r;
        this.score=sc;
        this.id=i;
        this.name=n;
        this.sex=s;
        this.Address=a;
        this.DOB=d;
    }
    public void Input(){
        super.Input();
        System.out.print("Input Subject = ");
        subject = sc.next();
        System.out.print("Input RoomNO = ");
        RoomNO=sc.next();
    }
    public void Output(){
        super.Output();
        System.out.println("Subject = "+subject);
        System.out.println("RoomNo = "+RoomNO);
    }
}
public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,n,op = 0;
        do{
            System.out.println("1 >> Employee Information");
            System.out.println("2 >> Student Information");
            System.out.println("3 >> Teacher Information");
            System.out.print("Choose One Option = ");
            op = sc.nextInt();
            switch(op)
            {
                case 1:{
                      Employee emp = new Employee();
                      emp.Input();
                      emp.Output();
                }break;
                case 2:{
                    Student stu = new Student();
                    stu.Input();
                    stu.Output();
                }break;
                case 3:
                {
                    Teacher t=new Teacher();
                    t.Input();
                    t.Output();
                }break;
                default: System.out.print(op +"Not found....!");
            }
        }while(op != 0);
    }
    
}
