package com.occ.services;

import java.io.IOException;
import java.util.List;

public interface FileParser {
    List<String> getSortedNamesArrayFromFile(String filePath) throws IOException;
}
