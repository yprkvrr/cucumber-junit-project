package com.cydeo.tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.annotation.Target;

public class ExcelRead {

    @Test
    public void read_from_excel_file() throws IOException {
        String path = "SampleData.xlsx";
        //to read from excel file we need to load it to FileInput Stream

        FileInputStream fileInputStream = new FileInputStream(path);

        //workbook>sheet>row>cell

        //1)Create workbook

        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        //2)We need to get specific sheet from currently opened workbook

        XSSFSheet sheet = workbook.getSheet("Employees");

        //3)Select row and cell
        //Print out Mary's cell
        //Indexes starts from 0
        System.out.println(sheet.getRow(1).getCell(0));

         //Print out developer

        System.out.println(sheet.getRow(3).getCell(2));

        //Return the count of used cells only
        //Starts counting from 1
        int usedRows=sheet.getPhysicalNumberOfRows();
        System.out.println(usedRows);

        //Returns the number from top cell to bottom cell
        //It doesn't care if the cell is empty or not
        //Starts counting from 0
        int lastRowNum = sheet.getLastRowNum();
        System.out.println(lastRowNum);

        //Create a logic to print Vinod's name
        for (int rowNum=0; rowNum<usedRows; rowNum++){
            if (sheet.getRow(rowNum).getCell(0).toString().equals("Vinod")){
                System.out.println(sheet.getRow(rowNum).getCell(0));
            }
        }
        //Create a logic to print out Linda's job id
        for (int rowNum = 0; rowNum < usedRows; rowNum++) {
            if (sheet.getRow(rowNum).getCell(0).toString().equals("Linda")){
                System.out.println(sheet.getRow(rowNum).getCell(2));
            }
        }
    }

}
