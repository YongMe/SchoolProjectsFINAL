import java.util.Scanner;
public class VowelRemoval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String s = sc.next();
        s = s.replaceAll("[aeiouAEIOU]", "");
        System.out.println("New word: " + s);
    }
}
