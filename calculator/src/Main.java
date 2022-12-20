import java.util.Scanner;
import java.math.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//S=t*a_/c*b

        double t = 1.3;
        int c = 254;
        int a = getA();
        float b = getB();
        double a_ = (a*a);

        double p = (t * a_);

        double k = (c * b);

        double h = p/k;

        int m = (int) Math. floor(h);
        System.out.println("Тормозной путь: " + m +" м");

    }

    public static int getA() {
        System.out.println("Введите скорость (км/ч): ");
        int num;
        if (scanner.hasNextInt()) {
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();//рекурсия
            num = getA();
        }
        return num;
    }

    public static float getB() {
        float b1;
        System.out.print("1--Асфальтовое покрытие\n" +
                "2--Щебеночное покрытие\n" +
                "3--Грунтовая дорога\n" +
                "4--Укатанное снежное покрытие\n" +
                "5--Обледенелое покрытие\n" +
                "Укажите покрытие (цифра): ");
        int operation = scanner.nextInt();



            if (operation == 1) {
                b1 = 0.7f;
                System.out.println("Ожидайте результат...");
            }
            else if (operation == 2) {
                b1 = 0.6f;
                System.out.println("Ожидайте результат...");
            }
            else if (operation == 3) {
                b1 = 0.5f;
                System.out.println("Ожидайте результат...");
            }
            else if (operation == 4) {
                b1 = 0.3f;
                System.out.println("Ожидайте результат...");
            }
            else if (operation == 5) {
                b1 = 0.2f;
                System.out.println("Ожидайте результат...");
            } else {
                System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
                scanner.next();
                b1 = getB();
            }
            return b1;


    }

}




