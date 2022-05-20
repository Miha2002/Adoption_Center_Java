package Service;

import Animals.Other;
import java.util.ArrayList;

public class OtherService {
    ArrayList<Other> others;

    public OtherService() {
        others = new ArrayList<>();
    }

    public void addOther(Other otherToAdd) {
        others.add(otherToAdd);
    }

    public void deleteOther(Other other) {
        others.remove(other);
    }

    public void deleteOtherById(int id) {
        others.removeIf(otherInArray -> otherInArray.getId() == id);
    }


    public Other getOtherById(int id){
        for (Other otherInArray : others) {
            if(otherInArray.getId() == id){
                return otherInArray;
            }
        }
        return null;
    }
}
