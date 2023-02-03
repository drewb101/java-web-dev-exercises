package exercises;

import java.util.Scanner;
public class Alice {
    public static void main(String[] args) {
        String bookEntry = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice " +
                "'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a term to search for:");
        String searchTerm = input.nextLine();

        boolean result = bookEntry.toLowerCase().contains(searchTerm);

        if (result == true) {
            System.out.println("The sentence contains your search term.");
            System.out.println("Index of search term: " + bookEntry.indexOf(searchTerm));
            System.out.println("Length of search term: " + searchTerm.length());
            String modifiedSentence = bookEntry.replace(searchTerm, "");
            System.out.println(modifiedSentence);
        } else {
            System.out.println("The sentence does not contain your search term.");
        }
    }
}
