package week2.day1;

public class IsPrime {

	

	public boolean findingPrime(int num)
	{


		if(num<=1)
		{
			
			return false;
		}

		if(num==2||num==3)
		{
			
			return true;
		}

		int count=num/2;

		for(int i=2;i<count;i++)
		{
			if(num%i==0)
			{
				return false;
				
			}
		}
		return true;

	}

	public static void main(String[] args) {



		IsPrime number=new IsPrime();
		
		int input = 13;

		boolean foundPrime=number.findingPrime(input);
		
		if (foundPrime) {
			System.out.println("The input "+input+" is a  prime Number");
		} else {
			
			System.out.println("The input "+input+" is a not prime Number");
		}


	}

}
