import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Вычислить n-ое треугольное число (сумма чисел от 1 до n).");
        System.out.println("Введите число: ");
        int a = in.nextInt();
        int triangleNumber = 0;
        ex1(a, triangleNumber);
        System.out.println("Вычислить n! (произведение чисел от 1 до n).");
        System.out.println("Введите число: ");
        int b = in.nextInt();
        int factorNumber = 1;
        ex2(b, factorNumber);
        System.out.println("Вывод всех простых чисел от 1 до 1000: ");
        ex3();
        in = new Scanner(System.in);
        System.out.println("Простой калькулятор.");
        System.out.println("Введите первое число: ");
        double n1 = in.nextDouble();
        System.out.println("Введите второе число: ");
        double n2 = in.nextDouble();
        System.out.println("Введите номер операции (1)'+', (2)'-', (3)'*', (4)'/'): ");
        int operation = in.nextInt();
        ex4(n1, n2, operation);
    }
    static void ex1(int a, int triangleNumber){
        // Вычислить n-ое треугольное число (сумма чисел от 1 до n)
        for (int i = a; i > 0; i--) {
            triangleNumber = triangleNumber + i;
        }
        System.out.println(triangleNumber);
    }
    static void ex2(int b, int factorNumber){
        // Вычислить n! (произведение чисел от 1 до n)
        for (int i = 1; i <= b; i++) {
            factorNumber = factorNumber * i;
        }
        System.out.println(factorNumber);
    }
    static void ex3(){
        // Вывести все простые числа от 1 до 1000 (числа, которые делятся только на 1 и на себя без остатка)
        List<Integer> list = new ArrayList<>();
        int i;
        for (i = 2; i <= 1000; i++) {
            boolean PrimeNumber = true;
            int j;
            for (j = 2; j < i; j++) {
                if (i % j == 0){
                    PrimeNumber = false;
                    break;
                }
            }
            if(PrimeNumber){
                list.add(i);
            }
        }
        System.out.println(list);
    }

    static void ex4(double n1, double n2, int operation){
        /*
         Реализовать простой калькулятор (введите первое число, введите второе число,
         введите требуемую операцию, ответ)
         */
        double result = 0;
        if(operation == 1){
            result = n1 + n2;
        } else if (operation == 2) {
            result = n1 - n2;
        } else if (operation == 3) {
            result = n1 * n2;
        } else if (operation == 4) {
            result = n1 / n2;
        }
        System.out.format("%.3f", result);
    }
}
