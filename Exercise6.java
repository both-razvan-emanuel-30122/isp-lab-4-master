package isp.lab3.exercise6;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class VendingMachine {

    public List<Product> Products;
    public int credit;
    public VendingMachine instance = null;
    private VendingMachine() {
        instance.Products = null;
        instance.credit = 0;
    }
    
    public VendingMachine getInstace(){
        if(this.instance == null){
            this.instance = new VendingMachine();
        }
        return instance;
    }
    
    public List<Product> getProducts() {
        return instance.Products;
    }

    public void setProducts(List<Product> products) {
        instance.Products = products;
    }

    public int getCredit() {
        return instance.credit;
    }

    public void setCredit(int credit) {
        instance.credit = credit;
    }


    void displayProducts(){
        for (Product P: instance.getProducts()
             ) {
            System.out.println(P);
        }
    }

    public void insertCoin(){
        instance.credit++;
    }

    public String SelectProduct(int id){
        for (Product P: instance.getProducts()
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
            instance.getProducts();
        }

        if(Objects.equals(scanner.next(), "2")){
            int id = Integer.parseInt(scanner.next());

            instance.SelectProduct(id);
        }

        if(Objects.equals(scanner.next(), "3")){
            instance.insertCoin();
        }
    }
}