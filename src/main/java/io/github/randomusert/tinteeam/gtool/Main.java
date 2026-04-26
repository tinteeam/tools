package io.github.randomusert.tinteeam.gtool;

import io.github.randomusert.tinteeam.gtool.api.GToolApi;
import io.github.randomusert.tinteeam.gtool.api.logging.GtoolLogger;

public class Main {
    public static void main(String[] args) {
        GtoolLogger.logInfo("test");

        GToolApi.init();
    }
}
