package utility;

import com.opencsv.CSVReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Excel {

    CSVReader reader;
    List<String[]> records;

    public Excel(String fileName) {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        File file = new File(classLoader.getResource(fileName).getFile());
        try {
            reader = new CSVReader(new FileReader(file));
            records = reader.readAll();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getColumnIndex(String columnName) {
        int columnIndex = -1;
        for (int i = 0; i < records.get(0).length; i++) {
            if (columnName.equals(records.get(0)[i])) {
                columnIndex = i;
                break;
            }
        }
        return columnIndex;
    }

    public String getSpecificCellValue(int row, String columnName) {
        return records.get(row)[getColumnIndex(columnName)];
    }

}






