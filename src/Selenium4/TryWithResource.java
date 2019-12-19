package com.cucumber;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class TryWithResource {

    @Test
    public void createSheet() {
        try(FileOutputStream fileReader = new FileOutputStream("D:\\amogh-workspace\\cucumber\\src\\main\\java\\resources\\Test.xlsx")){
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook();
            XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(0);
            
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        

    }
}
