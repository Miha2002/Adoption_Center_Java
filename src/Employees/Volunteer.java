package Employees;

import Animals.*;

public class Volunteer extends Employee implements Work{

    public Volunteer(String name, int age) {
        super(name, age);
    }

    public void clean(int id) {
        int x = id / 1000;
        int y = id % 1000;

        if ((y != 0) && ((x == 1 && y <= Dog.getCount_dog()) || (x == 2 && y<= Cat.getCount_cat()) || (x == 3 && y<= Other.getCount_other())))
            System.out.println("The enclosure of the animal with the ID "+id+" is clean.\n");
        else
            System.out.println("No animal has this ID.");
    }

    public void buy(Item x) {
        System.out.println("The worker will buy: "+x.getQuantity()+" of "+x.getName()
                +" and the price is"+(x.getQuantity() * x.getPrice())+".\n");
    }
}
