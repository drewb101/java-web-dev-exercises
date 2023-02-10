package exercises.ch3;

import java.util.ArrayList;
import java.util.Scanner;

public class WordSearch {
    public static String findWord(ArrayList<String> wordList) {
        Scanner input = new Scanner(System.in);
        System.out.print("Length of word(s) you want to find: ");
        int wordLength = input.nextInt();

        for (String word : wordList){
            if (word.length() == wordLength){
                System.out.println(word);
            }
        }
        return null;
    }
}
