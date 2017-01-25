import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utility.Constants;

import java.util.concurrent.TimeUnit;

/**
 * Created by alexey on 25/01/17.
 */
public class HomePageTest extends TestBase {

    private static Logger Log = Logger.getLogger(org.apache.commons.logging.Log.class.getName());

    @BeforeMethod
    public void setUp() throws Exception {

        DOMConfigurator.configure("log4j.xml");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://designcarta.com");
    }


    // Support link checking
  /*  @Test(priority = 1, alwaysRun = true)
    public void supportTest(){
        Log.info("Once user logs in he tries to click support link");
        login.loginIntoTheApp(Constants.Username, Constants.Password);
        Log.info("User logs in successfully");
        home.clickAnAvatar();
        Log.info("User clicks an avatar");
        home.sleep();
        home.clickSupportLink();
       //assertThat("", home.clickSupportLink(), is(true));
        Log.info("Letter for support team is opened, PASS");
    }
    */

    // Terms of use link checking
    @Test(priority = 2, alwaysRun = true)
    public void termsOfUseTest(){
        Log.info("Once user logs in he tries to click terms of use link");
        login.loginIntoTheApp(Constants.Username, Constants.Password);
        Log.info("User logs in successfully");
        home.sleep();
        home.clickAnAvatar();
        Log.info("User clicks an avatar");
        home.clickTermsLink();
        Log.info("Terms of use page opens, PASS");
        Assert.assertTrue(home.getTermsOfusePagetitle().contains("DESIGN CARTA AND TOURING MODE TERMS OF USE"));

    }
}
