package testcase;

import org.testng.annotations.Test;
import pageHelper.LoginHelper;
import pageHelper.PublishHelper;

import java.util.Set;

/**
 * 发帖
 */
public class DiscuzPublish extends BasicTestCase{

    @Test
    public void publish() throws InterruptedException {
        LoginHelper.login(seleniumUtil,"admin","password","用户组: 管理员");
        PublishHelper.publish(seleniumUtil,"HelloWorld","世界真美好","收藏");
    }
}
