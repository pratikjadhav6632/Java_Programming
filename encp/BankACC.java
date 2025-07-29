package encp;

public class BankACC {
    private double balance;

    public double getBalance(){
        return balance;
    }

    public void deposite(double amount){
        if(amount >0){

            balance += amount;
        }else{
            System.out.println("Invalid amount");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <=balance){
            balance -= amount;
        }else{
            System.out.println("Invalid amount");
    }
    }
}
