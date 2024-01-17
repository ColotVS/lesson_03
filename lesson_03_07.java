import java.util.Scanner;

public class lesson_03_07 {
    public static void main(String[] args) {
        /*Напишем программу, которая будет считывать с клавиатуры возраст.
        Если возраст от 20 до 60 (включительно), то выводить ничего не нужно, иначе - вывести фразу "можно не работать".
        Сделать это можно (и нужно!) с помощью только одного оператора if без else.*/
        Scanner age = new Scanner(System.in);
        int herage = age.nextInt();
        if (herage<20 || herage>60)
            System.out.println("можно не работать");
    }
}
