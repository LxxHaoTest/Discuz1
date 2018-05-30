package util;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 如何读取properties文件，initConfigData方法调用，实现脚本在不同浏览器上的切换运行
 */
public  class initBrowser {

    public static String browserName;
    public static String serverURL;
    public WebDriver driver;

    public  static void initConfigData() throws IOException {
        Properties p=new Properties();
        //加载配置文件
        InputStream IPs=new FileInputStream(".\\config.properties");
        p.load(IPs);
        browserName=p.getProperty("browserName");
        serverURL=p.getProperty("URL");
        IPs.close();
    }
    /**
     * 静态代码块 类加载时会自动执行，别的类中无需调用
     * */
    static{
        try{
            initBrowser.initConfigData();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
