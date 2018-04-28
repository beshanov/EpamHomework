package string.Task03_3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegExpApp {
    public static void main(String[] args) throws IOException {

        FileReader file = new FileReader("src/main/java/string/Task03_3/text.html");
        String path = "src/main/java/string/Task03_3/subtext.html";
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        String strFile = new String(encoded, "windows-1251");

        List<String> sentencesList = new ArrayList<>();
        List<String> sentencesWithReference = new ArrayList<>();

        Pattern imagePattern = Pattern.compile("\\([Рр]ис\\.\\s[0-9]\\)");



        Pattern sentencePattern = Pattern.compile("([А-Я]([[а-яё]|\\d|\\s|–|\\p{Punct}]*)*\\.)");
        Matcher sentenceMatcher = sentencePattern.matcher(strFile);
        while (sentenceMatcher.find()) {
            sentencesList.add(sentenceMatcher.group(1));
        }
        for (String sentence : sentencesList) {
            System.out.println(sentence);
            Matcher imageMatcher = imagePattern.matcher(sentence);
            if (imageMatcher.find()) {
                sentencesWithReference.add(sentence);
            }
        }
        System.out.println();

        for (String sentence : sentencesWithReference) {
            System.out.println(sentence);
        }
    }
}
