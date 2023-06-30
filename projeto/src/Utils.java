public class Utils {
    public static String formatCurrencyToString(double value) {
        return String.format("R$ %.2f", value).toString().replace('.', ',');
    }

    public static String formatPercentageToString(double percentage) {
        double percentual = percentage * 100;
        return String.format("%.2f%%", percentual).toString().replace('.', ',');
    }
}
