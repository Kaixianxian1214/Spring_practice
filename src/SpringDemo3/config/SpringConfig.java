package SpringDemo3.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // 作为配置类，代替xml文件
@ComponentScan(basePackages = "SpringDemo3")
public class SpringConfig {

}
