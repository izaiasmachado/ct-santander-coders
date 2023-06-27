public class WorkerSalary {
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
