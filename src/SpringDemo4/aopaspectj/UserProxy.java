package SpringDemo4.aopaspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect      // 表示生成代理对象
public class UserProxy {

    // 前置通知
    // @Before注解表示作为前置通知
    @Before(value = "execution(* SpringDemo4.aopaspectj.User.add(..))")
    public void before(){
        System.out.println("before...");
    }
}
