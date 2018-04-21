package string.Task03_3;

import java.util.*;

public class MultiLanguageApp {
    public static void main(String[] args) {
        Locale current;
        System.out.println("Select language:" +
                "\n1 - English;" +
                "\n2 - Русский;");
        for (; ; ) {
            String s = Integer.toString(new Scanner(System.in).nextInt());
            switch (s) {
                case "1":
                    System.out.println("English version");
                    current = new Locale("en");
                    break;
                case "2":
                    System.out.println("Русская версия");
                    current = new Locale("ru");
                    break;
                default:
                    continue;
            }

            List<String> questions = new Questions(current).getListQuestions();
            for (String string : questions)
                System.out.println(string);
        }
    }
}
