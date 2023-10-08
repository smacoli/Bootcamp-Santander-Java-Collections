package main.list.operations.List.Operations;

public class CartItems {
    private String itemName;
    private double itemPrice;
    private int itemQuantity;


    public CartItems(String itemName, double itemPrice, int itemQuantity) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }

    public String getItemName(){
        return itemName;
    };

    public double getItemPrice() {
        return itemPrice;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + itemName + '\'' +
                ", preco=" + itemPrice +
                ", quant=" + itemQuantity +
                '}';
    }
}
