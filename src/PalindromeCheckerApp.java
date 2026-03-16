public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "Never Odd Or Even";

        // normalize string (remove spaces and convert to lowercase)
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        String reversed = "";

        // reverse the normalized string
        for (int i = normalized.length() - 1; i >= 0; i--) {
            reversed = reversed + normalized.charAt(i);
        }

        // compare strings
        if (normalized.equals(reversed)) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is not a Palindrome");
        }
    }
}