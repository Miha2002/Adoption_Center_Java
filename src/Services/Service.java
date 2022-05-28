package Services;

import Animals.*;
import Employees.*;

import java.util.Scanner;

public class Service {
    public CatService cs = new CatService();
    public DogService ds = new DogService();
    public OtherService os = new OtherService();
    public AnimalKeeperService aks = new AnimalKeeperService();
    public DoctorService docs = new DoctorService();
    public VolunteerService vs = new VolunteerService();

    Scanner scanner = new Scanner(System.in);

//    private void clearConsole() {
//        System.out.print("\033[H\033[2J");
//        System.out.flush();
//    }

    public void start() {
        System.out.println("""
                Welcome to our Animal Adoption Center!
                What would you like to see?
                1 - Animals
                2 - Employees
                """);
        int x = scanner.nextInt();
        switch (x) {
            case 1 -> goToAnimals();
            case 2 -> goToEmployees();
            default -> {
                System.out.println("Error: Incorrect number. Try again!\n");
                start();
            }
        }
    }

    private void goToAnimals() {
        System.out.println("""
                What animal are you searching for?
                1 - Dog
                2 - Cat
                3 - Other
                4 - I want to see all animals
                0 - BACK""");
        int x = scanner.nextInt();
        switch (x) {
            case 1 -> goToDogs();
            case 2 -> goToCats();
            case 3 -> goToOthers();
            case 4 -> {
                ds.showDogs(); System.out.println("\n");
                cs.showCats(); System.out.println("\n");
                os.showOthers(); System.out.println("\n");
                System.out.println("1 - to continue.\n");
                if (scanner.next() != null)
                    goToAnimals();
            }
            case 0 -> start();
            default -> {
                System.out.println("Error: Incorrect number. Try again!\n");
                goToAnimals();
            }
        }
    }

    private void goToDogs() {
        System.out.println("""
                What would you like to do?
                1 - Add a dog
                2 - Find a dog using ID
                3 - Delete a dog using ID
                4 - Show all dogs
                0 - BACK
                """);
        int x = scanner.nextInt();
        switch (x) {
            case 1 -> {
                Dog dog = new Dog();

                System.out.println("Name: ");
                dog.setName(scanner.next());
                System.out.println("Sex: ");
                dog.setSex(scanner.next());
                System.out.println("Age: ");
                dog.setAge(scanner.nextInt());
                System.out.println("Weight: ");
                dog.setWeight(scanner.nextFloat());
                System.out.println("Is it trained? ");
                dog.setTrained(scanner.nextBoolean());
                System.out.println("Breed:");
                dog.setBreed(scanner.next());
                System.out.println("""
                        Weight category?
                        0 - small dog
                        1 - medium dog
                        2 - big dog
                        """);
                dog.setCategory(scanner.nextInt());

                ds.addDog(dog);
                goToDogs();
            }
            case 2 -> {
                System.out.println("What's the dog's ID?\n");
                x = scanner.nextInt();
                System.out.println(ds.getDogById(x) + "\n");
                goToDogs();
            }
            case 3 -> {
                System.out.println("What's the dog's ID?\n");
                x = scanner.nextInt();
                ds.deleteDogById(x);
                goToDogs();
            }
            case 4 -> {
                ds.showDogs();
                goToDogs();
            }
            case 0 -> goToAnimals();

            default -> {
                System.out.println("Error: Incorrect number. Try again!\n");
                goToDogs();
            }
        }
    }

    private void goToCats() {
        System.out.println("""
                What would you like to do?
                1 - Add a cat
                2 - Find a cat using ID
                3 - Delete a cat using ID
                4 - Show all cats
                0 - BACK
                """);
        int x = scanner.nextInt();
        switch (x) {
            case 1 -> {
                Cat cat = new Cat();

                System.out.println("Name: ");
                cat.setName(scanner.next());
                System.out.println("Sex: ");
                cat.setSex(scanner.next());
                System.out.println("Age: ");
                cat.setAge(scanner.nextInt());
                System.out.println("Weight: ");
                cat.setWeight(scanner.nextFloat());
                System.out.println("Is it trained? ");
                cat.setTrained(scanner.nextBoolean());
                System.out.println("Fur pattern:");
                cat.setFur_pattern(scanner.next());
                System.out.println("Fur color:");
                cat.setFur_color(scanner.next());

                cs.addCat(cat);
                goToCats();
            }
            case 2 -> {
                System.out.println("What's the cat's ID?\n");
                x = scanner.nextInt();
                System.out.println(cs.getCatById(x) + "\n");
                goToCats();
            }
            case 3 -> {
                System.out.println("What's the cat's ID?\n");
                x = scanner.nextInt();
                cs.deleteCatById(x);
                goToCats();
            }
            case 4 -> {
                cs.showCats();
                goToCats();
            }
            case 0 -> goToAnimals();
            default -> {
                System.out.println("Error: Incorrect number. Try again!\n");
                goToCats();
            }
        }
    }

    private void goToOthers() {
        System.out.println("""
                What would you like to do?
                1 - Add another animal
                2 - Find an animal using ID
                3 - Delete an animal using ID
                4 - Show all other animals
                0 - BACK
                """);
        int x = scanner.nextInt();
        switch (x) {
            case 1 -> {
                Other other = new Other();

                System.out.println("Name: ");
                other.setName(scanner.next());
                System.out.println("Sex: ");
                other.setSex(scanner.next());
                System.out.println("Age: ");
                other.setAge(scanner.nextInt());
                System.out.println("Weight: ");
                other.setWeight(scanner.nextFloat());
                System.out.println("Is it trained? ");
                other.setTrained(scanner.nextBoolean());
                System.out.println("Species: ");
                other.setSpecies(scanner.next());

                os.addOther(other);
                goToOthers();
            }
            case 2 -> {
                System.out.println("What's the animal's ID?\n");
                x = scanner.nextInt();
                System.out.println(os.getOtherById(x) + "\n");
                goToOthers();
            }
            case 3 -> {
                System.out.println("What's the animal's ID?\n");
                x = scanner.nextInt();
                os.deleteOtherById(x);
                goToOthers();
            }
            case 4 -> {
                os.showOthers();
                goToOthers();
            }
            case 0 -> goToAnimals();
            default -> {
                System.out.println("Error: Incorrect number. Try again!\n");
                goToOthers();
            }
        }
    }

    private void goToEmployees() {
        System.out.println("""
                What do you want to do?
                1 - Add an employee
                2 - Delete an employee by name
                3 - Find employee by name
                4 - I want to see all employees
                5 - Wash the animal
                6 - Clean the animal's enclosure
                0 - BACK
                """);
        int x = scanner.nextInt();
        switch (x) {
            case 1 -> addEmployee();
            case 2 -> deleteEmployee();
            case 3 -> findEmployee();
            case 4 -> {
                aks.showAnimalKeepers(); System.out.println("\n");
                docs.showDoctors(); System.out.println("\n");
                vs.showVolunteers(); System.out.println("\n");
                System.out.println("1 - to continue.\n");
                if (scanner.next() != null)
                    goToEmployees();
            }
            case 5 -> {
                System.out.println("What's the employee's ID?");
                int id_emp = scanner.nextInt();
                System.out.println("How about the animal's ID?");
                aks.wash(id_emp,scanner.nextInt());
                System.out.println("1 - to continue.\n");
                if (scanner.next() != null)
                    goToEmployees();
            }
            case 6 -> {
                System.out.println("What's the employee's ID?");
                int id_emp = scanner.nextInt();
                System.out.println("How about the animal's ID?");
                vs.clean(id_emp,scanner.nextInt());
                System.out.println("1 - to continue.\n");
                if (scanner.next() != null)
                    goToEmployees();
            }
            case 0 -> start();
            default -> {
                System.out.println("Error: Incorrect number. Try again!\n");
                goToEmployees();
            }
        }
    }

    private void addEmployee() {
        System.out.println("""
                        What's the employee's job?
                        1 - Animal Keeper
                        2 - Doctor
                        3 - Volunteer
                        0 - BACK
                        """);
        int x = scanner.nextInt();
        switch (x) {
            case 1 -> {
                AnimalKeeper ak = new AnimalKeeper();

                System.out.println("Name: ");
                ak.setName(scanner.next());
                System.out.println("Age: ");
                ak.setAge(scanner.nextInt());
                System.out.println("Assign animal: ");
                ak.setAssign_animal(scanner.next());

                aks.addAnimalKeeper(ak);
                goToEmployees();
            }
            case 2 -> {
                Doctor d = new Doctor();

                System.out.println("Name: ");
                d.setName(scanner.next());
                System.out.println("Age: ");
                d.setAge(scanner.nextInt());

                docs.addDoctor(d);
                goToEmployees();
            }
            case 3 -> {
                Volunteer v = new Volunteer();

                System.out.println("Name: ");
                v.setName(scanner.next());
                System.out.println("Age: ");
                v.setAge(scanner.nextInt());

                vs.addVolunteer(v);
                goToEmployees();
            }
            case 4 -> goToEmployees();
            case 0 -> {
                System.out.println("Error: Incorrect number. Try again!\n");
                addEmployee();
            }
        }
    }

    private void deleteEmployee() {
        System.out.println("""
                        What's the employee's job?
                        1 - Animal Keeper
                        2 - Doctor
                        3 - Volunteer
                        0 - BACK
                        """);
        int x = scanner.nextInt();
        switch (x) {
            case 1 -> {
                System.out.println("What's the employee's ID?");
                aks.deleteAnimalKeeperById(scanner.nextInt());
                goToEmployees();
            }
            case 2 -> {
                System.out.println("What's the employee's ID?");
                docs.deleteDoctorById(scanner.nextInt());
                goToEmployees();
            }
            case 3 -> {
                System.out.println("What's the employee's ID?");
                vs.deleteVolunteerById(scanner.nextInt());
                goToEmployees();
            }
            case 4 -> goToEmployees();
            case 0 -> {
                System.out.println("Error: Incorrect number. Try again!\n");
                addEmployee();
            }
        }
    }

    private void findEmployee() {
        System.out.println("""
                        What's the employee's job?
                        1 - Animal Keeper
                        2 - Doctor
                        3 - Volunteer
                        0 - BACK
                        """);
        int x = scanner.nextInt();
        switch (x) {
            case 1 -> {
                System.out.println("What's the employee's ID?");
                System.out.println(aks.getAnimalKeeperById(scanner.nextInt()));
                goToEmployees();
            }
            case 2 -> {
                System.out.println("What's the employee's ID?");
                System.out.println(docs.getDoctorById(scanner.nextInt()));
                goToEmployees();
            }
            case 3 -> {
                System.out.println("What's the employee's ID?");
                System.out.println(vs.getVolunteerById(scanner.nextInt()));
                goToEmployees();
            }
            case 4 -> goToEmployees();
            case 0 -> {
                System.out.println("Error: Incorrect number. Try again!\n");
                addEmployee();
            }
        }
    }

}
