package com.occ.services;

import java.io.IOException;

public class ScoreComputeUtilityOCC implements ScoreComputeUtility {

    private FileParser fileParser = new FileParserOCC();
    private ScoreComputer scoreComputer = new ScoreComputerOCC();

    @Override
    public int getScoreFromFile(String filePath) throws IOException {
        return scoreComputer.computeScore(fileParser.getSortedNamesArrayFromFile(filePath));
    }
}
