package desktop.pages;

import abstractclasses.page.AbstractPage;
import desktop.fragments.NavigationBarFragment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractPage {
    private String loginURL = "https://www.bookdepository.com/account/login/to/account";

    @FindBy(xpath = "//*[contains(@class, 'auth-fill-claim')] //input[@id='ap_email']")
    WebElement signInEmailInputField;

    @FindBy(xpath = "//*[contains(@class, 'auth-fill-password')] //*[@id='ap_password']")
    WebElement signInPasswordInputField;

    @FindBy(xpath = "//input[@id='signInSubmit']")
    WebElement signInBtn;

    @FindBy(xpath = "//*[contains(@class, 'a-spacing-base')] //input[@id='ap_customer_name']")
    WebElement joinNameInputField;

    @FindBy(xpath = "//*[contains(@class, 'a-spacing-base')] //input[@id='ap_email']")
    WebElement joinEmailInputField;

    @FindBy(xpath = "//*[contains(@class, 'amazon-visible-password')] //input[@id='ap_password']")
    WebElement joinPasswordInputField;

    @FindBy(xpath = "//*[@id='continue]")
    WebElement createAccountBtn;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Open / get URL
    public void openLoginPage() {
        setPageUrl(loginURL);
    }

    public String getCurrentLoginURL() {
        return getPageUrl();
    }

    // Sing in
    public void setSignInEmail(String signInEmail) {
        signInEmailInputField.sendKeys(signInEmail);
    }

    public void setSignInPassword(String signInPassword) {
        signInPasswordInputField.sendKeys(signInPassword);
    }

    public void clickSignInBtn() {
        signInBtn.click();
    }

    public void signInToWebSite(String signInEmail, String signInPassword) {
        this.setSignInEmail(signInEmail);
        this.setSignInPassword(signInPassword);
        this.clickSignInBtn();
    }

    // Join
    public void setJoinName(String joinName) {
        joinNameInputField.sendKeys(joinName);
    }

    public void setJoinEmail(String joinEmail) {
        joinEmailInputField.sendKeys(joinEmail);
    }

    public void setJoinPassword(String joinPassword) {
        joinPasswordInputField.sendKeys(joinPassword);
    }

    public void clickCreateAccountBtn() {
        createAccountBtn.click();
    }

    public void joinToWebSite(String joinName, String joinEmail, String joinPassword) {
        this.setJoinName(joinName);
        this.setJoinEmail(joinEmail);
        this.setJoinPassword(joinPassword);
        this.clickCreateAccountBtn();
    }

    //Located Navigation Bar Fragment at Login page
    NavigationBarFragment navigationBarFragment;

    public void clickSignInJoinBtnAtNavBarFromLoginPage() {
        navigationBarFragment.clickSignInJoinBtnAtNavBar();

    }
}