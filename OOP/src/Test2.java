
import java.util.Scanner;


public class Test2 {
    private int x;
    private int y;
    private int z;
    public void Input()
    {
        System.out.print("Input Value X = ");
        x=sc.nextInt();
        System.out.print("Input Value Y = ");
        y=sc.nextInt();
        System.out.print("Input Value Z = ");
        z=sc.nextInt();
    }
    private int Sum()
    {
        return x+y+z;
    }
    private int Sub()
    {
        return x-y/z;
    }
    public void Output()
    {
        System.out.println("X= "+x+" Y= "+y+" Z= "+z);
        System.out.println("Sum = "+Sum());
        System.out.println("Sub = "+ Sub());
    }
    Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
       Test2 T= new Test2();
       T.Input();
       T.Output();
    }
    
}
