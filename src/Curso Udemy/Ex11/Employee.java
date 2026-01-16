package Ex11;

public class Employee {
    String name;
    double grossSalary;
    double tax;

    public double NetSalary(){
        return grossSalary - tax;
    }

    public void IncreaseSalary(double percentage){
        grossSalary += grossSalary * (percentage/100);
        System.out.printf("Employee: %s, $ %.2f%n",name,NetSalary());
    }
}
