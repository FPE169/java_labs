package Lab_31;

import java.io.*;
import java.util.*;

class ProcessorRecord {
    int key;
    String name;
    double clockFrequency;
    int cacheSize;
    double busFrequency;
    int specInt;
    int specFp;

    public ProcessorRecord(int key, String name, double clockFrequency, int cacheSize, double busFrequency, int specInt, int specFp) {
        this.key = key;
        this.name = name;
        this.clockFrequency = clockFrequency;
        this.cacheSize = cacheSize;
        this.busFrequency = busFrequency;
        this.specInt = specInt;
        this.specFp = specFp;
    }

    public ProcessorRecord(Scanner scanner) {
        try {
            this.key = scanner.nextInt();
            this.name = scanner.next();
            this.clockFrequency = Double.parseDouble(scanner.next());
            this.cacheSize = scanner.nextInt();
            this.busFrequency = Double.parseDouble(scanner.next());
            this.specInt = scanner.nextInt();
            this.specFp = scanner.nextInt();
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("Неверный формат данных в файле");
            scanner.nextLine();
        }
    }
}


