package com.rubnikovich.airline.reader;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class AirReader {
    private String file = "D:\\java\\projects\\Airline\\src\\main\\resources\\doc.txt"; //fixme
    private Path filePath = Paths.get(file);
    private List<String> readList;

    public List<String> readFile() throws Exception { //fixme
        readList = Files.readAllLines(filePath, StandardCharsets.UTF_8);
        return readList;
    }


}
