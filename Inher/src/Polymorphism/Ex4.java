package Polymorphism;

public class Ex4 {
    private String name;
    private String address;
    private int number;
    public Ex4(String n,String a,int num){
        name=n;
        address=a;
        number = num;
    }
    public void Print(){
        System.out.println(name + "     "+address+"     "+number);
    }
    public String Print(String tel){
        return (name+"   "+address+"     "+number+"      "+tel);
    }
    public int Print(int n1,int n2){
        return this.number+n1+n2;
    }
    public static void main(String[] args) {
        Ex4 ex = new Ex4("Keo Visal","Phnom Penh",150);
        ex.Print();
        System.out.println("Print = "+ex.Print("ETEC"));
        System.out.println("Print = "+ ex.Print(15,50));
    }
    
}
