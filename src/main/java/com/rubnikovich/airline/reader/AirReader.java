package com.rubnikovich.airline.reader;

import com.rubnikovich.airline.exception.ExceptionAirline;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class AirReader {

    public static Logger logger = LogManager.getLogger();

    public List<String> readFile(String path) throws ExceptionAirline {
        Path filePath = Paths.get(path);
        if (!Files.isReadable(filePath)) {
            logger.info("something info log");
            throw new ExceptionAirline("the path to the file is not correct");
        }
        try {
            return Files.readAllLines(filePath, StandardCharsets.UTF_8);
        } catch (IOException s) {
            throw new ExceptionAirline("enter the correct path");
        }
    }
}
