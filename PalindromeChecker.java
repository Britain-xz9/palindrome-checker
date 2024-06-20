import java.util.*;

// program that checks the user input if it is a palindrome

// user will enter an any words
// every character in the string will be put into two arraylist
// the another original string will put into first arraylist and the another will be reversed
// while loop that checks every single element if it matches the other arraylist
// will return false if not palindrome, true if palindrome


public class PalindromeChecker {
    // creating scanner
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // creating an object
        PalindromeChecker obj = new PalindromeChecker();

        // getting user input
        System.out.print("Enter input: ");
        String input = sc.nextLine();

        // print a result
        String result = obj.isPalindrome(input) ? ("The input \"" + input + "\" is palindrome.") : ("The input \"" + input + "\" is not palindrome.");
        System.out.println(result);
    }

    // the palindrome checker method
    public boolean isPalindrome(String input) {
        ArrayList<String> originalList = new ArrayList<>(); // arraylist for the original input
        ArrayList<String> reverseList = new ArrayList<>(); // arraylist for the reversed input

        // putting the string into the original arraylist
        for(int i = 0; i < input.length(); i++) {
            char element = input.charAt(i); // getting the character, char datatype
            String strElement = Character.toString(element).toUpperCase(); // converting into string method and change it to uppercase

            originalList.add(strElement); // putting it to the originalList
        }

        // putting the string into the reverse arraylist
        for(int i = (input.length() - 1); i >= 0; i--) {
            char element = input.charAt(i); // getting the character, char datatype
            String strElement = Character.toString(element).toUpperCase(); // converting into string method and chane it to uppercase

            reverseList.add(strElement); // putting it to the reverseList
        }

        // declaring boolean variable
        boolean palindrome = true;
        
        // checking if palindrome
        while(palindrome) {
            for(int i = 0; i < originalList.size(); i++) {
                palindrome = (originalList.get(i).equals(reverseList.get(i))); // checks the item from original and reverse one by one per index
            }

            break;
        }

        return palindrome; // return the result
    }
}
