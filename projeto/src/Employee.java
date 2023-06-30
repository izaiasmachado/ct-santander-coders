import java.util.Formatter;

public class Employee {
    private int id;
    private double grossIncome;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public double getGrossIncome() {
        return this.grossIncome;
    }

    public void setGrossIncome(double grossIncome) {
        this.grossIncome = grossIncome;
    }

    public double getInss() {
        double inssDiscount = this.getInssPercentage();
        return this.grossIncome * inssDiscount;
    }

    public double getInssPercentage() {
        if (this.grossIncome <= 1212.00)
            return 0.075;
        if (this.grossIncome <= 2427.35)
            return 0.09;
        if (this.grossIncome <= 3641.03)
            return 0.12;
        if (this.grossIncome <= 7087.22)
            return 0.14;
        return 0.14;
    }

    public double getTax() {
        double taxDiscount = this.getTaxPercentage();
        return this.grossIncome * taxDiscount;
    }

    public double getTaxPercentage() {
        if (this.grossIncome <= 1903.98)
            return 0;
        if (this.grossIncome <= 2826.65)
            return 0.075;
        if (this.grossIncome <= 3751.05)
            return 0.15;
        if (this.grossIncome <= 4664.68)
            return 0.225;
        return 0.275;
    }

    public double getLiquidIncome() {
        double inss = this.getInss();
        double tax = this.getTax();
        return this.grossIncome - inss - tax;
    }

    public String toString() {
        /**
         * Fix output precision to 2, currency format and percentage format
         */
        Formatter formatter = new Formatter();
        String grossIncomeToString = Utils.formatCurrencyToString(this.getGrossIncome());
        String inssToString = Utils.formatCurrencyToString(this.getInss());
        String taxToString = Utils.formatCurrencyToString(this.getTax());
        String liquidIncomeToString = Utils.formatCurrencyToString(this.getLiquidIncome());
        String inssPercentageToString = Utils.formatPercentageToString(this.getInssPercentage());
        String taxPercentageToString = Utils.formatPercentageToString(this.getTaxPercentage());

        formatter.format("===== Relatório de Salário do Funcionário %d =====\n", this.id);
        formatter.format("Salário Bruto: %s\n", grossIncomeToString);
        formatter.format("INSS (Alíquota %s): %s\n", inssPercentageToString, inssToString);
        formatter.format("Imposto de Renda (Alíquota %s): %s\n", taxPercentageToString, taxToString);
        formatter.format("Salário Líquido: %s\n", liquidIncomeToString);

        String output = formatter.toString();
        formatter.close();

        return output;
    }
}
