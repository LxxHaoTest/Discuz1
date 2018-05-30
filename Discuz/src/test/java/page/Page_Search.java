package page;

import org.openqa.selenium.By;

/**
 * 疯转搜索贴子属性
 */
public class Page_Search {

    //搜索帖子文本框并输入
    public static  final By SEARCH_TEXT_INPUT=By.id("scbar_txt");

    //找到搜索按钮并按下
    public static final By SEARCH_BTN_INPUT=By.id("scbar_btn");

    //找到文章标题链接进入
    public static final By SEARCH_LINK_TITLE=By.xpath("//*[@id=\"12\"]/h3/a/strong/font");

    //找到文章标题
    public static final By ARTICLE_TITLE=By.xpath("//*[@id=\"thread_subject\"]");

    //退出
    public static final By LOGOUT_LINK_TOP=By.xpath("//*[@id=\"um\"]/p[1]/a[5]");

}
