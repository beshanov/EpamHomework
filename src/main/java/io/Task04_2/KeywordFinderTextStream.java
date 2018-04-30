package io.Task04_2;

import java.io.*;
import java.util.*;

public class KeywordFinderTextStream {
    private final static String[] keywordsArray = new String[]{"abstract", "assert", "boolean", "break", "byte",
            "case", "catch", "char", "class", "continue",
            "default", "do", "double", "else", "enum",
            "extends", "final", "finally",
            "for", "new", "switch", "package", "synchronized", "if", "private",
            "this", "implements", "protected", "throw", "byte", "else",
            "import", "public", "throws", "enum", "instanceof",
            "return", "transient", "int", "short", "try",
            "interface", "static", "void", "long", "strictfp",
            "volatile", "float", "native", "super", "while"};
    private static List<String> keywordsList = Arrays.asList(keywordsArray);
    private static String fileName = "src/main/java/io/Task04_1/LoopOne.java";

    public static void main(String[] args) {
        try {
            String[] strings = readFileToString(fileName);
            keywordsToFile(getKeywords(strings));
            System.out.println(getKeywords(strings));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static String[] readFileToString(String fileName) throws IOException {
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);

        File file = new File(fileName);
        char[] chars = new char[(int) file.length()];
        try {
            int charCount = br.read(chars);
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            fr.close();
        }
        String stringFromChars = new String(chars);
        String[] splittedStr = stringFromChars.split("\\s|\\p{Punct}");
        System.out.println(stringFromChars);
        return splittedStr;
    }

    public static Map<String, Integer> getKeywords(String[] str) {
        Map<String, Integer> keywordsMap = new HashMap<>();
        for (String string : str) {
            if (keywordsList.contains(string)) {
                if (keywordsMap.containsKey(string))
                    keywordsMap.put(string, keywordsMap.get(string) + 1);
                else
                    keywordsMap.put(string, 1);
            }
        }
        return keywordsMap;
    }

    public static void keywordsToFile(Map<String, Integer> map) throws IOException {
        FileWriter fw = new FileWriter("src/main/java/io/Task04_2/out.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        String outString = new String();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            outString += entry.getKey() + " : " + entry.getValue() + "\n";
        }

        try {
            bw.write(outString);
            bw.flush();
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            fw.close();
        }
    }
}
