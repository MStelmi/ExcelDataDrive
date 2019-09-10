package pages;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$x;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class Results extends Abstract{

   //@FindBy (how = How.XPATH, using = "//table[@class='collection_table']")
   // public WebElement resultsTable;
    public SelenideElement resultTable = $x("//table[@class='collection_table']");

    public void verifyGameExist (String game){
        verifyResulTableExist();
        List<SelenideElement> rows =  resultTable.$$(By.xpath("//a[contains(text(), '" + game + "')]"));
        for (SelenideElement row : rows) {
            assertTrue(row.getText().contains(game));
        }
    }

    public void verifyResulTableExist(){
        waitForElement(resultTable, longTime);
    }


}
