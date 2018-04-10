package string.Task03_1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CrazyLog {
    private StringBuilder logBuilder = new StringBuilder("");

    public void addLog(String message) {
        LocalDateTime local = LocalDateTime.now();
        logBuilder.append(local.format(DateTimeFormatter.ofPattern("dd-MM-YYYY : hh-mm")));
        logBuilder.append(" - " + message + ";\n");
    }

    public StringBuilder findLog(int year, int month, int day) {
        LocalDate localDate = LocalDate.of(year, month, day);
        String subString = localDate.format(DateTimeFormatter.ofPattern("dd-MM-YYYY"));

        String[] logs = logBuilder.toString().split(";");
        StringBuilder foundLogs = new StringBuilder();
        for (String string : logs) {
            if (string.contains(subString)) {
                foundLogs.append(string + ";");
            }
        }
        return foundLogs;
    }

    public String toString() {
        return logBuilder.toString();
    }

    public static void main(String[] args) {
        CrazyLog log = new CrazyLog();
        log.addLog("first");
        log.addLog("second");
        System.out.println(log);
        System.out.println(log.findLog(2018, 4, 11));
    }
}
