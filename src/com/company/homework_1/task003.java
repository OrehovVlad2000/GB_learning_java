//Реализовать простой калькулятор

package com.company.homework_1;
import java.util.Scanner;

public class Task003 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Enter the first number:");
        while (!iScanner.hasNextInt()){
            iScanner.next();
            System.out.println("Вы ввели не цифру, попробуйте ещё раз!");
        }
        int num1 = iScanner.nextInt();

        System.out.printf("Enter the second number:");
        while (!iScanner.hasNextInt()){
            iScanner.next();
            System.out.println("Вы ввели не цифру, попробуйте ещё раз!");
        }
        int num2 = iScanner.nextInt();

        System.out.printf("Enter action (+, -, *, /):");
        String act = iScanner.next();
        iScanner.close();


        if (act.equals("+")) System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
        else if (act.equals("-")) System.out.printf("%d - %d = %d", num1, num2, num1 - num2);
        else if (act.equals("*")) System.out.printf("%d * %d = %d", num1, num2, num1 * num2);
        else if (act.equals("/") && num2 != 0) System.out.printf("%d / %d = %d", num1, num2, num1 / num2);
        else if (act.equals("/") && num2 == 0) System.out.println("На ноль делить нельзя!");
        else System.out.println("Вы ввели некорректное выражение!");
    }
}
