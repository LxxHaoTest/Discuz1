package pageHelper;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import page.Page_Login;
import util.SeleniumUtil;

/**
 * 将元素操作封装成类方法
 */
public class LoginHelper {

    public static Logger logger=Logger.getLogger(LoginHelper.class);

    //在用户名文本框输入用户名
    public  static void  inputLoginName(SeleniumUtil seleniumUtil,String username){
        seleniumUtil.sendKeys(Page_Login.LOGIN_TEXT_INPUT,username);
        logger.info("输入用户名成功");
    }

    //在密码框输入密码
    public static  void inputLoginPwd(SeleniumUtil seleniumUtil,String password){
        seleniumUtil.sendKeys(Page_Login.LOGIN_PASSWORD_INPUT,password);
        logger.info("输入密码成功");
    }


    //点击登录
    public static void clickLoginBtn(SeleniumUtil seleniumUtil){
        seleniumUtil.click(Page_Login.LOGIN_BUTTON_INPUT);
        logger.info("登录成功");
    }

    //通过性判断
    public static void juge(SeleniumUtil seleniumUtil,String expected){
        seleniumUtil.assertForText(Page_Login.LOGIN_LINK_GROUPUSER,expected);
    }

    //重构
    public static void login(SeleniumUtil seleniumUtil, String username, String password,String expected){
        seleniumUtil.sendKeys(Page_Login.LOGIN_TEXT_INPUT,username);
        seleniumUtil.sendKeys(Page_Login.LOGIN_PASSWORD_INPUT,password);
        seleniumUtil.click(Page_Login.LOGIN_BUTTON_INPUT);
        seleniumUtil.waitForElementLoad(Page_Login.LOGIN_LINK_GROUPUSER,3);
        seleniumUtil.assertForText(Page_Login.LOGIN_LINK_GROUPUSER,expected);
    }


}
