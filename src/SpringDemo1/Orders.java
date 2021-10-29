package SpringDemo1;

public class Orders {

    private String name;
    private String address;

    public Orders() {
    }

    public Orders(String name, String address){
        this.name = name;
        this.address = address;
    }

    public void print(){
        System.out.println(name + address + "坚强！");
    }
}
