/*Question 1: Ascending Order
Write a program to sort the following array in ascending order using the Bubble Sort algorithm:
[64, 34, 25, 12, 22, 11, 90]*/



import java.util.Scanner;

public class BUBBLESORT_BASIC1
{
	public static void printArray(int[] arr)
	{
        for (int num : arr)
        {
            System.out.print(num + " ");
        }
        System.out.println();
    }

	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		int i,j,n,temp;
		System.out.println("Enter the size of the array: ");
		n= in.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the Elements of the Array: ");
		for(i=0;i<n;i++)
		{
			arr[i]= in.nextInt();
		}
		System.out.println("Inputed Array:");
		printArray(arr);
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp= arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted Array:");
		printArray(arr);
	}
}
