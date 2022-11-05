package IdeaProjects.homework_logos.java_anaced.lesson3;

import org.apache.log4j.BasicConfigurator;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

public class CustomLog {
    private static Logger LOG = Logger.getLogger(String.valueOf(CustomLog.class));

    public static void main(String[] args) throws IOException {
        logWithBasicConfigurator();
    }

    public static void logWithBasicConfigurator() throws IOException {
        FileWriter writer = new FileWriter("server.error.log");
        BasicConfigurator.configure();
        LOG.info("INFO Logger message of project");
        LOG.warn("WARN Logger message of project");
        LOG.error(writer.write("ERROR Logger message of project"));
    }
}
