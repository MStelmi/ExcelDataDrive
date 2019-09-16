package utility;

import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Excel {

    private final String csvFilePath = "C:/Users/stelmam1/Documents/file.csv";
    CSVReader reader;
    List<String[]> records;

    public Excel(){
        try {
            reader = new CSVReader(new FileReader(csvFilePath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            records = reader.readAll();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getColumnIndex(String columnName){
        int columnIndex = -1;
        for (int i = 0; i < records.get(0).length; i++) {
            if (columnName.equals(records.get(0)[i])) {
                columnIndex = i;
                break;
            }
        }
        return columnIndex;
    }

    public String getSpecificCellValue(int row, String columnName){
        return records.get(row)[getColumnIndex(columnName)];
    }

}






