import java.util.Scanner;

public class PalindromeWordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.next();
        String word1 = "";
        int i;
        for (i = word.length() - 1; i >= 0; i--)
            word1 += word.charAt(i);
        if(word.equalsIgnoreCase(word1))
            System.out.println(word + " is a palindrome word");
        else
            System.out.println(word + " is not a palindrome word");
    }
}
