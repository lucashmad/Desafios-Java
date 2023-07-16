/*
calculando as as areas das figuras geometricas
 */

import java.util.Locale;
import java.util.Scanner;

public class ChallengeSeven {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner string = new Scanner(System.in);

        double base, sides, height, triangle, circle, trapeze, square, rectangle;
        double radianPi = 3.14159;

        System.out.print("Base: ");
        base = string.nextDouble();
        System.out.print("Sides: ");
        sides = string.nextDouble();
        System.out.print("Height: ");
        height = string.nextDouble();

        triangle = base * height / 2.0;
        circle = radianPi * height * height;
        trapeze = (base + sides) * height / 2.0;
        square = Math.pow(sides, 2);
        rectangle = base * sides;

        System.out.printf("\nTriangle: %.3f\n", triangle);
        System.out.printf("Circle: %.3f\n", circle);
        System.out.printf("Trapezio: %.3f\n", trapeze);
        System.out.printf("Square: %.3f\n", square);
        System.out.printf("Rectangle: %.3f\n", rectangle);

        string.close();
    }
}
