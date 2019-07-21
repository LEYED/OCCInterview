package com.occ.test;

import com.occ.services.ScoreComputeUtility;
import com.occ.services.ScoreComputeUtilityOCC;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ScoreComputeUtilitySpec {

    private final ScoreComputeUtility service = new ScoreComputeUtilityOCC();

    @Test
    void testWithActualTestFile() throws IOException {
        assertEquals(871198282, service.getScoreFromFile("resources/OCC Take Home Coding names.txt"));
    }
}
