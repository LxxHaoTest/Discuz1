package page;

import org.openqa.selenium.By;
import util.SeleniumUtil;

/**
 * 封装类属性
 */
public class Page_Login {

        //用户名文本框
        public static final By LOGIN_TEXT_INPUT=By.id("ls_username");

       //密码框
       public  static final By LOGIN_PASSWORD_INPUT=By.id("ls_password");

       //登录按钮
       public  static final By LOGIN_BUTTON_INPUT=By.xpath("//*[@id=\"lsform\"]/div/div/table/tbody/tr[2]/td[3]/button/em");

      //自动登录选项
      public static final By LOGIN_RADIO_INPUT=By.id("ls_cookietime");

       //找回密码
      public  static final By LOGIN_LINK_TITLE=By.linkText("找回密码");

       //注册
       public static final By LOGIN_LINK_REG=By.className("xi2 xw1");


      //用户组
      public  static final By LOGIN_LINK_GROUPUSER=By.xpath("//*[@id=\"g_upmine\"]");


 }
