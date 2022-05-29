import Animals.*;
import DB.*;
import Files.*;
import Services.*;

import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        Service service = new Service();
//        service.ReadCSV();
        service.ConnectToDB();

//        service.start();
    }
}
