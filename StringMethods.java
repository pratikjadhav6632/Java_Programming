import java.util.Arrays;

public class StringMethods{
    public static void main(String[]args){
        String str="Hello world   ";
        String str2="Hello World   ";
        System.out.println(str);

        //.length()
        System.out.println("Finding String length [str.length] : "+str.length());//14

        //.charAt()
        System.out.println("Finding Char using index [str.charAt(2)] : "+str.charAt(2));//l

        //.substring()
        System.out.println("Substring from index [str.substring(2)] : "+str.substring(2));//llo
         System.out.println("Substring in range  [str.substring(1,4)] : "+str.substring(1,4));//ell

        //.toLowerCase()
        System.out.println("Convet str to lowerCase [str.toLowereCase()] : "+str.toLowerCase());//hello world

         //.toUpperCase()
        System.out.println("Convet str to UpperCase [str.toLowereCase()] : "+str.toUpperCase());//HELLO WORLD

        //.trim()
        System.out.println("To remove staring and ending white spaces [str.trim()] : "+str.trim());//'Hello World'

        //.equals()
        System.out.println("Compare value of Two Strings [str.equals(str2)] : "+str.equals(str2)); //false (case sensitive)

        //.equalsIgnoreCase()
          System.out.println("Compare value of Two Strings [str.equalsIgnoreCase(str2)] : "+str.equalsIgnoreCase(str2)); //true (case insensitive)

        //.compareTo()
        System.out.println('w'+0); //119
        System.out.println('W'+0); //87
        System.out.println("Compare ASCII value of Two Strings [str.compareTo(str2)] : "+str.compareTo(str2));//32 (it checks all character ASCII values substract it with each other)

        //.contains()
        System.out.println("Check if if contain this Char [str.conatains('e')] : "+ str.contains("e"));//true

        //.startwith()
        System.out.println("Check String Start with this Char [str.startwith('He')] : "+str.startsWith("He"));//true

        //.endwith()
          System.out.println("Check String end with this Char [str.endsWith(' ')] : "+str.endsWith(""));//true

        //.indexOf()
        System.out.println("Find index of this Char [str.indexOf('l')] : "+str.indexOf('l'));//3

        //.lastIndexOf()
         System.out.println("Find last index of this Char [str.lastIndexOf('l')] : "+str.lastIndexOf('l'));//9

        //.matches()
        String str3="HelloWOrld123";
        System.out.println("String Matches with regex provided [str.matches('[a-zA-Z]*')] : "+str3.matches("[a-zA-Z0-9]*"));//true

        //.split()
        String str4="Apple banana guva";
        String [] part=str4.split(" ");
        System.out.println("Split the String [str4.split('')] : "+ Arrays.toString(part) );//[Apple,banana,guva]


        //.join()
        String joined=String.join("-","Apple","banana","guva");
        System.out.println("Join the String [str.join('-')]"+joined); //Apple-banana-guva
    }
}