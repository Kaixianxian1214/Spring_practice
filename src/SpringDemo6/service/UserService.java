package SpringDemo6.service;

import SpringDemo6.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(timeout = -1, propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ)      // 添加事务注解
public class UserService {

    // 注入dao
    @Autowired
    private UserDao userDao;

    // 转账的方法
    public  void accountMoney(){
            userDao.reduceMoney();
            userDao.addMoney();
    }
}
