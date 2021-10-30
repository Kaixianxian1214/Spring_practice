package SpringDemo2.bean;

public class Orders {

    private String oderName;

    // 无参数构造方法
    public Orders() {
        System.out.println("first step");
    }

    // orderName的属性set方法
    public void setOderName(String oderName) {
        this.oderName = oderName;
        System.out.println("second step");
    }

    // 初始化方法
    public void initOrders(){
        System.out.println("third step");
    }

    // 销毁方法
    public void destroyOrders(){
        System.out.println("fifth step");
    }
}
