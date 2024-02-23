
package Polymorphism;
import java.util.*;
public class Employee {
    private String name;
    private String address;
    private int number;
    public Employee(String n,String a,int num){
        name=n;
        address=a;
        number=num;
    }
    public void Print(){
        System.out.print(name+"     "+ address+"    "+number);
    }
    public String Print(String tel){
        return (name+"     "+ address+"    "+number+ "    "+tel);
    }
    public int Print(int n1,int n2){
        return this.number+n1+n2;
    }
    public static void main(String[] args) {
        Employee emp = new Employee("Sok Dara","Phnom Penh",150);
        emp.Print();
        System.out.println("Print = "+emp.Print("ETEC"));
        System.out.println("Print = "+emp.Print(15,50));
    }
    
}
