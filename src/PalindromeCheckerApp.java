import java.util.*;

public class PalindromeCheckerApp {

    // Method 1: Reverse String
    public static boolean reverseMethod(String word) {

        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        return word.equals(reversed);
    }

    // Method 2: Stack
    public static boolean stackMethod(String word) {

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

    // Method 3: Deque
    public static boolean dequeMethod(String word) {

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

    public static void main(String[] args) {

        String word = "racecar";

        // Reverse method timing
        long start1 = System.nanoTime();
        reverseMethod(word);
        long end1 = System.nanoTime();

        // Stack method timing
        long start2 = System.nanoTime();
        stackMethod(word);
        long end2 = System.nanoTime();

        // Deque method timing
        long start3 = System.nanoTime();
        dequeMethod(word);
        long end3 = System.nanoTime();

        System.out.println("Reverse Method Time: " + (end1 - start1) + " ns");
        System.out.println("Stack Method Time: " + (end2 - start2) + " ns");
        System.out.println("Deque Method Time: " + (end3 - start3) + " ns");
    }
}