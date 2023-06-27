public class Salary {
    private Integer employeeNumber;
    private Integer workedHours;
    private Double hourlyRate;

    public Salary(Integer employeeNumber, Integer workedHours, Double hourlyRate) {
        this.employeeNumber = employeeNumber;
        this.workedHours = workedHours;
        this.hourlyRate = hourlyRate;
    }

    public Double getSalary() {
        return this.workedHours * this.hourlyRate;
    }

    public String toString() {
        return String.format("Matrícula = %d\nSalário = R$ %.2f", this.employeeNumber, this.getSalary());
    }
}
