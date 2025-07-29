package encp;

public class test {
    public static void main(String[] args) {
        BankACC bankacc=new BankACC();
        bankacc.deposite(10);
        bankacc.withdraw(8);
        bankacc.deposite(100);
        System.out.println("Total balance  "+bankacc.getBalance());
    }
}
