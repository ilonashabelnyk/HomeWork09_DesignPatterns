package abstractclasses.fragment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class AbstractFragment {
    private WebElement rootElement;
    private WebDriver driver;

    public AbstractFragment(WebElement rootElement) {
        this.rootElement = rootElement;
    }

    public WebElement getRootElement() {
        return rootElement;
    }

    public void setRootElement(WebElement element) {
        this.rootElement = element;
    }

    public WebDriver getDriver() {
        return this.driver;
    }
}