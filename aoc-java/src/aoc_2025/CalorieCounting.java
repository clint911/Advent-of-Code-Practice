package aoc_2025;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class CalorieCounting {
    public  static void main(String[] args) {
        System.out.println("Welcome to Day one of Advent of Code by Clinton");
        String fileName = "/Users/user/Downloads/projects/adventOfCode/src" +
                "/aoc_2025/input.txt";//fetching the file and assigning it to a variable
        int maxSum = 0;
        int currSum = 0;
        try {
            FileReader myReader = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(myReader);
            String currLine;
            while ((currLine = reader.readLine()) != null) {
                currLine = currLine.trim();
                if (!currLine.isEmpty()) {
                  String[] numbersStr = currLine.split(" ");
                  for (String numberStr : numbersStr)  {
                     int currNumber = Integer.parseInt(numberStr);
                     currSum += currNumber;
                  }
                } else  {
                    maxSum = Math.max(maxSum,  currSum);
                    currSum = 0;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        System.out.println("Maximum sum: " + maxSum);
    }
}
