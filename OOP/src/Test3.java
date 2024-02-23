import java.util.*;
public class Test3 {
    private int x;
    private int y;
    private int z;
    public Test3()
    {
        this.x=0;
        this.y=0;
        this.z=0;
    }
    public Test3(int a,int b,int c)
    {
        this.x=a;
        this.y=b;
        this.z=c;
    }
    private int sum()
    {
        return x+y+z;
    }
    private int sub()
    {
        return x-y/z;
    }
    public void Output()
    {
        System.out.println("X= "+x+" Y= "+y+" Z= "+z);
        System.out.println("Sum = "+sum());
        System.out.println("Sub = "+sub());
    }
};
class DemoTest3{
    public static void main(String args[])
    {
        Test3 T = new Test3();
        T = new Test3(12,30,3);
        T.Output();
    }
};

