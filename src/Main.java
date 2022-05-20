import Animals.*;
import Employees.*;
import Services.*;

//import java.util.Scanner;
//Scanner scanner = new Scanner(System.in);

public class Main {
    public static void main(String[] args) {



        Cat cat1 = new Cat("Fluffy", "f", 10, 6, false, "tabby", "brown");
        Cat cat2 = new Cat();
        Dog dog1 = new Dog();
        Other hamster1 = new Other();

//        System.out.println(cat1);
//        System.out.println(cat2);

        Service service = new Service();

        service.cs.addCat(cat1);
        service.cs.addCat(cat2);
        service.cs.showCats();

        AnimalKeeper k1 = new AnimalKeeper("Anna", 20, "cat");
        Volunteer v1 = new Volunteer("Ted",2);

        Item item1 = new Item("dog food", 20, 10);
        k1.buy(item1);
        v1.clean(2001);

    }
}
