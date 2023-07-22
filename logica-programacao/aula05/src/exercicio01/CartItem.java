package exercicio01;

public class CartItem {
    private static int PROMOTIONAL_QUANTITY = 11;
    private static double PROMOTIONAL_PRICE = 1.25;
    private static double REGULAR_PRICE = 1.45;

    private String name;
    private int quantity = 0;

    public CartItem(String name, int quantity) throws CartException {
        this.setName(name);
        this.setQuantity(quantity);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setQuantity(int quantity) throws CartException {
        validateQuantity(quantity);
        this.quantity = quantity;
    }

    public int getQuantity(String item) {
        return quantity;
    }

    public void validateQuantity(int quantity) throws CartException {
        if (quantity == 0)
            throw new CannotLeaveEmptyItem();
        if (quantity < 0)
            throw new CannotAddNegativeNumberOfItems();
    }

    public boolean hasPromotionalPrice() {
        return (this.quantity >= PROMOTIONAL_QUANTITY);
    }

    public double getPrice() {
        boolean isPromotionalPrice = this.hasPromotionalPrice();
        double individualPrice = (isPromotionalPrice) ? PROMOTIONAL_PRICE : REGULAR_PRICE;
        return individualPrice;
    }

    public double getTotalPrice() {
        double individualPrice = this.getPrice();
        return this.quantity * individualPrice;
    }
}
