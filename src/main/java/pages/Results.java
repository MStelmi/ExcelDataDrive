package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$x;

public class Results extends Abstract{

    public SelenideElement resultTable = $x("//table[@class='collection_table']");

    public boolean areAllRowsContainGameText (String game){
        verifyResultTableExist();
        List<SelenideElement> gameResultList =  resultTable.$$(By.xpath("//table[@id='collectionitems']//td[contains(@class, 'collection_objectname')]//a"));
        ArrayList notMatchedGamesList = new ArrayList();

        for (SelenideElement row : gameResultList) {
            if (!row.getText().toLowerCase().contains(game.toLowerCase()))
                notMatchedGamesList.add(row.getText());
        }
        return notMatchedGamesList.size() != 0;
    }

    public void verifyResultTableExist(){
        waitForElement(resultTable, longTime);
    }

    public void navigateToGame (String game){


    }


}
