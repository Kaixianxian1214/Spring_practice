package SpringDemo6.test;

import SpringDemo6.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)   // 指定单元测试框架
@ContextConfiguration("classpath:SpringDemo6/bean1.xml")  // 加载配置文件
public class JTest4 {

    @Autowired
    private UserService userService;

    @Test     // 测试accountMoney
    public void testAccountMoney(){
        userService.accountMoney();
    }
}
