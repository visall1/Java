
package Polymorphism;
class Animal{
    public void move(){
        System.out.println("Animes can move");
    }
}
class Dog extends Animal{
    public void move()
    {
        super.move();
        System.out.println("Dogs can walk and run");
    }
}
class Fish extends Animal{
    public void move(){
        System.out.println("Fish can trvel in water");
    }
}
public class Ex3 {
    public static void main(String[] args) {
       Animal b= new Dog();
       b.move();
       Animal b1= new Animal();
       b1.move();
    }
    
}
