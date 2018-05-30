package page;

import org.openqa.selenium.By;
import util.SeleniumUtil;

/**
 * 封装回帖的属性
 */
public class Page_Response {

    //找到默认板块回帖
    public  static  final By RESPONSE_LINK_DEFAULT=By.xpath("//*[@id=\"category_1\"]/table/tbody/tr[2]/td[2]/h2/a");

    //选中文章
    public  static  final By RESPONSE_LINK_ARITICLE=By.xpath("//*[@id=\"normalthread_12\"]/tr/th/a[2]");

    //找到回帖子的文本框
    public  static final By RESPONSE_TEXTAREA_MESSAGE=By.id("fastpostmessage");
    //找到发表回复的按钮
    public  static final By RESPONSE_BUTTON_MESSAGE=By.id("fastpostsubmit");




}
