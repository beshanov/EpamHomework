package io.Task04_1;

import java.io.*;
import java.util.*;

public class KeywordFinderBinaryStream {
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
        } catch (Exception e){
            System.out.println(e.toString());
        }
    }

    public static String[] readFileToString(String fileName) throws IOException {
        File file = new File(fileName);
        byte[] bytesReaded = new byte[(int) file.length()];
        FileInputStream inputStream = new FileInputStream(fileName);
        int countAvailable = inputStream.available();
        int countReadedBytes = inputStream.read(bytesReaded, 0, countAvailable);
        String strFromBytes = new String(bytesReaded);
        System.out.println(strFromBytes + "\n" + countReadedBytes);
        String[] splitedStr = strFromBytes.split("\\s|\\p{Punct}");
        return splitedStr;
    }

    public static Map<String, Integer> getKeywords(String[] str) {
        Map<String, Integer> keywordsCount = new HashMap<>();
        for (String string : str) {
            if (keywordsList.contains(string)) {
                if (keywordsCount.containsKey(string))
                    keywordsCount.put(string, keywordsCount.get(string) + 1);
                else
                    keywordsCount.put(string, 1);
            }
        }
        return keywordsCount;
    }

    public static void keywordsToFile(Map<String, Integer> map) throws FileNotFoundException, IOException {
        FileOutputStream outFile = new FileOutputStream("src/main/java/io/Task04_1/out.txt");
        String outString = new String();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            outString += entry.getKey() + " : " + entry.getValue() + "\n";
        }
        outFile.write(outString.getBytes());
    }
}
