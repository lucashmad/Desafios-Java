/*
calculando a area, perimetro e diagonal de um retangulo

utilizando Orientação a objetos

 */


import Application.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public final class ChallengerOne {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Rectangle rectangle  = new Rectangle();

        System.out.print("Enter the width measurement: ");
        rectangle.width = scanner.nextDouble();
        System.out.print("Enter height measurement");
        rectangle.height = scanner.nextDouble();

        System.out.println(rectangle.toString());

    }
}
