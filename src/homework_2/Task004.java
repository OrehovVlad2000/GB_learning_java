package com.company.homework_2;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class Task004 {
    public static void main(String[] args) throws IOException {
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

        Logger logger = Logger.getLogger(Task004.class.getName());
        FileHandler fh = new FileHandler("D:/IT/GeekBrains/ДЗ/GB_learning_java/src/com/company/homework_2/log004.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        StringBuilder text = new StringBuilder();

        switch (act) {
            case "+":
                text.append(num1)
                        .append("+")
                        .append(num2)
                        .append("=")
                        .append(num1 + num2);
                System.out.println(text);
                logger.log(Level.INFO, String.valueOf(text));
                break;
            case "-":
                text.append(num1)
                        .append("-")
                        .append(num2)
                        .append("=")
                        .append(num1 - num2);
                System.out.println(text);
                logger.log(Level.INFO, String.valueOf(text));
                break;
            case "*":
                text.append(num1)
                        .append("*")
                        .append(num2)
                        .append("=")
                        .append(num1 * num2);
                System.out.println(text);
                logger.log(Level.INFO, String.valueOf(text));
                break;
            case "/":
                text.append(num1)
                        .append("/")
                        .append(num2)
                        .append("=")
                        .append(num1 / num2);
                System.out.println(text);
                logger.log(Level.INFO, String.valueOf(text));
                break;
            default:
                System.out.println("Ошибка!");
                break;
        }
    }
}