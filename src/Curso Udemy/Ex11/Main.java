package Ex11;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        Employee Emp = new Employee();

        System.out.println("Enter the name, gross salary and the tax of descount of the Employee:");
        Emp.name = scan.nextLine();
        Emp.grossSalary = scan.nextDouble();
        Emp.tax = scan.nextDouble();

        System.out.printf("Employee: %s, %.2f%n", Emp.name,Emp.NetSalary());
        System.out.println("Which percentage to increase salary?");
        double percentage = scan.nextDouble();
        Emp.IncreaseSalary(percentage);
    }
}
