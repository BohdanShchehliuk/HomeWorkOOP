package NewPackage;

import java.util.Scanner;

public class Rectangle {
    private double side1;
    private double side2;

    public static double areaCalculator(double side1, double side2) {
        return side1 * side2;
    }

    public static double perimeterCalculator(double side1, double side2) {
        return (side1 + side2) * 2;
    }

    public static void main(String[] agr) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть side1");
        double side1 = input.nextDouble();
        System.out.println("Введіть side2");
        input = new Scanner(System.in);
        double side2 = input.nextDouble();

        System.out.println(areaCalculator(side1, side2));
        System.out.println(perimeterCalculator(side1, side2));

    }
}
