package page;

import org.openqa.selenium.By;

/**
 * 发表帖子模块
 */
public class Page_Publish {
    //默认板块链接
    public static final By PUBLISH_LINK_DEFAULT=By.xpath("//*[@id=\"category_1\"]/table/tbody/tr[1]/td[2]/h2/a");

    //输入帖子标题
    public static final By PUBLISH_TITLE_INPUT=By.id("subject");

    //输入帖子正文
    public  static  final By PUBLISH_CONTENT_TEXTAREA=By.id("fastpostmessage");

    //点击发表帖子按钮
    public static final By PUBLISH_BUTTON_INPUT=By.id("fastpostsubmit");

    //通过性判断 收藏这两字
    public static final By PUBLISH_PASS_COLLECT=By.xpath("//*[@id=\"k_favorite\"]/i");
}
