package exercicio06;

public class App {
    public static void main(String[] args) {
        double a = 9;
        double b = 7;
        double c = 14;

        Triangle triangle = new Triangle(a, b, c);
        double area = triangle.calcularArea();

        System.out.println(area);

        Triangle triangle2 = new Triangle(3, 4, 5);
        double area2 = triangle2.calcularArea();

        System.out.println(area2);

        Triangle triangle3 = new Triangle(3, 4, 10);
        double area3 = triangle3.calcularArea();

        System.out.println(area3);
    }
}
