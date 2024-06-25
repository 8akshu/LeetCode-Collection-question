package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberOfOccuranceOfCharecterInTheString 
{
	public static void main(String[] args)
	{
       Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		String str = sc.nextLine();
		String[] sp = str.split("");
		
		Map<String, Integer> map = new HashMap<>();
		
		for(int i = 0 ; i < sp.length ; i++)
		{
			int count = 1;
			for(int j= 0 ;  j < sp.length ; j++)
			{
				if(sp[i].equals(sp[j]) && i != j)
				{
					count++;
				}
			}
			map.putIfAbsent(sp[i], count);
		}
		System.out.println(map);
	}
}
