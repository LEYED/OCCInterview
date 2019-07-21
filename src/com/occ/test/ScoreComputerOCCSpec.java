package com.occ.test;

import com.occ.services.ScoreComputer;
import com.occ.services.ScoreComputerOCC;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ScoreComputerOCCSpec {

    private final ScoreComputer service = new ScoreComputerOCC();

    @Test
    void testSimpleInput() {
        List<String> simpleTestList = List.of("LINDA");
        assertEquals(40, service.computeScore(simpleTestList));
    }

    @Test
    void testSimpleInput2() {
        List<String> simpleTestList = List.of("A", "B");
        assertEquals(5, service.computeScore(simpleTestList));
    }

    @Test
    void testSimpleInput3() {
        List<String> simpleTestList = List.of("A", "B", "CC");
        assertEquals(23, service.computeScore(simpleTestList));
    }
}
