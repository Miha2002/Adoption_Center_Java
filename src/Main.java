import Animals.*;
import Employees.*;
import Files.CSVWriter;
import Services.*;
import Files.CSVReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Service service = new Service();

        //Reading data from a CSV file
        CSVReader csvr = CSVReader.getInstance();
        try {
            csvr.reader(service);
        }
        catch(IOException e) {
            System.out.println("Error occurred!");
        }

        service.cs.showCats();
        System.out.println("\n");
        service.ds.showDogs();
        System.out.println("\n");
        service.os.showOthers();

        //Writing data in a CSV file
        CSVWriter csvw = CSVWriter.getInstance();
        Cat cat1 = new Cat("Fluff", "f", 10, 6, false, "tabby", "brown");

        csvw.cat(cat1);

//  -------------------------------------------------------------------

//        Cat cat1 = new Cat("Fluffy", "f", 10, 6, false, "tabby", "brown");
//        Cat cat2 = new Cat();
//        Dog dog1 = new Dog();
//        Other hamster1 = new Other();
//
//        System.out.println(cat1);
//        System.out.println(cat2);
//
//        service.cs.addCat(cat1);
//        service.cs.addCat(cat2);
//
//        AnimalKeeper k1 = new AnimalKeeper("Anna", 20, "cat");
//        Volunteer v1 = new Volunteer("Ted",2);
//
//        Item item1 = new Item("dog food", 20, 10);
//        k1.buy(item1);
//        v1.clean(2001);
//
//        Doctor doc = new Doctor("Addison", 20);
//        doc.RaiseSalary();
//        System.out.println(doc.getSalary());

    }
}
