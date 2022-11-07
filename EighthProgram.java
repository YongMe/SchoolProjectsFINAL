import java.util.Scanner;

public class FrequencyCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        int c1,c2,c3,c4,c5,i;
        c1=c2=c3=c4=c5=0;
        for (i = 0; i < s.length(); i++) {
            if(Character.toLowerCase(s.charAt(i)) == 'a')
                c1++;
            if(Character.toLowerCase(s.charAt(i)) == 'e')
                c2++;
            if(Character.toLowerCase(s.charAt(i)) == 'i')
                c3++;
            if(Character.toLowerCase(s.charAt(i)) == 'o')
                c4++;
            if(Character.toLowerCase(s.charAt(i)) == 'u')
                c5++;
        }
        System.out.println("Frequency of vowel ‘a’ is "+c1);
        System.out.println("Frequency of vowel ‘e’ is "+c2);
        System.out.println("Frequency of vowel ‘i’ is "+c3);
        System.out.println("Frequency of vowel ‘o’ is "+c4);
        System.out.println("Frequency of vowel ‘u’ is "+c5);
    }
}
