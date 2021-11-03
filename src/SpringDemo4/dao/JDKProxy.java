package SpringDemo4.dao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {

    public static void main(String[] args) {

        // 创建接口实现类代理对象
        Class[] interfaces = {UserDao.class};
        UserDaoImpl userDao = new UserDaoImpl();
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(),
                interfaces, new UserDaoProxy(userDao));
        int result = dao.add(1, 3);
        System.out.println("result的计算结果是：" + result);
    }
}



class UserDaoProxy implements InvocationHandler{

    // 把创建的是谁的代理对象，把谁传递过来
    // 有参数构造传递
    private Object obj;

    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }

    // 增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // 方法之前执行
        System.out.println("方法执行之前..." + method.getName() + "：传递的参数是..." + Arrays.toString(args));

        // 被增强的方法执行
        Object res = method.invoke(obj, args);

        // 方法之后执行
        System.out.println("方法执行之后...");

        return res;
    }
}
