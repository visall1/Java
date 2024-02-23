import java.util.*;
public class TestBook {
    Scanner sc= new Scanner(System.in);
public int Search(Books book[],int n){
    int scode,i;
    int index=-1;
    int b=0;
    System.out.println("Input Book code To Search = ");
    scode= sc.nextInt();
    for(i=0;i<n;i++){
        if(scode == book[i].getCode())
            book[i].Output();
            index=i;
            b=1;
            break;
    }
    if(b==0){
        System.out.print("Search Not Found ...!");
    }
    return index;
    
}
public void Update(Books book[],int n){
    int index = Search(book, n);
    String ntitle,nsub;
    float nprice;
    if(index !=-1){
        System.out.print("Input New Title = ");
        ntitle = sc.next();
        System.out.print("Input New Subject = ");
        nsub= sc.next();
        System.out.print("Input New Price = ");
        nprice = sc.nextFloat();
        System.out.println("Update Completed.....!");
    }
    else{
        System.out.print("Invalid Update....!");
    }
}
public void Sort(Books []book,int n){
    Books temp = new Books();
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(book[i].getCode() > book[j].getCode())
            {
                temp=book[i];
                book[i]=book[j];
                book[j]=temp;
            }
        }
    }
    for(int i=0;i<n;i++){
        book[i].Output();
    }
    System.out.println("Sort Succesful");
}
public TestBook(){
    int op = 0,n = 0,i;
    String st;
    Books []book = new Books[20];
    do{
        System.out.println("1. Input ");
        System.out.println("2. Output ");
        System.out.println("3. Search ");
        System.out.println("4. Update ");
        System.out.println("5. Sort ");
        System.out.print("Choose One Option = ");
        op = sc.nextInt();
        switch(op){
            case 1:{
                System.out.print("Input Number Array = ");
                n = sc.nextInt();
                for(i=0;i<n;i++){
                    book[i]= new Books();
                    book[i].Input();
                }
            }break;
            case 2:{
                for(i=0;i<n;i++){
                    book[i].Output();
                }
            }break;
            case 3:
            {
                Search(book, n);
            }break;
            case 4:
                Update(book, n);
            break;
            case 5:
                Sort(book, n);
        }
    }while(op != 0);
}
    public static void main(String[] args) {
        new TestBook();
    }
    
}
