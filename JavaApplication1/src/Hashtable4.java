import java.util.*;
public class Hashtable4 {

    public static void main(String[] args) {
        Map<Integer,Book> map = new Hashtable<Integer,Book>();
        Book b1=new Book(101,"C/C++","Kro IT Chet Laor","ETEC1",8);
        Book b2=new Book(102,"HTML,CSS,Boostratpr","Kro IT Chet Laor","ETEC2",4);
        Book b3=new Book(103,"Java Progamming","Kro IT Chet Laor","ETEC3",6);
        map.put(1, b1);
        map.put(2, b2);
        map.put(3, b3);

        for(Map.Entry<Integer,Book> entry:map.entrySet()){
            int key=entry.getKey();
            Book b=entry.getValue();
            System.out.println(key+" Details: ");
            System.out.println(b.id+"   "+b.author+"    "+b.publisher+" "+b.quantity);
        }
    
    }
    
}
