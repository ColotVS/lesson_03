import java.util.Scanner;

public class lesson_03_13 {
    public static String secret = "AmIGo";
    public static void main(String[] args) {
        /*Амиго создал секретное слово для доступа к закрытой информации,
        но у него сломалась клавиатура, и теперь невозможно набирать буквы в верхнем регистре.
        Напиши программу, которая будет сравнивать введенную строку со строкой из переменной secret, не учитывая регистр.
        Если введенная строка равна строке из переменной secret, программа выводит на экран сообщение "доступ разрешен".
        В ином случае - "доступ запрещен".*/
        Scanner pass = new Scanner(System.in);
        String pass1 = pass.nextLine();
        if (pass1.equalsIgnoreCase(secret))
            System.out.println("доступ разрешен");
        else
            System.out.println("доступ запрещен");
    }
}
