public class Main {
    public static void main(String[] args) throws Exception {
        // Questão 1
        System.out.println("===== Questão 1 =====");
        Double radius = 10.0;
        Circle arithmetics = new Circle();
        System.out.println("A = " + arithmetics.circleArea(radius));

        // Questão 2
        System.out.println("===== Questão 2 =====");
        String employeeNumber = "123";
        Integer workedHours = 100;
        Double hourlyRate = 5.50;

        Salary salary = new Salary(employeeNumber, workedHours, hourlyRate);
        System.out.println(salary);

        // Questão 3
        System.out.println("===== Questão 3 =====");
        String name = "Jose";
        Double fixedSalary = 500.0;
        Double sales = 1230.30;

        WorkerSalary workersSalary = new WorkerSalary(name, fixedSalary, sales);
        System.out.println(workersSalary);
    }
}
