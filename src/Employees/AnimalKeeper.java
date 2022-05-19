package Employees;

public class AnimalKeeper extends Employee implements ChangeSalary{
    int salary = 2500;
    String assignAnimal; //the specific species that they take care of

    public AnimalKeeper(String name, int age, String assignAnimal) {
        super(name, age);
        this.assignAnimal = assignAnimal;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getAssignAnimal() {
        return assignAnimal;
    }

    public void setAssignAnimal(String assignAnimal) {
        this.assignAnimal = assignAnimal;
    }
}
