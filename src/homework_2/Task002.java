//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
package com.company.homework_2;

import java.util.Arrays;
import java.io.IOException;
import java.util.logging.*;

public class Task002 {
    public static void main(String[] args) throws IOException {
        int[] array = {1, 7, -3, 9, 0, -67, 34, 12, 45, 1000, 6, 8, -2, 99};
        Logger logger = Logger.getLogger(Task002.class.getName());
        FileHandler fh = new FileHandler("D:/IT/GeekBrains/ДЗ/GB_learning_java/src/com/company/homework_2/sortLog.xml");
        int len = array.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                logger.addHandler(fh);
                XMLFormatter xml = new XMLFormatter();
                fh.setFormatter(xml);
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                logger.log(Level.INFO, Arrays.toString(array));
            }
        }
    }
}
