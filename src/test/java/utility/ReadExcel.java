package utility;

import org.junit.jupiter.api.Test;

public class ReadExcel extends Excel{

    @Test
    public void testing (){
      // excel.getColumnIndex("email");
      //  int x = getColumnIndex("email");
        System.out.println(getSpecificCellValue(1, "email"));
    }



}
