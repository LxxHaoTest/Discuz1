package testcase;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import util.LogConfiguration;
import util.SeleniumUtil;
import util.initBrowser;

import java.io.IOException;

/**
 * 存放公共的方法
 */
public class BasicTestCase {
    public WebDriver driver=null;
    SeleniumUtil seleniumUtil=null;
    public static Logger logger=Logger.getLogger(BasicTestCase.class);

    @BeforeTest
    public void setup() throws IOException {
        LogConfiguration.initlog();
        seleniumUtil=new SeleniumUtil();
        driver=seleniumUtil.getDriver(initBrowser.browserName);
        driver.manage().window().maximize();
        seleniumUtil.geturl(initBrowser.serverURL);
    }

    @AfterTest
    public void terdown() throws InterruptedException {
        //Thread.sleep(10000);
       // driver.quit();
    }

}
