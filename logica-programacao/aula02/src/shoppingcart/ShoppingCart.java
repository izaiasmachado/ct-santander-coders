package shoppingcart;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Integer> items = new HashMap<String, Integer>();

    private static String[] promotionalItems = {
            "Pera",
            "Laranja",
            "Maçã",
            "Tomate",
            "Caqui"
    };
    private static int PROMOTIONAL_QUANTITY = 11;
    private static double PROMOTIONAL_PRICE = 1.25;
    private static double REGULAR_PRICE = 1.45;

    public String[] getPromotionalItems() {
        return promotionalItems;
    }

    public int getQuantity(String item) {
        Integer quantity = this.items.get(item);
        return (quantity == null) ? 0 : quantity;
    }

    public void addItem(String item, int quantity) {
        int totalQuantity = this.getQuantity(item) + quantity;
        this.items.put(item, totalQuantity);
    }

    public boolean hasPromotionalPrice(int quantity) {
        return (quantity >= PROMOTIONAL_QUANTITY);
    }

    public double getIndividualPrice(int quantity) {
        boolean isPromotionalPrice = this.hasPromotionalPrice(quantity);
        double individualPrice = (isPromotionalPrice) ? PROMOTIONAL_PRICE : REGULAR_PRICE;
        return individualPrice;
    }

    public double getTotalPrice() {
        double totalPrice = 0;

        for (String item : this.items.keySet()) {
            int quantity = this.items.get(item);
            double individualPrice = this.getIndividualPrice(quantity);
            totalPrice += quantity * individualPrice;
        }
        return totalPrice;
    }
}
