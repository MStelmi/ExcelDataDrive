package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class Home extends Abstract{

    public SelenideElement searchInput = $x("//div[@class='form-group-search']//input[@placeholder='Search']");
    public SelenideElement searchButton = $x("//div[@class='form-group-search']//button[@class='search']");
    public SelenideElement joinLink = $x("//a[@href='/join']");

    public void search (String value){
        set(searchInput, value);
        click(searchButton);
    }
    public void selectTab (String tab){
        SelenideElement browseTab = $x("//ul[@class='global-header-nav-primary']//button[contains(text(), '" + tab + "')]");
        click(browseTab);
    }
    public void SelectFromTabMenu (String value){
        SelenideElement menuValue = $(By.linkText(value));
        click(menuValue);
    }

    public void navigateToRegistry(){
        waitForElement(joinLink, shortTime);
        joinLink.click();
    }
}
