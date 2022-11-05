import java.util.Scanner;

public class SecondProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] ar = new double[10];
        int i;
        double sum = 0.0;
        char grade;
        System.out.println("Enter the marks of the 10 subjects :");
        for (i = 0; i < ar.length; i++) {
            ar[i] = sc.nextDouble();
            sum += ar[i];
        }
        double percentage = sum/1000 * 100;
        if(percentage < 50)
            grade = 'D';
        else if(percentage >= 50 && percentage < 60)
            grade = 'C';
        else if(percentage >= 60 && percentage < 80)
            grade = 'B';
        else
            grade = 'A';
        System.out.println("Grade obtained by the student: " + grade);
    }
}
