package Files;

import Animals.*;
import Services.Service;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class CSVReader { //doesnt work

    private static CSVReader rcsv = null;

    private CSVReader() {}

    public static CSVReader getInstance() {
        if(rcsv == null)
            rcsv = new CSVReader();
        return rcsv;
    }

    private void cats(Service service) throws IOException {
        File fileCats = new File("src/Files/csv/cats");
        Scanner scanner = new Scanner(fileCats);

        scanner.useDelimiter(",");
        while(scanner.hasNext()) {
            service.cs.addCat(new Cat(
                    scanner.next(),
                    scanner.next(),
                    scanner.nextInt(),
                    scanner.nextFloat(),
                    scanner.nextBoolean(),
                    scanner.next(),
                    scanner.next()));
        }
        scanner.close();
    }

//        while(scanner.hasNext()) {
//            String nextLine = scanner.nextLine();
//            String[] arg = nextLine.split(",");
//            service.cs.addCat(new Cat(arg[1], arg[2],
//                    Integer.parseInt(arg[3]),
//                    Float.parseFloat(arg[4]),
//                    Boolean.parseBoolean(arg[5]),
//                    arg[6], arg[7]));
//        }

    private void dogs(Service service) throws IOException {
        File fileDogs = new File("src/Files/csv/dogs.csv");
        Scanner scanner = new Scanner(fileDogs);

        while(scanner.hasNext()) {
            String nextLine = scanner.nextLine();
            String[] arg = nextLine.split(",");
            service.ds.addDog(new Dog(arg[1], arg[2],
                    Integer.parseInt(arg[3]),
                    Float.parseFloat(arg[4]),
                    Boolean.parseBoolean(arg[5]),
                    arg[6],
                    Integer.parseInt(arg[7])));
        }
    }

    private void others(Service service) throws IOException {
        File fileOthers = new File("src/Files/csv/others.csv");
        Scanner scanner = new Scanner(fileOthers);

        while(scanner.hasNext()) {
            String nextLine = scanner.nextLine();
            String[] arg = nextLine.split(",");
            service.os.addOther(new Other(arg[1], arg[2],
                    Integer.parseInt(arg[3]),
                    Float.parseFloat(arg[4]),
                    Boolean.parseBoolean(arg[5]),
                    arg[6]));
        }
    }

    public void reader(Service s) throws IOException {
        cats(s);
//        dogs(s);
//        others(s);
    }
}
