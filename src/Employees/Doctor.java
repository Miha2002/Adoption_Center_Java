package Employees;

public class Doctor extends Employee implements ChangeSalary{
    int salary = 4000;

    public Doctor(String name, int age) {
        super(name, age);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
