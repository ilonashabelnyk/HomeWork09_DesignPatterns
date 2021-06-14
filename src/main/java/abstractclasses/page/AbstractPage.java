package abstractclasses.page;

import org.openqa.selenium.WebDriver;

public abstract class AbstractPage {
    private String pageUrl;
    private String pageUrlPattern;
    private WebDriver driver;

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return this.driver;
    }

    public String getPageUrl() {
        return driver.getCurrentUrl();
    }

    public void setPageUrl(String pageUrl) {
        driver.get(pageUrl);
    }

    public String setPageUrlPattern(String pageUrlPattern) {
        return this.pageUrlPattern = pageUrlPattern;
    }

    public String getPageUrlPattern() {
        return pageUrlPattern;
    }
}