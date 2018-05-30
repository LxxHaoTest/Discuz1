package pageHelper;

import page.Page_Publish;
import util.SeleniumUtil;

/**
 * 封装发帖子方法
 */
public class PublishHelper {

    //点击默认板块链接
    public static void clickdefault(SeleniumUtil seleniumUtil){
        seleniumUtil.click(Page_Publish.PUBLISH_LINK_DEFAULT);
    }

    //在快速发帖页面找到标题输入框键入标题
    public static void inputPostTitle(SeleniumUtil seleniumUtil,String title){
        seleniumUtil.sendKeys(Page_Publish.PUBLISH_TITLE_INPUT,title);
    }

    //在文本输入框写帖子正文
    public static void inputPostContent(SeleniumUtil seleniumUtil,String content){
        seleniumUtil.sendKeys(Page_Publish.PUBLISH_CONTENT_TEXTAREA,content);
    }

    //点击发表帖子按钮
    public static void clickPublishBtn(SeleniumUtil seleniumUtil){
        seleniumUtil.click(Page_Publish.PUBLISH_BUTTON_INPUT);
    }

    //通过性判断
    public static void getPassText(SeleniumUtil seleniumUtil,String expected){
        seleniumUtil.assertForText(Page_Publish.PUBLISH_PASS_COLLECT,expected);
    }
    //重构
    public static void publish(SeleniumUtil seleniumUtil,String title,String content,String expected){
        seleniumUtil.waitForElementLoad(Page_Publish.PUBLISH_LINK_DEFAULT,3);
        clickdefault(seleniumUtil);
        inputPostTitle(seleniumUtil, title);
        inputPostContent(seleniumUtil, content);
        clickPublishBtn(seleniumUtil);
        seleniumUtil.waitForElementLoad(Page_Publish.PUBLISH_PASS_COLLECT,3);
        getPassText(seleniumUtil,expected);
    }
}
