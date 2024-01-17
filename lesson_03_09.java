import java.util.Scanner;

public class lesson_03_09 {
    public static void main(String[] args) {
        /*У нас есть программа, которая считывает с клавиатуры два числа и выводит на экран большее из них.
        Если числа одинаковые, то выводится любое.
        Перепиши программу с использованием тернарного оператора, чтобы ее функционал остался без изменений.*/
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a>b ? a : b);
    }
}
