package SpringDemo2.factoryBean;

import SpringDemo2.collectionType.Course;
import org.springframework.beans.factory.FactoryBean;

public class MyBean implements FactoryBean<Course> {

    // 定义一下返回bean
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("java");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
