package DI;

public class Customer {
    String name;
    Address address;

    // Constructor Injection.
    public Customer(){
        System.out.println("----------Object created----------------");
    }

    public Customer(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    // setter Injection
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    void init(){
        System.out.println("---------------Object created------------------");
    }
    void destroy(){
        System.out.println("--------------Object Destroyed-----------------");
    }
}
