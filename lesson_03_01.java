import java.util.Scanner;

public class lesson_03_01 {
    public static void main(String[] args) {
        /*Ввести с клавиатуры температуру на улице.
        Если температура меньше 0, вывести надпись "на улице холодно",
        иначе - вывести надпись "на улице тепло".
         */
        String cold = "на улице холодно";
        String warm = "на улице тепло";
        Scanner temp = new Scanner(System.in);
        int gradus = temp.nextInt();
        if (gradus<0)
            System.out.println(cold);
        else
            System.out.println(warm);
    }
}
