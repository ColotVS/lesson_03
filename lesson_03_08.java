import java.util.Scanner;

public class lesson_03_08 {
    public static void main(String[] args) {
        /*Ввести с клавиатуры два целых числа, которые будут координатами точки
        (первое считанное число - это координата "x", а второе - координата "y").
        Известно, что точка не лежит на координатных осях OX и OY.
        Вывести на экран номер координатной четверти, в которой находится данная точка.
        Подсказка:
        Принадлежность точки с координатами (x, y) к одной из четвертей определяется следующим образом:
        для первой четверти x>0 и y>0;
        для второй четверти x<0 и y>0;
        для третьей четверти x<0 и y<0;
        для четвертой четверти x>0 и y<0.*/
        Scanner cord = new Scanner(System.in);
        int x = cord.nextInt();
        int y = cord.nextInt();
        if (x>0 && y>0)
            System.out.println("1");
        else if (x<0 && y>0)
            System.out.println("2");
        else if (x<0 && y<0)
            System.out.println("3");
        else if (x>0 && y<0)
            System.out.println("4");
    }
}
