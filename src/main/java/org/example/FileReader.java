package org.example;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import java.io.*;


public class FileReader {
    private int week;
    private Workbook weekStaat;
    private MapFinder mapFinder;
    private InputStream iStream;
    private Sheet sheet;


    public FileReader(String worker, int week) throws IOException {
        this.week = 0;
        this.mapFinder = new MapFinder();
        this.iStream = new FileInputStream(mapFinder.getFullPath(worker, week).toFile());
        this.weekStaat = WorkbookFactory.create(iStream);
        this.sheet = this.weekStaat.getSheetAt(0);

    }

    public void FirstRead() throws IOException {
        for(int i = 12; i < 43; i++)
            if(sheet.getRow(i).getCell(0) != null) {
                System.out.println(sheet.getRow(i).getCell(3));
                System.out.println(sheet.getRow(i).getCell(3).getCellType());
            }
    }




}

