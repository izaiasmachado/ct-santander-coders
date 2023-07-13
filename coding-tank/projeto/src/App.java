import java.util.ArrayList;

public class App {
    protected static ArrayList<Employee> funcionarios = new ArrayList<Employee>();
    protected static int NUMBER_OF_EMPLOYEES = 5;

    public static void main(String[] args) throws Exception {
        int numberOfEmployees = NUMBER_OF_EMPLOYEES;

        createEmployees(numberOfEmployees);
        scanEmployeesSalary(funcionarios);
        printEmployees(funcionarios);
    }

    public static void createEmployees(int numberOfEmployees) {
        for (int i = 0; i < numberOfEmployees; i++) {
            Employee employee = new Employee();
            employee.setId(i + 1);
            funcionarios.add(employee);
        }
    }

    public static void scanEmployeesSalary(ArrayList<Employee> employees) {
        for (Employee employee : employees) {
            String prompt = String.format("Digite o salário bruto do funcionário %d: ", employee.getId());
            double grossIncome = ScannerUtils.getDoubleInput(prompt);
            employee.setGrossIncome(grossIncome);
        }

        System.out.println();
    }

    public static void printEmployees(ArrayList<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
