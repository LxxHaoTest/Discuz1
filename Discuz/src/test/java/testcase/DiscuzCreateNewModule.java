package testcase;

import org.testng.annotations.Test;
import pageHelper.CreateModuleHelper;
import pageHelper.LoginHelper;


import java.util.ArrayList;
import java.util.List;

/**
 * 创建新的板块
 */
public class DiscuzCreateNewModule extends BasicTestCase{
    @Test
    public void createNewModule() throws InterruptedException {
        LoginHelper.login(seleniumUtil,"admin","password","用户组: 管理员");
        CreateModuleHelper.createModule(seleniumUtil,"password","娱乐板块");
    }
}
