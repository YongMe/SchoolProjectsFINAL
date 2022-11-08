import java.util.Scanner;

public class NameShortening {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name1 = sc.nextLine(), word="";
        String name2 = "";
        int i;
        for (i = 0; i < name1.length(); i++) {
            if(name1.charAt(i) != ' ')
                word += name1.charAt(i);
            else{
                name2 += Character.toUpperCase(word.charAt(0)) + ". ";
                word = "";
            }
        }
        name2 += Character.toUpperCase(name1.charAt(name1.lastIndexOf(' ') + 1)) + name1.substring(name1.lastIndexOf(' ')+2, name1.length());
        System.out.println(name2);
    }
}
