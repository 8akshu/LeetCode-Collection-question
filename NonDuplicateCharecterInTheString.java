package Collections;

import java.util.*;
import java.util.Scanner;

public class NonDuplicateCharecterInTheString
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		String str = sc.nextLine();
		String[] sp = str.split("");
		
		Set<String> set = new LinkedHashSet<>();
		
		for(String s : sp)
		{
			set.add(s);
		}
		set.forEach(c -> System.out.print(c));
	}
}
