package driver;

import org.testng.annotations.Test;

public class GetDriverTest {

    @Test
    public void openPageWithWebDriver() {
        SingletonDriver.getWebDriverInstance().navigate().to("https://ua.sinoptik.ua/");
        SingletonDriver.getWebDriverInstance().quit();
    }
}