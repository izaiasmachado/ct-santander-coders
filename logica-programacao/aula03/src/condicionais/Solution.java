package condicionais;

public class Solution {
    private static double PROMOTIONAL_PRICE = 1.25;
    private static double REGULAR_PRICE = 1.45;
    private static int PROMOTIONAL_QUANTITY = 11;

    public static double custoCompra(double input) {
        if (input >= PROMOTIONAL_QUANTITY) {
            return input * PROMOTIONAL_PRICE;
        }

        return input * REGULAR_PRICE;
    }

    public static void main(String[] args) {
        double input = 10;
        double output = custoCompra(input);

        System.out.println(output);
    }
}