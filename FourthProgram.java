import java.util.Scanner;
public class FourthProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {9,23,34,45,78,99,120,246,299,346,432,436,500};
        int first = 0, last = arr.length;
        int mid = (first + last)/2;
        System.out.print("Enter the element to be found ");
        int key = sc.nextInt();
        while( first <= last ){
            if ( arr[mid] < key ){
                first = mid + 1;
            }else if ( arr[mid] == key ){
                System.out.println("Element is found at index: " + mid);
                break;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        if ( first > last ){
            System.out.println("Element is not found!");
        }
    }
}

