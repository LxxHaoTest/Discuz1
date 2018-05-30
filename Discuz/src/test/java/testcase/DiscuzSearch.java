package testcase;

import org.testng.annotations.Test;
import pageHelper.LoginHelper;
import pageHelper.SearchHelper;

/**
 * 用户登录搜索haotest帖子
 */
public class DiscuzSearch extends BasicTestCase {

    @Test
    public void search(){
        LoginHelper.login(seleniumUtil,"test","123456","用户组: 新手上路");
        SearchHelper.search(seleniumUtil,"haotest","haotest");
    }
}
