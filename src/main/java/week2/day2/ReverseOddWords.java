package week2.day2;

public class ReverseOddWords {
	
	public String reverse(String ch3)
	{
		String ch5="";
		char[] ch4=ch3.toCharArray();
		
		for(int i=ch4.length-1;i>=0;i--)
		{
			ch5=ch5+ch4[i];
		}
		
		return ch5;
	}

	public static void main(String[] args) {
		
		ReverseOddWords sentence=new ReverseOddWords();
		
		String test="I am a software tester";
		
		String[] ch2=test.split(" ");
		
		for(int i=0;i<ch2.length;i++)
		{
			if(i%2!=0)
			{
				
				ch2[i]=sentence.reverse(ch2[i]);
				
			}
		}
		for(int i=0;i<ch2.length;i++) {
			System.out.print(ch2[i]+ " ");
		}
	
	}
		

}
