package util;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * 对selenium常用的方法进行封装
 */
public class SeleniumUtil {
    private Logger logger=Logger.getLogger(SeleniumUtil.class);
    public WebDriver driver=null;

    //加载驱动
    public   WebDriver getDriver(String driverType){
        if (driverType.equalsIgnoreCase("chrome")){
            String path="./tools/chromedriver.exe";
            System.setProperty("webdriver.chrome.driver",path);
            driver=new ChromeDriver();
            logger.info("加载谷歌驱动");
        }else if (driverType.equalsIgnoreCase("firefox")){
            String path="./tools/geckodriver.exe";
            System.setProperty("webdriver.gecko.driver",path);
            driver=new FirefoxDriver();
            logger.info("加载火狐驱动");
        }else {
            logger.error("找不到对应的驱动");
        }
        return driver;
    }

    //获取路径
    public void geturl(String url){
        driver.get(url);
        logger.info("打开网址"+url);
    }

    //查找一个元素
    public WebElement findElement(By by){
        WebElement element=null;
        try{
            element=driver.findElement(by);
            String text=element.getText();
            logger.info("成功找到元素"+text);
        }catch (NoSuchElementException e){
            logger.error("未找到元素");
        }
        return element;
    }

    //查找多个元素
    public List<WebElement> findElements(By by){
        logger.info("成功找到一个元素");
        return driver.findElements(by);
    }

    //点击
    public void click(By by){
        WebElement element=driver.findElement(by);
        element.click();
//        String text=element.getText();
        logger.info("成功点击");
    }

    //输入
    public void sendKeys(By by,String text){
        WebElement element=driver.findElement(by);
        clear(by);
        element.sendKeys(text);
        logger.info("成功输入内容"+text);

    }

    //清除
    public void clear(By by){
        WebElement element=driver.findElement(by);
        element.clear();
        String text=element.getText();
        logger.info("成功清除内容"+text);
    }

    //获取元素内容
    public  String getText(By by){
        WebElement element=driver.findElement(by);
        String text=element.getText();
        logger.info("成功获取到元素内容"+text);
        return  text;
    }

    //查看元素是否存在
    public  boolean isExists(By by){
        WebElement element=null;
        try{
            driver.findElement(by);
            String text=element.getText();
            logger.info("元素存在"+text);
            return true;
        }catch (NoSuchElementException e){
            logger.error("元素不存在");
            return false;
        }
    }


    /**根据顶部title判断当前页面是否是预期页面*/
    public void assertPage(String expected){
        String actual =driver.getTitle();
        try{
            Assert.assertEquals(actual, expected);
        } catch (AssertionError e){
            logger.error("预期文字是：["+expected+"],但实际文字是: ["+actual+"]");
            Assert.fail("预期文字是：["+expected+"],但实际文字是: ["+actual+"]");
        }
        logger.info("找到了对应title，当前页面正确：【"+actual+"】");
    }


    /**校验文本是否与预期一致*/
    public void assertForText(By by, String expected){
        WebElement element=driver.findElement(by);
        String actual=element.getText();
        try{
            Assert.assertEquals(actual, expected);
        } catch (AssertionError e){
            logger.error("期望的文字是 [" + expected + "] 但是找到了 [" + actual + "]");
            Assert.fail("期望的文字是 [" + expected + "] 但是找到了 [" + actual + "]");
        }
        logger.info("找到了期望的文字: [" + expected + "]");
    }


    /**设置显示等待元素*/
    public void waitForElementLoad(final By by, int timeOut){
        logger.info("开始查找元素："+by);
        try{
            WebDriverWait wait = new WebDriverWait(driver, timeOut, 1000);
            wait.until(new ExpectedCondition<Boolean>() {

                public Boolean apply(WebDriver driver) {
                    WebElement element = driver.findElement(by);
                    return element.isDisplayed();
                }
            });
        } catch (Exception e){
            logger.error("超时!! " + timeOut + " 秒之后还没找到元素 [" + by + "]");
            Assert.fail("超时!! " + timeOut + " 秒之后还没找到元素 [" + by + "]");
        }
        logger.info("找到了元素 [" + by + "]");
    }

    /**切换窗口*/
    public void getWindowsHandles(By by){
/*        //获取窗口的个数
        List<String> handles=new ArrayList(driver.getWindowHandles());
        //切换到最新的窗口
        String handle=handles.get(handles.size()-1);
        driver.getWindowHandle();*/

       // WebElement element=driver.findElement(by);
        Set<String> windows=driver.getWindowHandles();
        for(String window:windows){
            driver.switchTo().window(window);
            System.out.println("获取每一个句柄/窗口："+window);
            logger.info("获取窗口"+window);
        }

    }

    /**切换Frame*/
      public void switchFrame(String id){
          driver.switchTo().frame(id);
      }

    /**退出Frame*/
    public void quitFrame(){
        driver.switchTo().defaultContent();
    }
}
