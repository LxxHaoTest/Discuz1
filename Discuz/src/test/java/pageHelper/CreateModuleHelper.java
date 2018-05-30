package pageHelper;

import org.openqa.selenium.WebDriver;
import page.Page_CreateModule;
import util.SeleniumUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 *封装创建新的板块的方法
 */
public class CreateModuleHelper {
    //点击管理中心链接
    public static void clickManage(SeleniumUtil seleniumUtil){
        seleniumUtil.click(Page_CreateModule.CREATEMOUDEL_LINK_TOP);
    }
    //进入管理中心页面并写入密码框
    public static void inputPwd(SeleniumUtil seleniumUtil,String password){
        seleniumUtil.sendKeys(Page_CreateModule.CREATEMOUDEL_LOGINPWD_INPUT,password);
    }


    //点击登录之后进入管理中心界面，找到论坛
    public static void clickForum(SeleniumUtil seleniumUtil){
        seleniumUtil.click(Page_CreateModule.CREATEMOUDEL_LINK_FORUM);
    }

    //点击添加新版块文字链接
    public static void clickAddNew(SeleniumUtil seleniumUtil){
        seleniumUtil.click(Page_CreateModule.CREATEMOUDEL_LINK_NEW);
    }

    //文本框输入新版块名称
    public static void sendNewName(SeleniumUtil seleniumUtil,String newModuleName){
        seleniumUtil.sendKeys(Page_CreateModule.CREATEMOUDEL_TEXT_NEWNAME,newModuleName);
    }

    //点击提交按钮
    public static void clickSubmitBtn(SeleniumUtil seleniumUtil){
        seleniumUtil.click(Page_CreateModule.CREATEMOUDEL_BUTTON_SUBMIT);
    }

    //点击退出文字链接
    public static void clickLogout(SeleniumUtil seleniumUtil){
        seleniumUtil.click(Page_CreateModule.CREATEMOUDEL_LINK_LOGOUT);
    }

    //重构创建新板块方法
    public static void createModule(SeleniumUtil seleniumUtil,String password,String newModuleName) throws InterruptedException {
        seleniumUtil.waitForElementLoad(Page_CreateModule.CREATEMOUDEL_LINK_TOP,10);
        clickManage(seleniumUtil);
        seleniumUtil.getWindowsHandles(Page_CreateModule.CREATEMOUDEL_LOGINPWD_INPUT);
        inputPwd(seleniumUtil,password);
        seleniumUtil.click(Page_CreateModule.CREATEMODULE_SUBMIT_BTN);
        seleniumUtil.getWindowsHandles(Page_CreateModule.CREATEMOUDEL_LINK_FORUM);
        //seleniumUtil.waitForElementLoad(Page_CreateModule.CREATEMOUDEL_LINK_FORUM,10);
        clickForum(seleniumUtil);
        seleniumUtil.switchFrame("main");
        seleniumUtil.waitForElementLoad(Page_CreateModule.CREATEMOUDEL_LINK_NEW,10);
        clickAddNew(seleniumUtil);
        sendNewName(seleniumUtil,newModuleName);
        clickSubmitBtn(seleniumUtil);
        seleniumUtil.quitFrame();
        clickLogout(seleniumUtil);
    }
}