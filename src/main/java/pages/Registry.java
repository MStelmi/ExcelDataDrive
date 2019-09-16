package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class Registry extends Abstract{

    public SelenideElement signupPanel = $x("//div[@class='signup']");
    public SelenideElement userNameInput = $x("//input[@formcontrolname='username']");
    public SelenideElement emailInput = $x("//input[@formcontrolname='email']");
    public SelenideElement passwordInput = $x("//input[@formcontrolname='password']");
    public SelenideElement submitButton = $x("//button[@type='submit']");

    public boolean isRegistryPagePresent (){
         waitForElement(signupPanel, longTime);
         return signupPanel.isDisplayed();
    }

    public void setCredentials(String user, String email, String password){
        set(userNameInput, user);
        set(emailInput, email);
        set(passwordInput, password);
    }

}
