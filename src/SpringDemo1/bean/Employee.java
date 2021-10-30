package SpringDemo1.bean;

public class Employee {

    private String name;
    private String gender;
    // 员工属于某一个部门
    private Dept dept;

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public void print() {
        System.out.println(toString());
        dept.showDeptName();
    }
}
