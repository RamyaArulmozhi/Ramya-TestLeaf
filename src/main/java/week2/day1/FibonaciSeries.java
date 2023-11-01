package week2.day1;

public class FibonaciSeries {

	public static void main(String[] args) {
		
		int input=8;
		
		int a=0;
		int b=1;
		int c;
		
		System.out.println("Below is the fibonacci series of the "+input);
		
		for(int i=1;i<=input;i++)
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}

	}

}
