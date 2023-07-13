import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.DecimalFormatSymbols;

public class ScannerUtils {
    private static Scanner scanner = new Scanner(System.in);

    /**
     * The decimal separator can be different depending on the operating system
     * regional settings.
     */
    public static String getDecimalSeparator() {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        return Character.toString(symbols.getDecimalSeparator());
    }

    public static double getDoubleInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                String decimalSeparator = getDecimalSeparator();
                String decimalSeparatorString = decimalSeparator.equals(".") ? "ponto" : "vírgula";
                System.out.printf(
                        "Valor inválido. Digite um número válido, utilizando %s (%s) como separador decimal.\n",
                        decimalSeparatorString, decimalSeparator);
                scanner.nextLine();
            }
        }
    }
}
