package io.github.randomusert.tinteeam.gtool.api;

import io.github.randomusert.tinteeam.gtool.api.logging.GtoolLogger;


public class GToolApi {
    public static void init() {
        GtoolLogger.logInfo("Gtool API init started");

        String OS = System.getProperty("os.name");


        GtoolLogger.logInfo("Running the tool on " + OS);
    }
}