package part2q2;

import java.util.List;

public class Coles extends SupermarketCheckout {

    @Override
    public String getCardName() {
        return "flybuys";
    }

    @Override
    public String handleMaxItems(List<Item> items) {
        if (items.size() > 20) {
            return "Too many items.";
        }

        return "";
    }

    @Override
    public void printReceipt(List<Item> items) {
        System.out.println("Today at Coles you purchased the following:");
                
        for (Item item : items) {
            System.out.println("- " + item.getName() + " : $" + item.getPrice());
        }
    }
    
}