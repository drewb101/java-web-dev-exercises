package exercises.ch3;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(98);
        numbers.add(67);
        numbers.add(6);
        numbers.add(7);
        numbers.add(55);
        numbers.add(48);
        numbers.add(34);
        numbers.add(69);
        numbers.add(4);
        numbers.add(37);

        Integer evenSum = SumEven.getSum(numbers);

        System.out.println(evenSum);

        ArrayList<String> words = new ArrayList<>();
        words.add("dog");
        words.add("hello");
        words.add("drew");
        words.add("lemon");
        words.add("star");
        words.add("planet");
        words.add("never");
        words.add("cat");
        words.add("yellow");
        words.add("what");
        words.add("phone");
        words.add("fit");

        String matchingWord = WordSearch.findWord(words);
    }
}
