package org.ex.spring.eventLogger.bean.loggers;

import org.ex.spring.eventLogger.bean.Event;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileEventLogger implements EventLogger {
    @Value("src/main/resources/data.txt")
    private String filename;

    @PostConstruct
    public void init() {
        File file = new File(filename);
        if (file.exists() && !file.canWrite()) {
            throw new IllegalArgumentException("Can't write to file " + filename);
        } else if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception e) {
                throw new IllegalArgumentException("Can't create file", e);
            }
        }
    }

    @Override
    public void logEvent(Event event) {
        String text = event.toString() + '\n';
        try {
            Files.write(Paths.get(filename), text.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}