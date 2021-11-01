package SpringDemo3.service;

import SpringDemo3.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// 在注解里面value属性值可以省略不写
// 默认值是类名称，首字母小写  UserService-->userService
// @Component(value = "userService")      // 等同于<bean id="userService">
@Service
public class UserService {

    // 定义dao类型属性
    @Autowired
    @Qualifier(value = "userDaoImpl1")
    private UserDao userDao;

    public void add(){
        System.out.println("service add............");
        userDao.add();
    }
}
