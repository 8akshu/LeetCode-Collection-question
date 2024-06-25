package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SumOfNumberInCollection
{

	public static void main(String[] args) 
	{
		List<Integer> l = new ArrayList<>();
		
		Stream.of("ask123","456","hay" ,"7P8W9").map(str ->{
			String[] s = str.split("");
			for(String sp : s)
			{
				try 
				{
					l.add(Integer.parseInt(sp));
				}
				catch(Exception e)
				{	
				}
			}
			return str;
		}).forEach(System.out :: println);
		
		
		Object[] array = l.stream().toArray();
		
		Integer sum = 0;
		
		for(Object op : array )
		{
			sum += (Integer)op;
		}
		System.out.println("Sum of number in String is : ");
		System.out.println(sum);
	}
}


