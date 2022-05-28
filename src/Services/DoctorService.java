package Services;

import Employees.Doctor;

import java.util.ArrayList;
import java.util.Arrays;

public class DoctorService {
    ArrayList<Doctor> docs;

    public DoctorService() {
        docs = new ArrayList<>();
    }

    public void addDoctor(Doctor doc) {
        docs.add(doc);
    }


    public void showDoctors() {
        System.out.println(Arrays.deepToString(docs.toArray()).replace("},", "},\n"));
    }

    public void deleteDoctorById(int id) {
        docs.removeIf(docInArray -> docInArray.getId() == id);
    }

    public Doctor getDoctorById(int id){
        for (Doctor docInArray : docs) {
            if(docInArray.getId() == id){
                return docInArray;
            }
        }
        return null;
    }
}
