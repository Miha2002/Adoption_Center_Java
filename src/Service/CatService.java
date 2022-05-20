package Service;

import Animals.Cat;
import java.util.ArrayList;

public class CatService {
    ArrayList<Cat> cats;

    public CatService() {
        cats = new ArrayList<>();
    }

    public void addCat(Cat catToAdd) {
        cats.add(catToAdd);
    }

    public void deleteCat(Cat cat) {
        cats.remove(cat);
    }

    public void deleteCatById(int id) {
        cats.removeIf(catInArray -> catInArray.getId() == id);
    }


    public Cat getCatById(int id){
        for (Cat catInArray : cats) {
            if(catInArray.getId() == id){
                return catInArray;
            }
        }
        return null;
    }
}
