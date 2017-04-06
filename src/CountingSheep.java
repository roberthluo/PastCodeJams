import java.util.*;
import java.io.*;

public class CountingSheep {
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = in.nextInt(); // Scanner has functions to read ints, longs,
								// strings, chars, etc.
		boolean [] arr = new boolean[10];
		
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = false;
		}
		boolean allDigits = false;
		// case 1
		int count = 1;
		if(t == 0)
		{
			System.out.println("INSOMNIA");
		}
		
		// other cases
		while(allDigits)
		{
			int n = t * count;
			char [] num = Integer.toString(n).toCharArray();
			
			for(int i = 0; i < num.length; ++i)
			{
				int val = Character.getNumericValue(num[i]);
				arr[val] = true;
			}
			
			for(int i = 0; i < arr.length; i++)
			{
				if(!arr[i])
				{
					break;
				}
				
				if(arr[9])
				{
					System.out.println(n);
				}
			}
			++count;
		}
	}
}
