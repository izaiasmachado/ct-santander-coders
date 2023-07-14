import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Integer> items = new HashMap<String, Integer>();

    private static String[] promotionalItems = {
            "pera",
            "laranja",
            "maçã",
            "tomate",
            "caqui"
    };
    private static int PROMOTIONAL_QUANTITY = 10;
    private static double PROMOTIONAL_PRICE = 1.25;
    private static double REGULAR_PRICE = 1.45;

    public void addItem(String item, int quantity) {
        if (this.items.containsKey(item)) {
            int previousQuantity = this.items.get(item);
            this.items.put(item, previousQuantity + quantity);
        } else {
            this.items.put(item, quantity);
        }
    }

    public int getQuantity(String item) {
        Integer quantity = this.items.get(item);
        return (quantity == null) ? 0 : quantity;
    }

    public boolean isPromotionalItem(String item) {
        for (String promotionalItem : promotionalItems) {
            if (item.equals(promotionalItem)) {
                return true;
            }
        }
        return false;
    }

    public double getIndividualPrice(String item) {
        int quantity = this.getQuantity(item);
        boolean hasPromotionalQuantity = (quantity >= PROMOTIONAL_QUANTITY);
        boolean isPromotionalItem = this.isPromotionalItem(item);
        boolean isPromotionalPrice = isPromotionalItem && hasPromotionalQuantity;
        double individualPrice = (isPromotionalPrice) ? PROMOTIONAL_PRICE : REGULAR_PRICE;
        return individualPrice;
    }

    public double getTotalPrice() {
        double totalPrice = 0;

        for (String item : this.items.keySet()) {
            int quantity = this.items.get(item);
            double individualPrice = this.getIndividualPrice(item);
            totalPrice += quantity * individualPrice;
        }
        return totalPrice;
    }
}
