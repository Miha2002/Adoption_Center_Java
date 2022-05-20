package Service;

import Animals.Animal;
import java.util.ArrayList;

public class AnimalService {
    ArrayList<Animal> animals;

    public AnimalService() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animalToAdd) {
        animals.add(animalToAdd);
    }

    public void deleteAnimal(Animal animal) {
        animals.remove(animal);
    }
}
