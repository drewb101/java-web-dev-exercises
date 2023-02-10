package exercises.ch3;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 3, 5, 8};

        for(int entry : numbers) {
            System.out.println(entry);
        }

        System.out.println("-------------------------");

        for(int oddNum : numbers){
            if(oddNum%2 != 0) {
                System.out.println(oddNum);
            }
        }

        System.out.println("-------------------------");

        String sentence = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";

        String[] wordsArray = sentence.split(" ");
        System.out.println((Arrays.toString(wordsArray)));

        System.out.println("------------------------");

        String[] sentenceArray = sentence.split("\\.");
        System.out.println((Arrays.toString(sentenceArray)));

    }
}

