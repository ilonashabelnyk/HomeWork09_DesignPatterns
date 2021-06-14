package desktop.fragments;

import abstractclasses.fragment.AbstractFragment;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationBarFragment extends AbstractFragment {

    public NavigationBarFragment(WebElement rootElement) {
        super(rootElement);
    }

    @FindBy(xpath = "//div[@class='user-nav-wrap'")
    WebElement navigationBarFragment;

    @FindBy(css = "div.user-nav-wrap i.icon-user")
    WebElement signInJoinBtnAtNavBar;

    public void clickSignInJoinBtnAtNavBar() {
        signInJoinBtnAtNavBar.click();
    }
}