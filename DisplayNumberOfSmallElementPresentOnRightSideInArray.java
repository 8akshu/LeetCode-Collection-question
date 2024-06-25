package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DisplayNumberOfSmallElementPresentOnRightSideInArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an Array");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter elements of array");
		for(int i =0 ; i < size ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			int count = 0;
			for(int j= 0;  j < arr.length ; j++)
			{
				if(arr[i] > arr[j] && i != j)
				{
					count++;
				}
			}
			
			list.add(count);
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(list);
	}

}
