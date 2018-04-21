package string.Task03_3;

import java.util.*;

public class Questions {
    private ResourceBundle rbQuestions;
    private List<String> listQuestions = new ArrayList<>();

    public Questions(Locale locale) {
        rbQuestions = ResourceBundle.getBundle("questions", locale);
        Enumeration<String> enumeration = rbQuestions.getKeys();
        int qIndex = 0;
        while (enumeration.hasMoreElements()) {
            qIndex++;
            listQuestions.add(qIndex + "." + rbQuestions.getString(enumeration.nextElement()));
        }
    }

    public List<String> getListQuestions() {
        return listQuestions;
    }
}
