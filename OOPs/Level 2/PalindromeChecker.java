import java.util.Scanner;

public class PalindromeChecker {
    String givenText;

    PalindromeChecker(String givenText) {
        this.givenText = givenText;
    }

    public boolean checkPalindrome() {
        String cleanedInput = givenText.replaceAll("\\s+", "").toLowerCase();
        String reversedInput = new StringBuilder(cleanedInput).reverse().toString();
        return cleanedInput.equals(reversedInput);
    }

    public void showResult() {
        if (checkPalindrome()) {
            System.out.println("'" + givenText + "' is a palindrome. ✅");
        } else {
            System.out.println("'" + givenText + "' is not a palindrome. ❌");
        }
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.print("Enter a word or phrase to check: ");
        String enteredText = inputScanner.nextLine();
        
        PalindromeChecker palindromeObj = new PalindromeChecker(enteredText);
        palindromeObj.showResult();
        
        inputScanner.close();
    }
}
