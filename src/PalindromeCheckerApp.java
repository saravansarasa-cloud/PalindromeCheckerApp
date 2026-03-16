import java.util.Deque;
import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "racecar";

        Deque<Character> deque = new LinkedList<>();

        // insert characters into deque
        for (int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i));
        }

        boolean isPalindrome = true;

        // compare front and rear elements
        while (deque.size() > 1) {
            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }
    }
}