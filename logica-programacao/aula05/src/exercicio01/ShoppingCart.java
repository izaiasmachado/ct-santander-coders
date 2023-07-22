package exercicio01;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<CartItem> items = new ArrayList<CartItem>();
    private static String[] promotionalItems = {
            "Pera",
            "Laranja",
            "Maçã",
            "Tomate",
            "Caqui"
    };

    public String[] getPromotionalItems() {
        return promotionalItems;
    }

    public void addItem(String item, int quantity) throws CartException {
        CartItem cartItem = new CartItem(item, quantity);
        this.items.add(cartItem);
    }

    public double getTotalCartItemsPrice() {
        double totalPrice = 0;

        for (CartItem item : this.items) {
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
