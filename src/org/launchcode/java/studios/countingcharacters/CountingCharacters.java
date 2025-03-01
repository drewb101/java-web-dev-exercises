package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {
    public static void main(String[] args) {
        String sentence = "If the product of two terms is zero then common sense says at least one of the two terms has " +
                "to be zero to start with. So if you move all the terms over to one side, you can put the quadratics " +
                "into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done " +
                "that, it’s pretty straightforward from there.";

        HashMap<Character, Integer> characterCount = CharacterCount.getCount(sentence);

        for (Map.Entry<Character, Integer> character : characterCount.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }
    }
}
