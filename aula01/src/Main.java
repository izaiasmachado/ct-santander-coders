public class Main {
    public static void main(String[] args) throws Exception {
        // Questão 1
        System.out.println("===== Questão 1 =====");
        Double radius = 10.0;
        Circle arithmetics = new Circle();
        System.out.println("A = " + arithmetics.circleArea(radius));

        // Questão 2
        System.out.println("===== Questão 2 =====");
        Integer employeeNumber = 25;
        Integer workedHours = 100;
        Double hourlyRate = 5.0;

        Salary salary = new Salary(employeeNumber, workedHours, hourlyRate);
        System.out.println(salary);

        // Questão 3
        System.out.println("===== Questão 3 =====");
        String name = "João";
        Double fixedSalary = 1000.0;
        Double sales = 1000.0;

        WorkerSalary workersSalary = new WorkerSalary(name, fixedSalary, sales);
        System.out.println(workersSalary);
    }
}
