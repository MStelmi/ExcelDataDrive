package UI.tests;

import org.testng.annotations.AfterTest;
import pages.Home;
import pages.Results;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideDriver;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

public class Base {

    String url = "http://boardgamegeek.com";
    final Integer time = 30;

    public pages.Home Home;
    public pages.Results Results;

    public void setup(){
        Configuration.browser ="chrome";
        Configuration.startMaximized = true;
        Configuration.timeout = time;
    }

    @BeforeEach
    public void openSession(){
        setup();
        open(url);
    }

    @AfterEach
    public void closeSession(){
        close();
    }

}
