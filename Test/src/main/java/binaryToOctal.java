
import java.util.Scanner;


public class binaryToOctal {
    Scanner sc = new Scanner(System.in);
    int binary;
    void Input(){
        System.out.println("Enter the Binary Number : ");
         binary=sc.nextInt();
        
         
    }
    int Octal(){
        int octal = 0;
        int i=0;
        while(binary!= 0){
            octal+=(binary%10)*Math.pow(2, i);
            binary/=10;
            i++;
        }
        return octal;
        
    }
    void Output()
    {
        System.out.println("Element of Octal: "+Octal());
    }
    public binaryToOctal(){
        Input();
        Output();
    }
    public static void main(String[] args) {
       new binaryToOctal();
    }
    
}
