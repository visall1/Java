
import java.util.Scanner;


public class Test1 {
    public int id;
    public String name;
    public String sex;
    public float score;
    Scanner sc = new Scanner(System.in);
    public void Input()
    {
       
        System.out.print("Input ID = ");
        this.id=sc.nextInt();
         sc.nextLine();
        System.out.print("Input Name = ");
        this.name=sc.nextLine();
        System.out.print("Input Sex = ");
        this.sex=sc.next();
        System.out.print("Input Score = ");
        this.score=sc.nextFloat();
    }
    public void Output()
    {
        System.out.println("ID = "+ id);
        System.out.println("Name= "+ name);
        System.out.println("Sex = "+ sex);
        System.out.println("Score = "+score);
    }
    
    public static void main(String[] args) {
       Test1 stu = new Test1();
       stu.Input();
       stu.Output();
    }
    
}
