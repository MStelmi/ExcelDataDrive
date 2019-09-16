package utility;

import com.opencsv.CSVReader;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Paths;
import java.util.List;

import static java.nio.file.Files.newBufferedReader;

public class Excel {

    private static final String csvFilePath = "C:/Users/stelmam1/Documents/file.csv";
    Reader reader;
    List<String[]> records;
    CSVReader csvReader = new CSVReader(reader);

    public Excel(){
                try {
                    reader = newBufferedReader(Paths.get(csvFilePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            records = csvReader.readAll();
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






