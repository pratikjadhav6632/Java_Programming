package OOPS.Inheritance;
public class Animal {
    String Name;
    String Type;
    
    public void eat(){
        System.out.println("Eating....");
    }

    public void sound(String sound){
       
        System.out.println(sound);
    }
   public void type(){
    System.out.println("Animal");
   }
   
}
class Dog extends Animal{
    String name="Dobby";
    String Type="Hybrid";
      public static void sound(){
            System.out.println("woof");
        }
    public static void main(String[] args) {  
        Animal Dobby=new Animal();
        Dobby.eat();
        sound();
        Dobby.type();
        Dobby.sound("woofffff");
    }

}