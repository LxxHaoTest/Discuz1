package testcase;

import org.testng.annotations.Test;
import pageHelper.DeleteHelper;
import pageHelper.LoginHelper;

/**
 * 删除帖子
 */
public class DiscuzDelete extends  BasicTestCase{

    @Test
    public void delete() throws InterruptedException {
        LoginHelper.login(seleniumUtil,"admin","password","用户组: 管理员");
        DeleteHelper.delete(seleniumUtil);
    }
}
