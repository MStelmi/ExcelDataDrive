package UI.tests;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.Home;
import pages.Registry;
import pages.Results;

import static com.codeborne.selenide.Selenide.*;

public class Base {

    String url = "http://boardgamegeek.com";
    final Integer time = 30;
    Home home;
    Results results;
    Registry registry;


    public void setup(){
        Configuration.browser ="chrome";
        Configuration.startMaximized = true;
        Configuration.timeout = time;
    }

    @BeforeEach
    public void openSession(){
        setup();
        open(url);
        home = page(Home.class);
        results = page(Results.class);
        registry = page(Registry.class);
    }

    @AfterEach
    public void closeSession(){
        close();
    }

}
