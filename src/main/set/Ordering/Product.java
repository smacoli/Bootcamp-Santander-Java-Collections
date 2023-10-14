package main.set.Ordering;

import java.util.Comparator;
import java.util.Objects;

public class Product implements Comparable<Product>{
    private String prodName;
    private long code;
    private double price;
    private int quantity;

    public Product(String prodName, long code, double price, int quantity){
        this.prodName = prodName;
        this.code = code;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return getCode() == product.getCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCode());
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodName='" + prodName + '\'' +
                ", code=" + code +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    /* Determina que a ordem em que o Set será organizado é pelo nome dos produtos */
    @Override
    public int compareTo(Product o) {
        return prodName.compareToIgnoreCase(o.getProdName());
    }
}

class ComparatorByPrice implements Comparator<Product>{
    @Override
    public int compare(Product o1, Product o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}