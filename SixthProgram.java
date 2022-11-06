import java.util.Scanner;
public class SixthProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        System.out.println("Result of comparison of both string lexicographically: " + s1.compareTo(s2));
    }
}
