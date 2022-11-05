import java.util.Scanner;
public class FifthProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.next();
        s = s.replaceAll("[aeiouAEIOU]", "");
        System.out.println("New String: " + s);
    }
}
