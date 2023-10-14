package main.set.Ordering;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProductRegistration {
    private Set<Product> stock;

    public ProductRegistration(){
        this.stock = new HashSet<>();
    }

    public void addProduct(String name, long code, double price, int quantity){
        stock.add(new Product(name, code, price, quantity));
    }

    public Set<Product> showProductsByName(){
        Set<Product> productsByName = new TreeSet<>(stock);
        return productsByName;
    }

    public Set<Product> showProductsByPrice(){
        Set<Product> productsByPrice = new TreeSet<>(new ComparatorByPrice());
        productsByPrice.addAll(stock);
        return productsByPrice;
    }
    public static void main(String[] args) {
        ProductRegistration productRegistration = new ProductRegistration();

        productRegistration.addProduct("Mouse sem fio", 1, 45.99, 10);
        productRegistration.addProduct("Mouse com fio", 1, 31.99, 20);
        productRegistration.addProduct("Teclado sem fio", 3, 112.99, 11);
        productRegistration.addProduct("Teclado com fio", 4, 89.99, 30);
        productRegistration.addProduct("Monitor 4k", 5, 1115.99, 2);
        productRegistration.addProduct("PC Gamer", 6, 6999.99, 5);
        productRegistration.addProduct("Filtro de linha", 7, 29.99, 30);

        System.out.println(productRegistration.showProductsByName());

        System.out.println(productRegistration.showProductsByPrice());
    }
}
