package BankChallenge;

import java.util.Objects;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice = -1;

        System.out.println("Bank.main");
        Account account = new Account();
        System.out.println("Enter a account number: ");
        account.setNumberaccount(scan.nextInt());
        scan.nextLine();
        System.out.println("Enter a account holder: ");
        account.setName(scan.nextLine());
        System.out.println("Is there na initial deposit (y/n)?");
        String initialDeposit = scan.nextLine();
        if (Objects.equals(initialDeposit, "y")){
            System.out.println("Enter a value to initial deposit: ");
            account.setBalance(account.getBalance() + scan.nextDouble());
        }
        System.out.println(account);
        System.out.println("Enter a deposit value: ");
        account.setBalance(account.getBalance() + scan.nextDouble());
        System.out.println(account);
        System.out.println("Enter a withdraw value: ");
        account.setBalance(account.getBalance() - scan.nextDouble() - 5);
        System.out.println(account);

        //while(choice != 0 && choice < 3){}











        scan.close();
    }
}
