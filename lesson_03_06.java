import java.util.Scanner;

public class lesson_03_06 {
    private static final String TRIANGLE_EXISTS = "треугольник существует";
    private static final String TRIANGLE_NOT_EXISTS = "треугольник не существует";
    public static void main(String[] args) {
        /*Напишем программу, которая будет просчитывать возможность существования треугольника на основе длин его сторон.
        Для этого тебе нужно:
        Ввести с клавиатуры три числа – длины сторон предполагаемого треугольника.
        Определить возможность существования треугольника по сторонам.
        Результат вывести на экран в следующем виде: "треугольник существует" или "треугольник не существует".
        Чтобы это выяснить, нужно сравнить каждую сторону с суммой двух других.
        То есть, тебе нужно выполнить три сравнения:

        Если в каждом сравнении сторона меньше суммы двух других, то треугольник с такими сторонами существует.
        Если хотя бы в одном случае сравнения одна сторона окажется больше или равна сумме двух других,
        то треугольника с такими сторонами не существует.*/
        Scanner triangle = new Scanner(System.in);
        int st1 = triangle.nextInt();
        int st2 = triangle.nextInt();
        int st3 = triangle.nextInt();
        if (st1<(st2+st3) && st2<(st1+st3) && st3<(st1+st2))
            System.out.println(TRIANGLE_EXISTS);
        else
            System.out.println(TRIANGLE_NOT_EXISTS);
    }
}
