package main.map.Search;

import java.util.HashMap;
import java.util.Map;

public class ProductRegistration {
    private Map<Long, Product> stock;

    public ProductRegistration() {
        this.stock = new HashMap<>();
    }

    public void addProduct(long cod, String prName, int prQuantity, double prPrice){
        stock.put(cod, new Product(prName, prQuantity, prPrice));
    }

    public void showProduct(){
        System.out.println(stock);
    }

    public double total(){
        double stockTotal = 0d;
        if (!stock.isEmpty()){
            for (Product p : stock.values()){
                stockTotal += p.getQuantity()*p.getPrice();
            }
        }
        return stockTotal;
    }

    public Product mostExpensiveProduct(){
        Product meProd = null;
        double biggestPrice = Double.MIN_VALUE;
        if (!stock.isEmpty()) {
            for (Product p : stock.values()) {
                if (p.getPrice() > biggestPrice) {
                    biggestPrice = p.getPrice();
                    meProd = p;
                }
            }
        }
        return meProd;
    }

    public Product leastExpensiveProduct(){
        Product leProd = null;
        double lowestPrice = Double.MAX_VALUE;
        if (!stock.isEmpty()) {
            for (Product p : stock.values()) {
                if (p.getPrice() < lowestPrice) {
                    lowestPrice = p.getPrice();
                    leProd = p;
                }
            }
        }
        return leProd;
    }

    public Product biggestQntBiggestPrice(){
        Product biggestQnt = null;
        double highestPrice = 0d;

        if (!stock.isEmpty()) {
            for (Map.Entry<Long, Product> entry : stock.entrySet()){
                double productPrice = entry.getValue().getPrice() * entry.getValue().getQuantity();
                if (productPrice > highestPrice){
                    highestPrice = productPrice;
                    biggestQnt = entry.getValue();
                }
            }
        }
        return biggestQnt;
    }

    public static void main(String[] args) {
        ProductRegistration productRegistration = new ProductRegistration();

        productRegistration.addProduct(1, "A", 10, 19.9);
        productRegistration.addProduct(2, "B", 15, 20.9);
        productRegistration.addProduct(6, "C", 1, 350.0);
        productRegistration.addProduct(3, "D", 1, 370.0);
        productRegistration.addProduct(4, "E", 32, 18.9);
        productRegistration.addProduct(5, "F", 16, 12.9);

        productRegistration.showProduct();

        System.out.println("Total do estoque: " + productRegistration.total());
        System.out.println("Produto mais caro: " + productRegistration.mostExpensiveProduct());
        System.out.println("Produto mais barato: " + productRegistration.leastExpensiveProduct());
        System.out.println("Produto com maior total $ em estoque: " + productRegistration.biggestQntBiggestPrice());
    }
}


