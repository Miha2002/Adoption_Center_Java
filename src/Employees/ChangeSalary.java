package Employees;
import java.util.Scanner;

public interface ChangeSalary {
    Scanner scanner = new Scanner(System.in);

    private void RaiseSalary(int salary){
        System.out.println("The employee's current salary is: "+salary+". How much is the raise? (percentage)\n");
        int s = scanner.nextInt();
        salary = salary + salary * (s/100);
        System.out.println("The new salary is: "+salary+".\n");
    }

    private void LowerSalary(int salary){
        System.out.println("The employee's current salary is "+salary+". How much is the pay cut? (percentage)");
        int s = scanner.nextInt();
        salary = salary - salary * (s/100);
        System.out.println("The new salary is: "+salary+".\n");
    }
}
