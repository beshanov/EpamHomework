package string.Task03_3;

import java.util.*;

public class Answers {
    private ResourceBundle rbAnswers;
    private List<String> listAnswers = new ArrayList<>();

    public Answers(Locale locale) {
        rbAnswers = ResourceBundle.getBundle("answers", locale);
        Enumeration<String> enumeration = rbAnswers.getKeys();
        while (enumeration.hasMoreElements()) {
            listAnswers.add(rbAnswers.getString(enumeration.nextElement()));
        }
    }

    public List<String> getListAnswers() {
        return listAnswers;
    }
}
