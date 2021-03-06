package by.it.kruglenja.jd02_06;

import java.io.*;

public class Logger {

    private static Logger logger;

    private Logger() {
    }

    static Logger getInstance() {
        if (logger == null) {
            synchronized (Logger.class) {
                if (logger == null) {
                    logger = new Logger();
                }
            }
        }
        return logger;
    }

    synchronized void log(String text) {
        try (
                BufferedWriter bufferedWriter = new BufferedWriter(
                        new FileWriter("C:\\Users\\Tom\\IdeaProjects\\JD2018-11-13\\src\\by\\it\\kruglenja\\jd02_06\\log.txt", true)
                )) {
            bufferedWriter.write(text + "\n");
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
