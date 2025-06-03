package org.example;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class MapFinder {
    private final String pathToBaseMap;
    private String weekStaatName;



    public MapFinder() {
        this.pathToBaseMap = "C:\\Users\\erikk\\OneDrive\\Bureaublad\\Weekstaten";
        this.weekStaatName = "Weekstaat 2025 week x ";



    }
    public Path getFullPath(String worker, int week) {
        String fullPathString = this.pathToBaseMap + "\\" + worker + "\\" + this.weekStaatName + week + " " + worker+ ".xlsx";
        Path fullPath = Paths.get(fullPathString);

        System.out.println(fullPathString);

        return fullPath;


    }

    public ArrayList<String> getNamesOfWorkers(){
        Path workersMapPath = Paths.get("C:\\Users\\erikk\\OneDrive\\Bureaublad\\Weekstaten");
        ArrayList<String> namesOfWorkers = new ArrayList<>();
        File workersMap = workersMapPath.toFile();
        for(File file : workersMap.listFiles()){
            namesOfWorkers.add(file.getName());
        }
        return namesOfWorkers;
    }

    public void printWorkers(ArrayList<String> namesOfWorkers) {
        for(int i = 0; i < namesOfWorkers.size(); i++){
            System.out.println(i + 1 + ". " + namesOfWorkers.get(i));
        }
    }


}
