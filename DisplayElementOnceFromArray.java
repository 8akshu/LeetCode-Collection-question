package Collections;

import java.util.*;

public class DisplayElementOnceFromArray 
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
		Map<Integer, Integer> map = new HashMap<>();
		for(int i : arr)
		{
			System.out.print(i+" ");
			map.putIfAbsent(i, null);
		}
		
		System.out.println( map.keySet());
	}
}
