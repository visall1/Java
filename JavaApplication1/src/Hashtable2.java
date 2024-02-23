import java.util.*;
public class Hashtable2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Hashtable<Integer,String> hm = new Hashtable<>();
       
        hm.put(100, "RUPP");
        hm.put(101, "SETEC");
        hm.put(102, "ITC");
        hm.put(103, "NORTON");
        hm.put(104, "AEU");
        hm.put(105, "NIPTEC");
        
        for(Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println("Before remove: "+hm);
        hm.remove(102);
        System.out.println("After remove: "+hm);
    }
    
}
