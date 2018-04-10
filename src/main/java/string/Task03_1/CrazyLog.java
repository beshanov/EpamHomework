package string.Task03_1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class CrazyLog {
    public StringBuilder logBuilder = new StringBuilder("");


    public void addLog(String message) {
        LocalDateTime local = LocalDateTime.now();
        logBuilder.append(local.format(DateTimeFormatter.ofPattern("dd-MM-YYYY : hh-mm")));
        logBuilder.append(" - " + message);
    }

    /*public String findLog(int year, int month, int day){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY");
        LocalDate date = new LocalDate(year,month,day);
        String subString = dateFormat.format(date);
    }*/

    public String toString() {
        return logBuilder.toString();
    }

    public static void main(String[] args) {
        CrazyLog log = new CrazyLog();
        log.addLog("first");
        System.out.println(log);
    }
}
