package pageHelper;

import org.testng.annotations.Test;
import page.Page_Response;
import testcase.BasicTestCase;
import util.SeleniumUtil;

/**
 * 封装回帖的方法
 */
public class ResponseHelper extends BasicTestCase{

    public static void clickDefault(SeleniumUtil seleniumUtil){
        seleniumUtil.click(Page_Response.RESPONSE_LINK_DEFAULT);
    }


    public static void clickArticle(SeleniumUtil seleniumUtil){
        seleniumUtil.click(Page_Response.RESPONSE_LINK_ARITICLE);
    }

    public static void sendResponseMessage(SeleniumUtil seleniumUtil,String responseContent){
       seleniumUtil.sendKeys(Page_Response.RESPONSE_TEXTAREA_MESSAGE,responseContent);
    }

    public static void clickResponseBtn(SeleniumUtil seleniumUtil){
        seleniumUtil.click(Page_Response.RESPONSE_BUTTON_MESSAGE);
    }

    //重构
    public static void response(SeleniumUtil seleniumUtil,String responseContent){
        seleniumUtil.waitForElementLoad(Page_Response.RESPONSE_LINK_DEFAULT,10);
        clickDefault(seleniumUtil);
        clickArticle(seleniumUtil);
        sendResponseMessage(seleniumUtil,responseContent);
        clickResponseBtn(seleniumUtil);
    }
}
