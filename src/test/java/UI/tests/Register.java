package UI.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testng.Assert;
import utility.Excel;

public class Register extends Base{

    Excel excel;
    String fileName = "file.csv";
    String user, email, password;

    @BeforeEach
    public void setup()
    {
        excel = new Excel (fileName);
        user = excel.getSpecificCellValue(1, "username");
        email = excel.getSpecificCellValue(1, "email");
        password = excel.getSpecificCellValue(1, "password");
    }

    @Test
    public void registerNewUser(){
        home.navigateToRegistry();
        Assert.assertTrue(registry.isRegistryPagePresent());
        registry.setCredentials(user,email,password);
        registry.submitButton.click();
    }
}
