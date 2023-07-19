package exercicio01;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        double[][] entradas = {
                { 100000.00, 12000.00, 20000.00 },
                { 115500.00, 25000.00, 32500.00 },
                { 121000.0, 14350.0, 21450.0 },
                { 238500.0, 18350.0, 32450.0 },
                { 53000.0, 2350.0, 8450.0 },
                { 1250000.0, 124550.0, 225450.0 },
                { 145000.0, 12550.0, 22450.0 },
                { 173000.0, 12450.0, 22540.0 },
                { 111000.0, 12455.0, 22550.0 },
                { 123000.0, 8550.0, 25450.0 },
                { 92000.0, 5450.0, 16450.0 }
        };

        double[][] saidas = {
                { 12.00, 20.00 },
                { 21.65, 28.14 },
                { 11.86, 17.73 },
                { 7.69, 13.61 },
                { 4.43, 15.94 },
                { 9.96, 18.04 },
                { 8.66, 15.48 },
                { 7.20, 13.03 },
                { 11.22, 20.32 },
                { 6.95, 20.69 },
                { 5.92, 17.88 }
        };

        for (int i = 0; i < entradas.length; i++) {
            double[] resultado = custosCarro(entradas[i]);
            double[] esperado = saidas[i];

            System.out.println("Resultado: " + Arrays.toString(resultado));
            System.out.println("Esperado: " + Arrays.toString(esperado));
            System.out.println(Arrays.equals(resultado, esperado));
            System.out.println();
        }
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

    public static double round(double numero) {
        String decimalSeparator = getDecimalSeparator();
        String pattern = String.format("0%s00", decimalSeparator);
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        return Double.parseDouble(decimalFormat.format(numero));
    }

    public static String getDecimalSeparator() {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        return Character.toString(symbols.getDecimalSeparator());
    }
}