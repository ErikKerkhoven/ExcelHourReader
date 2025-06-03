package org.example;

import java.io.IOException;
import java.util.Scanner;

public class UI {
    private MapFinder finder;
    private FileReader fileReader;
    private Scanner scanner;

    public UI() throws IOException {
        finder = new MapFinder();
        fileReader = new FileReader();
        scanner = new Scanner(System.in);

    }

    public void start(){
        while (true){
            System.out.println("Choose worker from list (return number)\nreturn 0 to quit");
            finder.printWorkers(finder.getNamesOfWorkers());
            int choice = Integer.valueOf(scanner.nextLine());
        }
    }
}
