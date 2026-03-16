import java.util.*;

// Strategy Interface
interface PalindromeStrategy {
    boolean isPalindrome(String word);
}

// Stack Strategy
class StackStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String word) {

        Stack<Character> stack = new Stack<>();

        for (char c : word.toCharArray()) {
            stack.push(c);
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        return word.equals(reversed);
    }
}

// Deque Strategy
class DequeStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String word) {

        Deque<Character> deque = new LinkedList<>();

        for (char c : word.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {

            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}

// Context Class
class PalindromeChecker {

    private PalindromeStrategy strategy;

    public PalindromeChecker(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean check(String word) {
        return strategy.isPalindrome(word);
    }
}

// Main Class
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        // choose strategy dynamically
        PalindromeStrategy strategy = new StackStrategy();

        PalindromeChecker checker = new PalindromeChecker(strategy);

        if (checker.check(word)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }
    }
}