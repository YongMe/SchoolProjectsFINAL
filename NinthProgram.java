import java.util.Scanner;

public class NinthProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.next();
        String word1 = "";
        for (int i = word.length() - 1; i >= 0; i--)
            word1 += word.charAt(i);
        if(word.equals(word1))
            System.out.println(word + " is a palindrome word");
        else
            System.out.println(word + " is not a palindrome word");
    }
}
