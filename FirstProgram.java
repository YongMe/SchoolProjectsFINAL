import java.io.*;
public class Marks {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double[] marks = new double[10];
        String[] names = new String[10];
        int i,j;

        for (i = 0; i < 10; i++){
            System.out.print("Enter the name of the student: ");
            names[i] = br.readLine();
            System.out.print("Enter the marks obtained: ");
            marks[i] = Double.parseDouble(br.readLine());
        }

        int minMarksIndex = 0, maxMarksIndex = 0;
        for ( i = 1; i < 10; i++) {
            if(marks[i] > marks[maxMarksIndex]) {
                maxMarksIndex = i;
            }
        }
        for(j = 1; j < 10; j++){
            if(marks[j] < marks[minMarksIndex]) {
                minMarksIndex = j;
            }
        }
        System.out.println("Maximum marks obtained is " + marks[maxMarksIndex] + " by "+ names[maxMarksIndex]);
        System.out.println("Minimum marks obtained is " + marks[minMarksIndex] + " by "+ names[minMarksIndex]);
    }
}
