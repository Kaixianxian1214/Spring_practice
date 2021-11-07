package SpringDemo6.test;

import SpringDemo6.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

//@ExtendWith(SpringExtension.class)  // JUnit5单元测试框架
//@ContextConfiguration("classpath:SpringDemo6/bean1.xml")  // 加载配置文件
@SpringJUnitConfig(locations = "classpath:SpringDemo6/bean1.xml")
public class JTest5 {

    @Autowired
    private UserService userService;

    @Test
    public void TestAccountMoney(){
        userService.accountMoney();
    }
}
