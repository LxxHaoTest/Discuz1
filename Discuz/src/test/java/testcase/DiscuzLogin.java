package testcase;

import org.testng.annotations.Test;
import pageHelper.LoginHelper;

/**
 * 用户登录
 */
public class DiscuzLogin extends BasicTestCase{
    @Test
    public void login(){
        LoginHelper.login(seleniumUtil,"admin","password","用户组: 管理员");
    }
}
