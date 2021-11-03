package SpringDemo4.aopxml;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

public class BookProxy {

    @Pointcut(value = "execution(* SpringDemo4.aopxml.Book.buy(..))")
    public void pointCut(){
    }

    @Before(value = "pointCut()")
    public void before(){

        System.out.println("before...");
    }
}
