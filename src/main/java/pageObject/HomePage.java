package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by nazdrik on 15.01.2017 at 12:45.
 */
public class HomePage extends AbstractPage {

    @FindBy(className = "user-avatar")
    private WebElement userAvatar;

    @FindBy(linkText = "Support")
    private WebElement supportLink;

    @FindBy(partialLinkText = "Terms of use")
    private WebElement termsLink;

    @FindBy(partialLinkText = "Privacy Policy")
    private WebElement policyLink;

    @FindBy(linkText = "Sign Out")
    private WebElement signOutLink;

    @FindBy(linkText = "Featured Items Feed")
    private WebElement homePageTitle;

    @FindBy(className = "text-center")
    private WebElement termsOfUsePageTitle;

    @FindBy(className = "iub_header")
    private WebElement privacyPolicyTitle;

    public void clickAnAvatar(){
        userAvatar.click();
    }

    public void clickSupportLink(){supportLink.click();}

    public void clickTermsLink(){termsLink.click();}

    public void clickPolicyLink(){policyLink.click();}

    public void clickLogOut(){
        signOutLink.click();
    }

    public void logOut(){
        clickAnAvatar();
        clickLogOut();
    }

    public String getHomePageTitle() {
        return homePageTitle.getText();
    }

    public String getTermsOfusePagetitle(){return termsOfUsePageTitle.getText();}

    public String getPrivacyPolicyPageTitle(){return privacyPolicyTitle.getText();}

}

