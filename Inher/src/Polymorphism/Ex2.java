
package Polymorphism;
import java.util.*;
public class Ex2 {
    private String name;
    private String address;
    private int number;
    public Ex2(String n,String a,int num){
        name=n;
        address = a;
        number = num;
    }
    public Ex2(){
        name="N/A";
        address="N/A";
        number = 0;
    }
    public Ex2(int num){
        name="N/A";
        address="N/A";
        number = num;
    }
    public Ex2(String n,int num){
        name=n;
        address="N/A";
        number = num;
    }
    public void Print(){
        System.out.println(name+"    "+address+"    "+ number);
    }
    public static void main(String[] args) {
        Ex2 ex;
        ex=new Ex2("Visal","Phnom Penh",150);
        ex.Print();
        ex=new Ex2();
        ex.Print();
        ex=new Ex2("Nika",50);
        ex.Print();
    }
    
}
