package operadores;

public class Solution {
    private static double truncatePlaces = 2;
    private static double truncateFactor = Math.pow(10, truncatePlaces);

    public static double[] custosCarro(double[] input) {
        double salePrice = input[0];
        double distributorCost = input[1];
        double taxesCost = input[2];

        double distributorPercentage = distributorCost / salePrice * 100;
        double taxesPercentage = taxesCost / salePrice * 100;

        double truncatedDistributorPercentage = Math.round(distributorPercentage * truncateFactor) / truncateFactor;
        double truncatedTaxesPercentage = Math.round(taxesPercentage * truncateFactor) / truncateFactor;

        double[] output = { truncatedDistributorPercentage, truncatedTaxesPercentage };
        return output;
    }

    public static void main(String[] args) {
        double[] input = {
                238500,
                18350,
                32450

        };
        double[] output = custosCarro(input);

        System.out.println(output[0]);
        System.out.println(output[1]);
    }
}