package pageHelper;

import page.Page_Delete;
import testcase.BasicTestCase;
import util.SeleniumUtil;

/**
 * 封装删除类方法
 */
public class DeleteHelper  {

    //点击默认板块链接
    public static void clickDeleteDefault(SeleniumUtil seleniumUtil){
        seleniumUtil.click(Page_Delete.DELETE_LINK_DEFAULT);
    }

    //选中一篇文章
    public static void clickArticle(SeleniumUtil seleniumUtil){
        seleniumUtil.click(Page_Delete.DELETE_CHECKBOX_INPUT);
    }

    //点击删除链接
    public  static void clickDeleteDelete(SeleniumUtil seleniumUtil){
        seleniumUtil.click(Page_Delete.DELETE_LINK_DELETE);
    }

    //点击确定删除按钮
    public  static  void clickDeleteAccept(SeleniumUtil seleniumUtil){
        seleniumUtil.click(Page_Delete.DELETE_BUTTON_ACCEPT);
    }


    //重构删除文章的方法
    public  static void delete(SeleniumUtil seleniumUtil) throws InterruptedException {
        seleniumUtil.waitForElementLoad(Page_Delete.DELETE_LINK_DEFAULT,10);
        clickDeleteDefault(seleniumUtil);
        clickArticle(seleniumUtil);
        clickDeleteDelete(seleniumUtil);
        seleniumUtil.waitForElementLoad(Page_Delete.DELETE_BUTTON_ACCEPT,10);
        clickDeleteAccept(seleniumUtil);
    }
}
