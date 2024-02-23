import java.util.*;
public class hashTable3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Hashtable<String,String> h= new Hashtable<>(); 
       Hashtable<String,String> h1= new Hashtable<>();
       
       h.put("ETEC1001", "SOK DARA");
       h.put("ETEC1002", "Va Sytthong");
       h.put("ETEC1003", "Song Tona");
       
       h1=(Hashtable<String,String>)h.clone();
       System.out.println("Values in clone: "+h1);
       h.clear();
       System.out.println("after clearing: "+h);
       

    }
    
}
