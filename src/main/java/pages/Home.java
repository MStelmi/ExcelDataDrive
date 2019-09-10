package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class Home extends Abstract{

    public SelenideElement searchInput = $x("//div[@class='form-group-search']//input[@placeholder='Search']");
    public SelenideElement searchButton = $x("//div[@class='form-group-search']//button[@class='search']");
    public SelenideElement popupTabMenu = $x("//div[@class='dropdown-menu dropdown-menu-xl container-fluid'][1]");

    public void search (String value){
        set(searchInput, value);
        click(searchButton);
    }
    public void selectFromTabPopupMenu (String tab, String PopupMenuValue ){
        SelenideElement browseTab = $x("//ul[@class='global-header-nav-primary']//button[contains(text(), '" + tab + "')]");
        click(browseTab);
        waitForElement(popupTabMenu, shortTime);
        SelenideElement menuValue = $x("//ul[@class='global-header-nav-primary']//button[contains(text(), '" + PopupMenuValue + "')]");
        click(menuValue);
    }
}
