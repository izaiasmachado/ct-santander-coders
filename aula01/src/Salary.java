public class Salary {
    private String employeeNumber;
    private Integer workedHours;
    private Double hourlyRate;

    public Salary(String employeeNumber, Integer workedHours, Double hourlyRate) {
        this.employeeNumber = employeeNumber;
        this.workedHours = workedHours;
        this.hourlyRate = hourlyRate;
    }

    public Double getSalary() {
        return this.workedHours * this.hourlyRate;
    }

    public String toString() {
        return String.format("Matrícula = %s\nSalário = R$ %.2f", this.employeeNumber, this.getSalary());
    }
}
