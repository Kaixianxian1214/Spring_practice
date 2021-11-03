package SpringDemo4.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"SpringDemo4.aopaspectj"})
@EnableAspectJAutoProxy
public class ConfigAop {
}
