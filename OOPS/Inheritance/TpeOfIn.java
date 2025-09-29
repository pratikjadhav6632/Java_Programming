package OOPS.Inheritance;

public class TpeOfIn {
    String name;
    String age;

    public void sound(){
        System.out.println("Animal sound..");
    }
    public void type(){
        System.out.println("Animal");
    }
    public static void main(String[] args) {
        TpeOfIn tp=new TpeOfIn();
        tp.sound();
        tp.age="10";

        mammal ml=new mammal();
        ml.sound();
        ml.name="Dabby";

        Dog dg=new Dog();
        dg.leg(4);
        dg.name="Dobby";
    }
}

class mammal extends TpeOfIn{
    public void leg(int leg){
        System.out.println(leg);
    }
    
}

class Dog extends mammal {
    public void breed(String breed){
        System.out.println(breed);
    }
    
}



    

 