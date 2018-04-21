package string.Task03_3;

import java.util.*;

public class MultiLanguageApp {
    public static void main(String[] args) {
        Locale current;
        System.out.println("Select language:" +
                "\n1 - English;" +
                "\n2 - Русский;");
        while (true) {
            String questionNumber = Integer.toString(new Scanner(System.in).nextInt());
            switch (questionNumber) {
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
            break;
        }
        List<String> questions = new Questions(current).getListQuestions();
        List<String> answers = new Answers(current).getListAnswers();

        while (true) {
            for (String string : questions)
                System.out.println(string);
            System.out.println("Enter number of question:");
            int answerNumber = (new Scanner(System.in).nextInt());
            System.out.println(answers.get(answerNumber - 1));
            System.out.println("===============");
        }
    }
}
