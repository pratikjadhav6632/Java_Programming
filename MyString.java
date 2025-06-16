public class MyString {
    public static void main(String[] args){
        String name ="Pratik";
        System.out.println(name);

        Student mystudent=new Student();
        mystudent.Name="ajay";
        mystudent.Add="India";
        mystudent.Age=20;
        mystudent.Standard=12;

        System.out.println(mystudent.Name);

        String a=new String("Ram"); //assign new memory location
        String b= new String("Ram"); //assign new memory location

        String c="Ram"; //assign same memory location
        String d="Ram"; //assign same memory location

        System.out.println(a==b);//false
        System.out.println(c==d);//true 

    }
}
