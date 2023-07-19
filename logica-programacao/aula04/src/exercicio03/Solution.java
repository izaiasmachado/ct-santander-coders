package exercicio03;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        double[][] entradas = {
                { 8.0, 7.0, 8.0, 8.0 },
                { 5.0, 4.3, 8.0, 7.0 },
                { 2.0, 5.0, 8.0, 6.0 },
                { 4.0, 1.0, 9.0, 7.0 },
                { 2.0, 2.0, 10.0, 1.0 },
                { 2.9, 2.5, 10.0, 7.1 },
                { 4.4, 4.1, 8.5, 9.5 },
                { 5.0, 7.0, 9.0, 8.0 },
                { 8.0, 7.0, 8.0, 9.0 },
                { 8.0, 8.0, 10.0, 9.0 },
                { 2.0, 2.0, 5.0, 1.0 }
        };

        String[] saidas = {
                "B",
                "C",
                "C",
                "D",
                "D",
                "C",
                "C",
                "B",
                "B",
                "A",
                "D"
        };

        for (int i = 0; i < entradas.length; i++) {
            String resultado = mediaAproveitamento(entradas[i]);
            String esperado = saidas[i];

            System.out.println("Resultado: " + resultado);
            System.out.println("Esperado: " + esperado);
            System.out.println(resultado.equals(esperado));
            System.out.println();
        }
    }

    public static ArrayList<Double> fromArrayToArrayList(double[] input) {
        ArrayList<Double> grades = new ArrayList<>();

        for (double item : input) {
            grades.add(item);
        }

        return grades;
    }

    public static String mediaAproveitamento(double[] input) {
        double average = getAverage(input);
        String letterGrade = getLetterGrade(average);
        return letterGrade;
    }

    public static double getAverage(double[] input) {
        double exercisesGrade = getExercisesGrade(input);
        ArrayList<Double> testGrades = getTestGrades(input);
        double average = calculateAverage(testGrades, exercisesGrade);
        return average;
    }

    public static String getLetterGrade(double average) {
        if (average >= 9.0) {
            return "A";
        } else if (average >= 7.5 && average < 9.0) {
            return "B";
        } else if (average >= 6.0 && average < 7.5) {
            return "C";
        }

        return "D";
    }

    public static int getExerciseGradeInput(double[] input) {
        return input.length - 1;
    }

    public static ArrayList<Double> getTestGrades(double[] input) {
        ArrayList<Double> testGrades = fromArrayToArrayList(input);
        int exerciseGradeInput = getExerciseGradeInput(input);
        testGrades.remove(exerciseGradeInput);

        return testGrades;
    }

    public static double getExercisesGrade(double[] input) {
        int exerciseGradeInput = getExerciseGradeInput(input);
        return input[exerciseGradeInput];
    }

    public static double calculateAverage(ArrayList<Double> testGrades, double exercisesGrade) {
        double sum = 0;
        double quotient = 0;

        for (int i = 0; i < testGrades.size(); i++) {
            sum += testGrades.get(i) * (i + 1);
            quotient += (i + 1);
        }

        sum += exercisesGrade;
        quotient += 1;

        return sum / quotient;
    }
}
