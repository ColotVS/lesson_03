import java.util.Scanner;

public class lesson_03_02 {
    public static void main(String[] args) {
        /*Ввести с клавиатуры имя и возраст. Если возраст в пределах 18-28 (включительно),
        то вывести надпись "Имя, явитесь в военкомат", где Имя - это имя, введенное ранее с клавиатуры.*/
        String militaryCommissar = ", явитесь в военкомат";
        Scanner war = new Scanner(System.in);
        System.out.print("Пожалуйста введите имя:");
        String name = war.nextLine();
        System.out.print("Пожалуйста введите возраст:");
        int age = war.nextInt();
        if (age>=18 && age<=28)
            System.out.println(name + militaryCommissar);
        else if (age<18)
            System.out.println(name+ ", ты ещё маленький");
        else
            System.out.println(name + ", вам уже не нужно");
    }
}
