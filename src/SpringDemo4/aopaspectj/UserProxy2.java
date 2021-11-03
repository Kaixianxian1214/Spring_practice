package SpringDemo4.aopaspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect        // 生成代理对象
public class UserProxy2 {

    @Pointcut(value = "execution(* SpringDemo4.aopaspectj.User.add(..))")
    public void pointDemo(){
    }

    @Order(2)
    @Before(value = "pointDemo()")
    public void before(){

        System.out.println("before2...");
    }
}
