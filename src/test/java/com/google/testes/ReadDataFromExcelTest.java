package com.google.testes;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadDataFromExcelTest {
    @Test
    public void readDataFromExcelTest() throws IOException {
        String path = "Automation.xlsx";
        XSSFWorkbook workbook = new XSSFWorkbook(path);
        XSSFSheet xssfSheet = workbook.getSheet("TestData");

        System.out.println("Abdul Qadeer = " + xssfSheet.getRow(1).getCell(0));
        FileInputStream in =  new FileInputStream(path);
    }
}
