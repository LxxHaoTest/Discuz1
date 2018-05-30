package page;

import org.openqa.selenium.By;

/**
 * 创建新的模块
 */
public class Page_CreateModule {
    //找到管理中心链接
    public static final By CREATEMOUDEL_LINK_TOP=By.linkText("管理中心");

    //进入管理中心页面并找到密码框
    public static final By CREATEMOUDEL_LOGINPWD_INPUT=By.xpath("//*[@id=\"loginform\"]/p[4]/input");

    //点击提交按钮
    public  static final By CREATEMODULE_SUBMIT_BTN=By.xpath("//*[@id=\"loginform\"]/p[9]/input");

    //点击登录之后，找到论坛
    public static final By CREATEMOUDEL_LINK_FORUM=By.id("header_forum");

    //找添加新版块文字链接
    public static final By CREATEMOUDEL_LINK_NEW=By.xpath("//*[@id=\"cpform\"]/table/tbody[3]/tr/td[2]/div/a");

    //文本框输入新版块名称
    public static final By CREATEMOUDEL_TEXT_NEWNAME=By.xpath("//*[@id=\"cpform\"]/table/tbody[3]/tr[1]/td[3]/div/input");

    //找到提交按钮
   public static final By CREATEMOUDEL_BUTTON_SUBMIT=By.xpath("//*[@id=\"submit_editsubmit\"]");

    //找到退出文字链接
    public static final By CREATEMOUDEL_LINK_LOGOUT=By.linkText("退出");
}

