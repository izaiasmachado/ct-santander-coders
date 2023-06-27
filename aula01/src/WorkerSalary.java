public class WorkerSalary {
    // Escreva um programa que tenha o nome de um vendedor, o seu salário fixo e o
    // total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este
    // vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total
    // a receber no final do mês, com duas casas decimais.

    static final Double COMMISSION = 0.15;

    Double fixedSalary;
    Double sales;
    String name;

    public WorkerSalary(String name, Double fixedSalary, Double sales) {
        this.name = name;
        this.fixedSalary = fixedSalary;
        this.sales = sales;
    }

    public Double getSalary() {
        return this.fixedSalary + (this.sales * COMMISSION);
    }

    public String toString() {
        return String.format("Nome = %s\nSalário Total = R$ %.2f", this.name, this.getSalary());
    }
}
