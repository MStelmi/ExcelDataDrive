package UI.tests;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class Register extends Base{

    @Test
    public void registerNewUser(){
        home.navigateToRegistry();
        Assert.assertTrue(registry.isRegistryPagePresent());
        registry.setCredentials("stelmi", "stelmi@mail.com", "123456");
        registry.submitButton.click();
    }
}
