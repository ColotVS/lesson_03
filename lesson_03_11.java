import java.util.Scanner;

public class lesson_03_11 {
    public static void main(String[] args) {
        /*Напиши программу, которая считывает с клавиатуры две строки и выдает сообщение о том, одинаковые ли эти строки.*/
        Scanner str = new Scanner(System.in);
        String str1 = str.nextLine();
        String str2 = str.nextLine();
        if (str1.equals(str2))
            System.out.println("строки одинаковые");
        else
            System.out.println("строки разные");
    }
}
