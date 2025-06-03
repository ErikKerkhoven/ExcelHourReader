package org.example;

import java.io.IOException;
import java.util.Scanner;

public class UI {
    private MapFinder finder;
    private Scanner scanner;

    public UI() throws IOException {
        finder = new MapFinder();
        scanner = new Scanner(System.in);

    }

    public void start(){
        while (true){
            System.out.println("Choose worker from list (return number)\nreturn 0 to quit");
            finder.printWorkers(finder.getNamesOfWorkers());
            int choice = Integer.valueOf(scanner.nextLine());
            if(choice == 0){
                break;
            }
            System.out.println("Enter week number:\n" );
            int week = Integer.valueOf(scanner.nextLine());
            try {
                FileReader reader = new FileReader(finder.getNamesOfWorkers().get(choice - 1), week);
                reader.FirstRead();
            } catch (Exception e){
                System.out.println("File not found\n" + e.getMessage());
            }



        }
    }
}
