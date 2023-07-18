package exercicio06;

import java.util.Scanner;

public class App {
    // Triangle triangle = new Triangle(9, 7, 14);
    // Triangle triangle2 = new Triangle(3, 4, 5);
    // Triangle triangle3 = new Triangle(3, 4, 10);

    public static void main(String[] args) {
        try {
            Triangle triangle = scanTriangle();
            String triangleString = triangle.toString();
            System.out.println(triangleString);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static Triangle scanTriangle() {
        Scanner scanner = new Scanner(System.in);
        Triangle triangle = null;

        System.out.println("Digite o lado A do triângulo:");
        String sideAString = scanner.nextLine();
        double a = Double.parseDouble(sideAString);

        System.out.println("Digite o lado B do triângulo:");
        String sideBString = scanner.nextLine();
        double b = Double.parseDouble(sideBString);

        System.out.println("Digite o lado C do triângulo:");
        String sideCString = scanner.nextLine();
        double c = Double.parseDouble(sideCString);

        triangle = new Triangle(a, b, c);

        scanner.close();
        return triangle;
    }
}
