package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

public class Abstract {

    public Integer shortTime = 5;
    public Integer longTime = 30;

    public void waitForElement(SelenideElement e, Integer time){
        e.waitUntil(Condition.visible, time);
    }
    public void click(SelenideElement e){
        waitForElement(e, longTime);
        e.click();
    }

    public void set(SelenideElement e, String value){
        waitForElement(e, shortTime);
        e.setValue(value);
    }
}
