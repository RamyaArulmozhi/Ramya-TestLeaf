package week2.day2;

public class ChangeOddIndex {

	public static void main(String[] args) {
		
		String test="changeme";
		
		char[] chrArr=test.toCharArray();
		
		for(int i=0;i<chrArr.length;i++)
		{
			//System.out.print(chrArr[i]);
			
			if(i%2!=0)
			{
				char ch1=Character.toUpperCase(chrArr[i]);
				chrArr[i]=ch1;
				
			}
			
			
		}
		
		System.out.println(chrArr);
	}

}
