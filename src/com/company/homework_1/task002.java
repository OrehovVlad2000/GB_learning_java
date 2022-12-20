//Вывести все простые числа от 1 до 1000

package com.company.homework_1;

import java.util.Arrays;

public class task002 {
    public static void main(String[] args) {
        for (int i = 2; i < 1000; ++i) {
            int k = 0;
            for (int j = 2; j <= i; ++j) {
                if (i % j == 0)
                    k++;
            }
            if (k < 2)
                System.out.println(i);
        }
    }
}
