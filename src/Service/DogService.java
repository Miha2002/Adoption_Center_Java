package Service;

import Animals.Dog;
import java.util.ArrayList;

public class DogService {
    ArrayList<Dog> dogs;

    public DogService() {
        dogs = new ArrayList<>();
    }

    public void addDog(Dog dogToAdd) {
        dogs.add(dogToAdd);
    }

    public void deleteDog(Dog dog) {
        dogs.remove(dog);
    }

    public void deleteDogById(int id) {
        dogs.removeIf(dogInArray -> dogInArray.getId() == id);
    }


    public Dog getDogById(int id){
        for (Dog dogInArray : dogs) {
            if(dogInArray.getId() == id){
                return dogInArray;
            }
        }
        return null;
    }
}

