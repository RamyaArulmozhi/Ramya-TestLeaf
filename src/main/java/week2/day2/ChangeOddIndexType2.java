package week2.day2;

public class ChangeOddIndexType2 {
	
	

	public static void main(String[] args) {
		
		String test="changemee";
		
		char[] chrArr=test.toCharArray();
		
		for(int i=0;i<chrArr.length;i=i+2)
		{
		    chrArr[i]= Character.toUpperCase(chrArr[i]);	
		   
		}
	
		System.out.println(chrArr);
	}

}
