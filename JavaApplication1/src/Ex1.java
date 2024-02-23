import java.util.*;
public class Ex1 {
   
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        Hashtable<Integer,Studentt> hm = new Hashtable<>();
        int i,n,op = 0;
        do{
            System.out.println("1 >> Input");
            System.out.println("2 >> Ouput");
            System.out.println("3 >> Search");
            System.out.println("Please Choose One = ");
            op = sc.nextInt();
            switch(op)
            {
                case 1:
                {
                    System.out.print("Input N = ");
                    n=sc.nextInt();
                    for(i=0;i<n;i++)
                    {
                        Studentt stu = new Studentt();
                        stu.Input();
                        hm.put(i, stu);
                    }
                }break;
                case 2:
                {
                    for(Map.Entry<Integer,Studentt> stu : hm.entrySet())
                    {
                        stu.getValue().Output();
                    }
                }break;
                case 3:
                {
                    System.out.println("Input Value TO Search  = ");
                    int svalue=sc.nextInt();
                    for(Map.Entry<Integer,Studentt> stu : hm.entrySet())
                    {
                        if(svalue == stu.getValue().getnum())
                        {
                            stu.getValue().Output();
                        }
                    }
                }
            }
        }while( op != 0);
    }
    
}
