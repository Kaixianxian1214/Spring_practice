package SpringDemo4.aopaspectj;

import org.springframework.stereotype.Component;

@Component
public class User {

    public void add(){
        System.out.println("add...");
    }
}
