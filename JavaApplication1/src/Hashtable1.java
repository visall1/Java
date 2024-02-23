import java.util.*;
public class Hashtable1 {
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
    }
    
}
