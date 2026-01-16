package Ex12;

public class Product {

    String name;
    Double price;
    int quantity;

    double totalValueInStock(){
        return price * quantity;
    }

    void addProducts(int quantity){
        this.quantity += quantity;
    }

    void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return name +
                ", " + "$ " + String.format("%.2f", price) +
                ", " + quantity + " units" +
                ", Total: " + "$ " + String.format("%.2f",totalValueInStock());
    }
}
