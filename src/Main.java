import Animals.*;
import DB.CatDB;
import DB.DBConnection;
import Files.*;
import Services.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        Service service = new Service();

//        //Reading data from a CSV file
//        CSVReader csvr = CSVReader.getInstance();
//        try {
//            csvr.reader(service);
//        }
//        catch(IOException e) {
//            System.out.println("Error occurred!");
//        }
//
//        //Writing data in a CSV file
//        CSVWriter csvw = CSVWriter.getInstance();

        DBConnection DBconn = DBConnection.getInstance();
        CatDB cdb = CatDB.getInstance();

        try {
            DBconn.startConnection();
            System.out.println ("Database connection established");
            //test
            cdb.getCats(service);
            service.cs.showCats();
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error: Database connection failed!");
        }

//        service.start();
    }
}
