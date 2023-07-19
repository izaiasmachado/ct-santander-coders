package exercicio02;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Solution {
    public static double round(double input) {
        double truncatePlaces = 2;
        double truncateFactor = Math.pow(10, truncatePlaces);

        BigDecimal bd = new BigDecimal(input * truncateFactor / truncateFactor);
        bd = bd.setScale(3, RoundingMode.DOWN);
        bd = bd.setScale(2, RoundingMode.HALF_DOWN);

        return bd.doubleValue();
    }

    public static double[] custosCarro(double[] input) {
        double salePrice = input[0];
        double distributorCost = input[1];
        double taxesCost = input[2];

        double distributorPercentage = distributorCost / salePrice * 100;
        double taxesPercentage = taxesCost / salePrice * 100;

        double roundedDistributorPercentage = round(distributorPercentage);
        double roundedTaxesPercentage = round(taxesPercentage);

        double[] output = { roundedDistributorPercentage, roundedTaxesPercentage };
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