package exercicio07;

import java.util.ArrayList;

public class Triangle {
    private ArrayList<Integer> sides;

    public Triangle(int[] input) throws LadosInvalidosException {
        setSides(input);

        if (!this.isTriangle()) {
            throw new LadosInvalidosException();
        }
    }

    public void setSides(int[] sourceSides) throws LadosInvalidosException {
        sides = new ArrayList<>();

        for (int side : sourceSides) {
            sides.add(side);
        }

        sides.sort(null);
    }

    public boolean isTriangle() {
        if (sides.size() != 3) {
            return false;
        }

        int biggest = sides.get(2);
        int sum = sides.get(0) + sides.get(1);
        int diff = sides.get(1) - sides.get(0);

        if (biggest > diff && biggest < sum) {
            return true;
        }

        return false;
    }

    public int getPerimeter() {
        int sum = 0;

        for (int side : sides) {
            sum += side;
        }

        return sum;
    }
}
