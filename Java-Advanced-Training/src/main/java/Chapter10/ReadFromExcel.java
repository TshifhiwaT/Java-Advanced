package Chapter10;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.io.IOException;

public class ReadFromExcel {
    static void main(String[] args) {
        String filePath = "src/main/resources/Cities.xlsx";
        try {
            FileInputStream fileInput = new FileInputStream(filePath);
            XSSFWorkbook workbook = new XSSFWorkbook(fileInput);
            XSSFSheet sheet = workbook.getSheetAt(0);

//            for(int i = 0; i <sheet.getLastRowNum(); i++){
//                //row
//                Row row = sheet.getRow(i);
//                for(int col = 0; col < row.getLastCellNum(); col++){
//                    Cell cell = row.getCell(col);
//                    System.out.print(cell + "\t\t");
//                }
//                System.out.println();
//            }

            for(Row row : sheet){
                for(Cell cell : row){
                    System.out.print(cell + "\t\t");
                }
                System.out.println();
            }

            fileInput.close();
            workbook.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
