package page;

import org.openqa.selenium.By;

/**
 * 管理员删帖：属性封装
 */
public class Page_Delete {

    //找到默认板块
    public static final By DELETE_LINK_DEFAULT=By.xpath("//*[@id=\"category_1\"]/table/tbody/tr[2]/td[2]/h2/a");

    //找到文章的复选框
    public static final By DELETE_CHECKBOX_INPUT=By.xpath("//*[@id=\"normalthread_12\"]/tr/td[1]/a/img");

   //找删除文本链接
    public static final By DELETE_LINK_DELETE=By.linkText("删除");

  //找到确定删除按钮
    public  static final By DELETE_BUTTON_ACCEPT=By.xpath("//*[@id=\"modsubmit\"]");



}
