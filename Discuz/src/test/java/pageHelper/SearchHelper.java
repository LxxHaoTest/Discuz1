package pageHelper;

import com.gargoylesoftware.htmlunit.Page;
import page.Page_Search;
import util.SeleniumUtil;

/**
 * Created by PC on 2018/5/9.
 */
public class SearchHelper {
    public static void search(SeleniumUtil seleniumUtil,String title,String expected){
        seleniumUtil.waitForElementLoad(Page_Search.SEARCH_TEXT_INPUT,2);
        //用户搜索帖子文本框并输入
        seleniumUtil.sendKeys(Page_Search.SEARCH_TEXT_INPUT,title);
        //找到搜索按钮并按下
        seleniumUtil.click(Page_Search.SEARCH_BTN_INPUT);
        //切换到新的窗口
        seleniumUtil.getWindowsHandles(Page_Search.SEARCH_LINK_TITLE);
        //找到文章标题链接
        seleniumUtil.click(Page_Search.SEARCH_LINK_TITLE);
        //切换到新的窗口
        seleniumUtil.getWindowsHandles(Page_Search.ARTICLE_TITLE);
        //判断帖子标题是否与预期一致
        seleniumUtil.assertForText(Page_Search.ARTICLE_TITLE,expected);
        //用户退出
        seleniumUtil.click(Page_Search.LOGOUT_LINK_TOP);
    }
}
