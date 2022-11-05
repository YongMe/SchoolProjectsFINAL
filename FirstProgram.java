package SchoolProjects2;
import java.util.Scanner;
public class FirstProgram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double ar[] = new double[10];
        int i;
        System.out.println("Enter the marks of the 10 students:");
        for (i = 0; i < ar.length; i++)
            ar[i] = sc.nextInt();
        double minMarks = ar[0], maxMarks = ar[0];
        for (i = 1; i < ar.length; i++) {
            if(ar[i] > maxMarks)
                maxMarks = ar[i];
            if(ar[i] < minMarks)
                minMarks = ar[i];
        }
        System.out.println("Maximum marks obtained: " + maxMarks);
        System.out.println("Minimum marks obtained: " + minMarks);
    }
}
