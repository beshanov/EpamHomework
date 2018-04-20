package string.Task03_3;

import java.util.Locale;
import java.util.ResourceBundle;

public class MultiLanguageApp {
    public static void main(String[] args) {
        
        Locale current = new Locale("ru");
        ResourceBundle rbText = ResourceBundle.getBundle("text", current);
        ResourceBundle rbAnswers = ResourceBundle.getBundle("answers", current);
        String st1 = rbText.getString("str1");
        String st2 = rbAnswers.getString("str1");
        System.out.println(st1 + " - " + st2);
    }
}
