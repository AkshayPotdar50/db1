package com.atos.deproj.sprint2145.design;

import java.util.List;

public class SubstringTypes {

    public static void main(String[] args) {

        String str="this is a sample string for test";
        String sub=str.substring(0,5);
        System.out.println(sub);
        boolean exists=str.contains("this");
        System.out.println(exists);

    }
}


class LogEntry{
    private String timestamp;
    private String level;
    private String message;

    public LogEntry(String timestamp, String level, String message) {
        this.timestamp = timestamp;
        this.level = level;
        this.message = message;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getLevel() {
        return level;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "LogEntry{" +
                "timestamp='" + timestamp + '\'' +
                ", level='" + level + '\'' +
                ", message='" + message + '\'' +
                '}';
    }


}

class LogProcessor{
    private List<LogEntry> logs;
    
}
