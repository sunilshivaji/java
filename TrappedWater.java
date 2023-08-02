/*
Given n non-negative integers representing an elevation map where the width of 
each bar is 1, compute how much water it is able to trap after raining.
Examples:
Input: arr[] = {3, 0, 0, 2, 0, 4}
Output: 10
Hint: We can trap "3*2 units" of water between 3 an 2, "1 unit" 
on top of bar 2 and "3 units" between 2 and 4.

The program calculates the amount of trapped water by using the two-pointer approach. 
It maintains two pointers, left and right, starting from the two ends of the array. 
It also keeps track of the maximum height encountered on the left side (leftMax) and 
the maximum height encountered on the right side (rightMax).

The program iterates until the left pointer is less than the right pointer. At each step, 
it compares the heights at the left and right pointers. If the height at the left pointer is
smaller, it means we can potentially trap water between the left pointer and the leftMax
height. If the height at the right pointer is smaller, we can potentially trap water between
the right pointer and the rightMax height.

By updating the leftMax and rightMax heights and adding the trapped water accordingly, 
the program computes the total amount of trapped water.

*/
import java.util.*;
public class TrappedWater 
{
    public static int trapWater(int[] height) 
	{
        int n = height.length;
        if (n == 0) 
		{
            return 0;
        }

        int left = 0;
        int right = n - 1;
        int leftMax = 0;
        int rightMax = 0;
        int water = 0;

        while (left < right) 
		{
            if (height[left] < height[right]) 
			{
                if (height[left] > leftMax) 
				{
                    leftMax = height[left];
                }
				else
				{
                    water += leftMax - height[left];
                }
                left++;
            }
			else
			{
                if (height[right] > rightMax) 
				{
                    rightMax = height[right];
                }
				else
				{
                    water += rightMax - height[right];
                }
                right--;
            }
        }

        return water;
    }

    public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=s.nextInt();
        int[] height =new int[n] ;
		System.out.println("Enter the array of heights");
		for(int i=0;i<n;i++)
			height[i]=s.nextInt();
        int trappedWater = trapWater(height);
        System.out.println("Amount of trapped water: " + trappedWater);
    }
}