//3a. Given an array arr[] of N integers, the task is to find the maximum difference 
//between any two elements of thearray

import java.util.*;
public class MaxDifference
{
    public static int findMaxDifference(int[] arr) 
	{
        if (arr.length < 2) 
		{
            return 0;
        }

        int maxDiff = arr[1] - arr[0];
        int minElement = arr[0];

        for (int i = 1; i < arr.length; i++) 
		{
            if (arr[i] - minElement > maxDiff) 
			{
                maxDiff = arr[i] - minElement;
            }
            if (arr[i] < minElement) 
			{
                minElement = arr[i];
            }
        }
        return maxDiff;
    }

    public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=s.nextInt();		
        int[] a = new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
        int maxDiff = findMaxDifference(a);
        System.out.println("Maximum difference: " + maxDiff);
    }
}