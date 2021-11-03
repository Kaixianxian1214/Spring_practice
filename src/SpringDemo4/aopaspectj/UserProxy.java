package SpringDemo4.aopaspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect      // 表示生成代理对象
public class UserProxy {

    // 相同切入点抽取
    @Pointcut(value = "execution(* SpringDemo4.aopaspectj.User.add(..))")
    public void pointDemo(){

    }

    // 前置通知
    // @Before注解表示作为前置通知
    @Order(1)
    @Before(value = "pointDemo()")
    public void before(){
        System.out.println("before...");
    }

    // 最终通知
    @After(value = "pointDemo()")
    public void after(){
        System.out.println("after...");
    }

    // 异常通知
    @AfterThrowing(value = "pointDemo()")
    public void afterThrowing(){
        System.out.println("after...");
    }

    // 后置通知
    @AfterReturning(value = "pointDemo()")
    public void afterReturning(){
        System.out.println("afterReturning...");
    }

    // 环绕通知
    @Around(value = "pointDemo()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("环绕之前...");

        // 被增强的方法执行
        proceedingJoinPoint.proceed();

        System.out.println("环绕之后...");
    }
}
