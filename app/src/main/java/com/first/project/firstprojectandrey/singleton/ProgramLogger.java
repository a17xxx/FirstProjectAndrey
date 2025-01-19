package com.first.project.firstprojectandrey.singleton;

import android.util.Log;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logfile = "This is log file. \n\n";
    public static synchronized ProgramLogger getProgramLogger() {
        if (programLogger == null) {
            programLogger = new ProgramLogger();

        }
        return programLogger;
    }
    private ProgramLogger() {

    }
    public void addloginfo(String loginfo) {
        logfile += loginfo + "\n";
    }
    public void showlogfile() {
        Log.d("test1", "test2");
    }
}
