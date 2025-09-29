package OOPS.Encapsulation;
public class BankAccount {
   public String username ;
   private String password;
   private int AccNo;
   
   void setPwd(String pwd){
     this.password=pwd;
   }

   String getPwd(){
        return this.password;
   }

   void setAccNo(int AccNo){
        this.AccNo=AccNo;
   }
   int getAccNo(){
        return this.AccNo;
   }
}

class Info extends BankAccount{
    public static void main(String[] args) {
        BankAccount b1 =new BankAccount();
        b1.username="raj";
        b1.setPwd("jdajksdas");
        b1.setAccNo(5482163);
        System.out.println("Username : "+ b1.username);
        System.out.println("Password : "+b1.getPwd());
        System.out.println("Account No : "+b1.getAccNo());

}

}