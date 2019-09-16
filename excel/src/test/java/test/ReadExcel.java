package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utility.Excel;

public class ReadExcel {

    Excel excel;
    String fileName = "file.csv";

    @BeforeEach
    public void setup() {
        excel = new Excel(fileName);
    }

    @Test
    public void testing() {
        System.out.println(excel.getSpecificCellValue(2, "password"));
    }


}
