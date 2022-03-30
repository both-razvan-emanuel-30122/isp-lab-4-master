package isp.lab3.exercise5;

public class Product {
    public String name;
    public int id;

    public Product(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
Razvan
Razvan Both
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class VendingMachine {

    public List<Product> Products;
    public int credit;

    public VendingMachine(List<Product> products, int credit) {
        Products = products;
        this.credit = credit;
    }

    public List<Product> getProducts() {
        return Products;
    }

    public void setProducts(List<Product> products) {
        Products = products;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }


    void displayProducts(){
        for (Product P: this.getProducts()
             ) {
            System.out.println(P);
        }
    }

    public void insertCoin(){
        this.credit++;
    }

    public String SelectProduct(int id){
        for (Product P: this.getProducts()
             ) {
            if(P.getId() == id){
                return P.getName();
            }
        }
        return "Product not found";
    }

    public void UserMenu(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write your command" +
                "1 : all products" +
                "2 : select a product" +
                "3 : add a coin");

        if(Objects.equals(scanner.next(), "1")){
            this.getProducts();
        }

        if(Objects.equals(scanner.next(), "2")){
            int id = Integer.parseInt(scanner.next());

            this.SelectProduct(id);
        }

        if(Objects.equals(scanner.next(), "3")){
            this.insertCoin();
        }
    }
}
