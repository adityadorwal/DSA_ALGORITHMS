/*Question 2: Count Swaps
Modify your Bubble Sort implementation to count the total number of swaps made while sorting the array in ascending order. Test it on the array:
[5, 1, 4, 2, 8]*/



import java.util.Scanner;

public class BUBBLESORT_BASIC2 {
	public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }


	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		int i,j,n,temp,c=0;
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
					c++;
					temp= arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted Array:");
		printArray(arr);
		System.out.println("Total number of swaps: "+c);
	}
}
