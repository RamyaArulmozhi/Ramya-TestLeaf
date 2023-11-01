package week2.day1;

public class PalinDrome {

	public static void main(String[] args) {
		
		int remainder;
		
		int reverse=0;
		
		int temp;
		
		int num=323;
		
		temp=num;
		
		while(num!=0)
		{
			remainder=num%10;
			reverse=(reverse*10)+remainder;
			num=num/10;
		}
		
		if(temp==reverse)
		{
			System.out.println(temp+" is a Palindrome");
		}
		else
		{
			System.out.println(temp+" is not a palindrome");
		}

	}

}
