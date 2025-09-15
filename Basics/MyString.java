package Basics;

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

        String a=new String("Ram"); //assign new memory reference
        String b= new String("Ram"); //assign new memory reference

        String c="Ram"; //assign same memory reference
        String d="Ram"; //assign same memory reference

        //String comparison

        System.out.println(a==b);//false (==) It checks reference

        System.out.println(a.equals(b));//true  (.equals()) it checks value

        System.out.println(c==d);//true 

        StringBuilder sb=new StringBuilder("Hello");
        
        for(int i=0;i<sb.length()/2;i++){
            int front=i;
            int back=sb.length()-1-i;

            char frontChar=sb.charAt(front);
            char backChar=sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);

        }
        System.out.println(sb);
        
        

    }
}
