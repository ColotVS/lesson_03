import java.util.Scanner;

public class lesson_03_10 {
    public static void main(String[] args) {
        /*Напиши программу, которая считывает с клавиатуры два вещественных числа (double) и выдает сообщение о том,
        равны ли эти числа с точностью до одной миллионной.*/
        Scanner number = new Scanner(System.in);
        double num1 = number.nextDouble();
        double num2 = number.nextDouble();
        if (Math.abs(num1-num2)<0.000001)
            System.out.println("числа равны");
        else
            System.out.println("числа не равны");
    }
}
