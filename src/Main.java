import Animals.*;

import java.util.ArrayList;
import java.util.List;

//import java.util.Scanner;
//Scanner scanner = new Scanner(System.in);

public class Main {
    public static void main(String[] args) {



        Cat cat1 = new Cat("Fluffy", "f", 10, 6, false, "tabby", "brown");
        Cat cat2 = new Cat();
        Dog dog1 = new Dog();

        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(dog1.getCount());

    }
}
