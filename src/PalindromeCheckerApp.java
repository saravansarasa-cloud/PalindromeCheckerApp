public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "level";
        String reversed = "";

        // reverse the string using loop
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // compare original and reversed string
        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }
    }
}