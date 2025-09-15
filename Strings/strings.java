package Strings;

public class strings {
    public static void main(String[] args) {

        String str="Hello";
        System.out.println(str);

        String str2 =new String("Hello");

        System.out.println(str2);

        //String Builder
        StringBuilder sb=new StringBuilder("Hello");

        //append
        sb.append(" world");
        System.out.println(sb);

        //insert
        sb.insert(sb.length()," !");
        System.out.println(sb);

        //delete
        sb.delete(5,8);
        System.out.println(sb);
    }
}
