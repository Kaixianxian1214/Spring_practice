package SpringDemo2.collectionType;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Stu {

    //1 数组类型属性
    private String[] courses;
    //2 list集合类型
    private List<String> list;
    //3 Map集合属性
    private Map<String, String> maps;
    //4 Set集合属性
    private Set<String> set;
    //5 学生学习多门课程
    private List<Course> courseList;

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void print(){
        System.out.println("数组:" + Arrays.toString(courses));
        System.out.println("List:" + list);
        System.out.println("Map:"+maps);
        System.out.println("Set:"+set);
        System.out.println(courseList);
    }
}
