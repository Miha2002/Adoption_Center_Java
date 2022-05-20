package Employees;

public class AnimalKeeper extends Employee implements ChangeSalary{
    int salary = 2500;
    String assign_animal; //the specific species that they take care of

    public AnimalKeeper(String name, int age, String assign_animal) {
        super(name, age);
        this.assign_animal = assign_animal;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getAssign_animal() {
        return assign_animal;
    }

    public void setAssign_animal(String assign_animal) {
        this.assign_animal = assign_animal;
    }
}
