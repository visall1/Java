
import java.util.Scanner;


public class dictionary {
    Scanner sc = new Scanner(System.in);
    String Word;
    String speech;
    String Desciption;
    public void Input()
    {
       // sc.nextLine();
        System.out.print("Input Word : ");
        Word = sc.nextLine();
        System.out.print("Input Speech : ");
        speech = sc.nextLine();
        System.out.print("Input Descriptoin : ");
        Desciption = sc.nextLine();
    } 
    public String GetWord()
    {
        return Word;
    }
    public void Output()
    {
        System.out.println("Word : "+ Word);
        System.out.println("Speech : "+ speech);
        System.out.println("Description: "+ Desciption);
    }
}
