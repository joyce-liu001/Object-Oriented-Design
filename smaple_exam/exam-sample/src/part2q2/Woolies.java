package part2q2;

import java.util.List;

public class Woolies extends SupermarketCheckout {

    @Override
    public String getCardName() {
        return "Everyday Rewards";
    }

    @Override
    public String handleMaxItems(List<Item> items) {
        if (items.size() >= 50) {
            return "Sorry, that's more than we can handle in a single order!";
        }

        return "";
    }

    @Override
    public void printReceipt(List<Item> items) {
        System.out.print("Your purchase: ");
    
        for (int i = 0; i < items.size() - 1; i++) {
            System.out.print(items.get(i).getName() + ", ($" + items.get(i).getPrice() + "), ");
        }
        System.out.println(items.get(items.size() - 1).getName() + " ($" + items.get(items.size() - 1).getPrice() + ").");
    }
     
}