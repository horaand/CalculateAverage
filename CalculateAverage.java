package CalculateAverage;

import java.util.Scanner;

public class CalculateAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number: ");
        int num1 = scanner.nextInt();

        System.out.println("Second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Third number: ");
        int num3 = scanner.nextInt();

        System.out.println("Fourth number: ");
        int num4 = scanner.nextInt();

        System.out.println("Fifth number: ");
        int num5 = scanner.nextInt();

        int[] numbers ={num1, num2, num3, num4, num5};


        double average= (num1 + num2 + num3 + num4 + num5) / (double)(numbers.length);

        System.out.println("Results: " + average);
    }
}
