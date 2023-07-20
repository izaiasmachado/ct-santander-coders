package exercicio07;

public class Triangle {
    private double a, b, c;

    public Triangle(double a, double b, double c) throws LadosInvalidosException {
        this.a = a;
        this.b = b;
        this.c = c;

        if (!this.isTriangle()) {
            throw new LadosInvalidosException(
                    "Lados " + this.a + ", " + this.b + ", " + this.c + " não formam um triângulo");
        }
    }

    public boolean isTriangle() {
        if (this.a > Math.abs(this.b - this.c) && this.a < (this.b + this.c)) {
            return true;
        } else if (this.b > Math.abs(this.a - this.c) && this.b < (this.a + this.c)) {
            return true;
        } else if (this.c > Math.abs(this.a - this.b) && this.c < (this.a + this.b)) {
            return true;
        }

        return false;
    }

    public double getPerimeter() {
        return this.a + this.b + this.c;
    }

    public double calcularArea() {
        double p = this.getPerimeter() / 2;

        if (!this.isTriangle()) {
            return 0;
        }

        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }

    public String toString() {
        String output;

        output = "Triângulo de lados: " + this.a + ", " + this.b + ", " + this.c + "\n";
        output += "Perímetro: " + this.getPerimeter() + "\n";
        output += "Área: " + this.calcularArea();
        output += "\n";

        return output;
    }
}
