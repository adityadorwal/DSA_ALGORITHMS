/*Question 3: Sort Only Odd Numbers
Given an array, sort only the odd numbers in ascending order, while keeping the even numbers in their original positions.
Input: [7, 2, 4, 9, 5, 12, 11]
Output: [5, 2, 4, 7, 9, 12, 11].*/

import java.util.Scanner;

public class BUBBLESORT_MEDIUM3 {
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
				if(arr[j]>arr[j+1] && arr[j]%2!=0 && arr[j+1]%2!=0)
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
