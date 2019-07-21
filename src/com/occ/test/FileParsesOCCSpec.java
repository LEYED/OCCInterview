package com.occ.test;

import com.occ.services.FileParser;
import com.occ.services.FileParserOCC;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileParsesOCCSpec {

    private final FileParser service = new FileParserOCC();
    private final String TEST_CONTENT = "resources/OCC Take Home Coding names.txt";

    @Test ()
    void pathInvalid() {
        assertThrows(IOException.class, () -> service.getSortedNamesArrayFromFile("invalidPath"));
    }

    @Test
    void testFileParser() throws IOException {
        List<String> sortedNamesArray = service.getSortedNamesArrayFromFile(TEST_CONTENT);
        assertEquals(sortedNamesArray.get(0), "AARON");
        assertEquals(sortedNamesArray.get(1), "ABBEY");
        assertEquals(sortedNamesArray.get(2), "ABBIE");
        assertEquals(sortedNamesArray.get(3), "ABBY");
        assertEquals(sortedNamesArray.get(299), "ARGENTINA");
        assertEquals(sortedNamesArray.get(5162), "ZULMA");
    }
}
