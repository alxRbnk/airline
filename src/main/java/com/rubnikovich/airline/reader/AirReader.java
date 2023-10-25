package com.rubnikovich.airline.reader;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class AirReader {

    public List<String> readFile(String path) throws Exception {
        Path filePath = Paths.get(path);
        return Files.readAllLines(filePath, StandardCharsets.UTF_8);
    }


}
