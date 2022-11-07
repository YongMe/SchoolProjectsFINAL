import java.util.Scanner;

public class ElementRemoval
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;    //Array Size Declaration
        System.out.print("Enter the number of elements: ");
        n=sc.nextInt();    //Array Size Initialization

        int arr[]=new int[n];    //Array Declaration
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<n;i++)     //Array Initialization
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the index of the element you want to remove ");
        int index = sc.nextInt();

        for(int i = 0; i < arr.length; i++)
        {
            if(i == index)   //If element found
            {
                // shifting elements
                for(int j = i; j < arr.length - 1; j++)
                {
                    arr[j] = arr[j+1];
                }
                break;
            }
        }

        System.out.println("Elements after deletion " );
        for(int i = 0; i < arr.length-1; i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}
