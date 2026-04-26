package io.github.randomusert.tinteeam.gtool.api.logging;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GtoolLogger {
    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    public static void logInfo(String msg) {
        String time = LocalDateTime.now().format(FORMATTER);
        System.out.println(time + " [INFO]: " + msg);
    }

    public static void logError(String error) {
        String time = LocalDateTime.now().format(FORMATTER);
        System.out.println(time + " [ERROR]: " + error);
    }

    public static void logWarn(String warn) {
        String time = LocalDateTime.now().format(FORMATTER);

        System.out.println(time + " [WARN]:" + warn);
    }
}
