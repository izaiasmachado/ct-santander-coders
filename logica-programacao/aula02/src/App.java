public class App {
    public static void main(String[] args) throws Exception {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("pera", 5);
        cart.addItem("laranja", 10);

        System.out.println("Total price: " + cart.getTotalPrice());
    }

}
