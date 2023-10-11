package main.list.operations.List.Operations;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<CartItems> itemsList;

    public Cart(){
        this.itemsList = new ArrayList<>();
    }
    public void addItemsToCart(String itemName, double itemPrice, int itemQuantity){
        itemsList.add(new CartItems(itemName, itemPrice, itemQuantity));
    }

    public void removeItemOfCart(String itemName){
        List<CartItems> itemsToRemove = new ArrayList<>();
        if(!itemsList.isEmpty()){
            for (CartItems ci : itemsList){
                if (ci.getItemName().equalsIgnoreCase(itemName)){
                    itemsToRemove.add(ci);
                }
            }
            itemsList.removeAll(itemsToRemove);
        } else {
            System.out.println("Empty list!");
        }
    }

    public double priceAmount(){
        double total = 0;
        if (!itemsList.isEmpty()){
            for (CartItems itemToSum : itemsList){
                total += itemToSum.getItemPrice() * itemToSum.getItemQuantity();
            }
        } else {
            System.out.println("Empty list!");
        }
        return total;
    }

    public void showItems(){
        if (!itemsList.isEmpty()){
            System.out.println(this.itemsList);
        }
    }

    public static void main(String[] args) {
        Cart newCart = new Cart();

        newCart.addItemsToCart("Mouse sem fio", 49.99, 10);
        newCart.addItemsToCart("Mouse com fio", 29.99, 20);
        newCart.addItemsToCart("Teclado sem fio", 129.99, 30);
        newCart.addItemsToCart("Teclado com fio", 89.99, 15);
        newCart.addItemsToCart("Teclado mecânico", 177.90, 5);
        newCart.addItemsToCart("Notebook i7 com ssd", 2.990, 3);
        newCart.addItemsToCart("Notebook i7 com HD", 2.300, 1);
        newCart.addItemsToCart("Drive externo SG", 350.00, 11);

        newCart.showItems();

        newCart.removeItemOfCart("Drive externo SG");

        newCart.showItems();

    }
}
