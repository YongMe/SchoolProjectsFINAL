package SchoolProjects2;

import java.util.Scanner;

public class SeventhProgram {
    public static String toggleCase(String s){
        String s1="";
        for (int i = 0; i < s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i)))
                s1 += Character.toLowerCase(s.charAt(i));
            else if(Character.isLowerCase(s.charAt(i)))
                s1 +=  Character.toUpperCase(s.charAt(i));
            else s1+= s.charAt(i);
        }
        return s1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("New String: " + toggleCase(s));
    }
}
