public class lesson_03_12 {
    public static String string1 = "Амиго";
    public static String string2 = string1;
    public static String string3 = new String(string1);

    public static void main(String[] args) {
        /*В методе main напиши код попарного сравнения по ссылке строк string1, string2 и string3
        с выводом соответствующего сообщения после каждого сравнения:
        "ссылки на строки одинаковые" или "ссылки на строки разные".

                Порядок сравнения должен быть следующим:
        - строку string1 со строкой string2
        - строку string2 со строкой string3
        - строку string1 со строкой string3.*/
        if (string1==string2)
        {
            String same = "ссылки на строки одинаковые";
            System.out.println(same);
        }
        else
        {
            String different = "ссылки на строки разные";
            System.out.println(different);
        }
        if (string2==string3)
        {
            String same = "ссылки на строки одинаковые";
            System.out.println(same);
        }
        else
        {
            String different = "ссылки на строки разные";
            System.out.println(different);
        }
        if (string1==string3)
        {
            String same = "ссылки на строки одинаковые";
            System.out.println(same);
        }
        else
        {
            String different = "ссылки на строки разные";
            System.out.println(different);
        }
    }
}
