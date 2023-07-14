import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        ShoppingCart cart = new ShoppingCart();

        askForItems(cart);
        printTotalPrice(cart);
    }

    public static void askForItem(ShoppingCart cart) {
        System.out.println("Digite o nome do: ");
        String item = scanner.nextLine();

        System.out.println("Digite a quantidade: ");
        int quantity = scanner.nextInt();

        cart.addItem(item, quantity);
    }

    public static void askForItems(ShoppingCart cart) {
        boolean shouldAskForItem = true;

        while (shouldAskForItem) {
            askForItem(cart);

            System.out.println("Você quer adicionar outro item? [s/n]");
            String answer = scanner.nextLine();

            shouldAskForItem = answer.equals("s");
        }
    }

    public static void printTotalPrice(ShoppingCart cart) {
        double totalPrice = cart.getTotalPrice();
        System.out.printf("Preço total da compra: R$ %.2f\n", totalPrice);
    }
}
