package SpringDemo2.autowire;

public class Employee {

    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "dept=" + dept +
                '}';
    }

    public void print(){
        System.out.println(toString());
    }
}
