package com.occ.services;

import java.util.List;

public class ScoreComputerOCC implements ScoreComputer {

    /* Consider uppercase entries, in the case of other characters we will need
     * to consider further requirements
     */
    private int ASCII64 = 64;

    @Override
    public int computeScore(List<String> names) {
        int computedValue = 0;

        for (int indexOfName = 0; indexOfName < names.size(); indexOfName++) {
            String name = names.get(indexOfName);
            int valueOfString = getValueOfString(name);
            computedValue = computedValue + (valueOfString * (indexOfName + 1));
        }

        return computedValue;
    }

    private int getValueOfString(String name) {
        int valueOfString = 0;
        char[] charArray = name.toCharArray();
        for (char currentChar : charArray) {
            valueOfString = valueOfString + (currentChar - ASCII64);
        }
        return valueOfString;
    }
}
