package BankChallenge;

public class Account {
    private int Numberaccount;
    private String name;
    private double balance;

    public Account(int Numberaccount, String name, double balance) {
        this.Numberaccount = Numberaccount;
        this.name = name;
        this.balance = balance;
    }

    public Account() {

    }

    public int getNumberaccount() {
        return Numberaccount;
    }

    public void setNumberaccount(int numberaccount) {
        this.Numberaccount = numberaccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double deposit(double valor){
        balance = getBalance() + valor;
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "account=" + Numberaccount +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
