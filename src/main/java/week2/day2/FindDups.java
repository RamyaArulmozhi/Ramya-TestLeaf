package week2.day2;

import java.util.Arrays;

public class FindDups {
	
	public void duplicateValue(int[] num)
	
	{
		
		Arrays.sort(num);
		
		for(int i=0;i<num.length-1;i++)
		{
			
			
				if(num[i]==num[i+1])
				{
					System.out.println(num[i]);
				}
		
		}
	}

	public static void main(String[] args) {
		
		FindDups dupe=new FindDups();
		
		int [] num= {2,5,7,7,5,9,2,3};
		
		dupe.duplicateValue(num);
		
		
		
		

	}

}
