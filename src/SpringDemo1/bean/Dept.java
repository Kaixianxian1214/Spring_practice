package SpringDemo1.bean;

// 部门类
public class Dept {

    private String deptName;

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void showDeptName(){
        System.out.println(deptName + "..........");
    }
}
