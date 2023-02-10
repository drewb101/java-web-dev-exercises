package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;

public class CharacterCount {
    public static HashMap<Character, Integer> getCount(String sentence){
        char[] characters = sentence.toCharArray();
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        Integer count = 0;

        for(char character : characters){
            if (!charCountMap.containsKey(character)){
                for(int i = 0; i <sentence.length(); i++){
                    if (character == sentence.charAt(i)){
                        count += 1;
                    }
                }
                charCountMap.put(character, count);
            }
            count = 0;
        }
        return charCountMap;
    }
}
