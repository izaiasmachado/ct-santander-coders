package exercicio01;

import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        ShoppingCart cart = new ShoppingCart();
        askForItems(cart);
        printTotalPrice(cart);
    }

    public static void askForItems(ShoppingCart cart) {
        String[] items = cart.getPromotionalItems();

        for (String item : items) {
            handleAskForCartItem(cart, item);
        }
    }

    public static void handleAskForCartItem(ShoppingCart cart, String item) {
        try {
            askForItem(cart, item);
        } catch (CartException e) {
            System.out.println(e.getMessage());
            handleAskForCartItem(cart, item);
        }
    }

    public static void askForItem(ShoppingCart cart, String item) throws CartException {
        System.out.printf("Digite a quantidade de %ss: ", item);
        int quantity = scanner.nextInt();
        cart.addItem(item, quantity);
    }

    public static void printTotalPrice(ShoppingCart cart) {
        double totalPrice = cart.getTotalCartItemsPrice();
        System.out.printf("Preço total da compra: R$ %.2f\n", totalPrice);
    }
}
