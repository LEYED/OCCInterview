package com.occ;

import com.occ.services.ScoreComputeUtility;
import com.occ.services.ScoreComputeUtilityOCC;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static ScoreComputeUtility scoreComputeUtility = new ScoreComputeUtilityOCC();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type the path to be calculated: ");
        String path = scanner.next().trim();
        try {
            System.out.println("The computed value of your file is: \n" + scoreComputeUtility.getScoreFromFile(path));
        } catch (IOException e) {
            System.out.println("The file you specified could not be found in the current file system");
        }
    }
}
