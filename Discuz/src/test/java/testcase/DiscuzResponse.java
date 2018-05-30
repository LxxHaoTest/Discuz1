package testcase;

import org.testng.annotations.Test;
import pageHelper.LoginHelper;
import pageHelper.PublishHelper;
import pageHelper.ResponseHelper;

/**
 * 回复帖子
 */
public class DiscuzResponse extends BasicTestCase {

    @Test
    public void response() throws InterruptedException {
        LoginHelper.login(seleniumUtil,"admin","password","用户组: 管理员");
        ResponseHelper.response(seleniumUtil,"加油加油!");

    }
}
