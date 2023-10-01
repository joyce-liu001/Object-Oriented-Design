package part2q2;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class CheckoutSystem {
    
    private SupermarketCheckout supermarket;

    private CheckoutSystem(String supermarket) {
        if (supermarket.equals("Coles")) {
            this.supermarket = new Coles();
        } else if (supermarket.equals("Woolies")) {
            this.supermarket = new Woolies();
        }
    }

    public static CheckoutSystem instance(String supermarket) {
        return new CheckoutSystem(supermarket);
    }


    public void checkout(List<Item> items, String paymentMethod, int paymentAmount, boolean receipt) {
        supermarket.checkout(items, paymentMethod, paymentAmount, receipt);
    }

    

    public static void main(String[] args) {
        List<Item> items = new ArrayList<Item>(Arrays.asList(
            new Item("Apple", 1),
            new Item("Orange", 1),
            new Item("Avocado", 5)
        ));

        CheckoutSystem checkout = new CheckoutSystem("Woolies");
        checkout.checkout(items, "cash", 200, true);
    }

}