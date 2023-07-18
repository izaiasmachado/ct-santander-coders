package exercicio06;

public class App {
    public static void main(String[] args) {
        double a = 9;
        double b = 7;
        double c = 14;

        Triangle triangle = new Triangle(a, b, c);
        double area = triangle.calcularArea();
        System.out.println(area);
    }
}
