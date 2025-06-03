package org.example;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.eventusermodel.XSSFReader;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReader {
    private int week;
    private String worker;
    private Workbook weekStaat;
    private MapFinder mapFinder;
    private InputStream iStream;
    private Sheet sheet;


    public FileReader() throws IOException {
        this.week = 14;
        this.worker = "Erik";
        this.mapFinder = new MapFinder();
        this.iStream = new FileInputStream(mapFinder.getFullPath(worker, week).toFile());
        this.weekStaat = WorkbookFactory.create(iStream);
        this.sheet = this.weekStaat.getSheetAt(0);

    }

    public void FirstRead() throws IOException {
        for(int i = 12; i < 43; i++)
            if(sheet.getRow(i).getCell(0) != null && (sheet.getRow(i).getCell(0).getCellType().equals(CellType.STRING))) {
                System.out.println(sheet.getRow(i).getCell(3));
                System.out.println(sheet.getRow(i).getCell(3).getCellType());
            }
    }




}

