//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package homework_1;
import java.util.Scanner;

public class Task001 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Enter a number:");
        int num = iScanner.nextInt();
        iScanner.close();

        int sum = 0;
        int mult = 1;

        for (int i = 1; i <= num; i++) {
            sum += i;
            mult *= i;
        }
        System.out.printf("Сумма = %d, Произведение = %d", sum, mult);
    }
}
