import Animals.*;
import Files.*;
import Services.*;

import java.io.IOException;
import java.util.ArrayList;


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

        //Writing data in a CSV file
        CSVWriter csvw = CSVWriter.getInstance();

        service.start();
    }
}
