import java.util.*;
public class Books{
    Scanner sc = new Scanner(System.in);
    private int code;
    private String title;
    private String subject;
    private float price;
    public Books(){
        this.code=0;
        this.title="N/A";
        this.subject="N/A";
        this.price=0;
    }
    public Books(int c,String t,String s,float p){
        this.code=c;
        this.title=t;
        this.subject=s;
        this.price=p;
    }
    public int getCode(){
        return code;
    }
    public void setTitle(String t){
        this.title=t;
    }
    public void setSubject(String s){
        this.subject=s;
    }
    public void Price(float p){
        this.price=p;
    }
    public void Input(){
        System.out.print("Input Code = ");
        code=sc.nextInt();
        sc.nextLine();
        System.out.print("Input Title = ");
        title = sc.nextLine();
        System.out.print("Input Subject = ");
        subject = sc.next();
        System.out.print("Input Price = ");
        price = sc.nextFloat();
    }
   public void Output(){
        System.out.println("Code = "+code);
        System.out.println("Title = "+title);
        System.out.println("Subject = "+subject);
        System.out.println("Price = "+price);
    }
   
}
