package com.occ.services;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FileParserOCC implements FileParser {

    @Override
    public List<String> getSortedNamesArrayFromFile(String filePath) throws IOException {
        String fileContent = Files.readString(Paths.get(filePath), Charset.defaultCharset());
        List<String> sortedNamesArray = Arrays.asList(fileContent.replace("\"", "").split(","));
        Collections.sort(sortedNamesArray);
        return sortedNamesArray;
    }
}
///Users/leyed/Downloads/OCCNames.txt