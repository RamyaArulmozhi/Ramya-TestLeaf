package week1.day1;

public class Mobile {
	
	public void makeCall()
	{
		String mobileModel="VivoV5";
		float mobileWeight=1.45f;
		
		System.out.println("The user is able to make a call");
		System.out.println("The mobile model is "+mobileModel+" and the weight is "+mobileWeight);
		
		
	}
	
	public void sendMsg()
	{
		boolean isFullCharged= true;
		int mobileCost=25000;
		System.out.println("The user is able to send message");
		System.out.println("Is the mobile charged: "+isFullCharged+" and the cost is "+mobileCost);
		
	}

	public static void main(String[] args) 
	
	{
		Mobile vivo=new Mobile();
		
		vivo.makeCall();
		vivo.sendMsg();
		
		System.out.println("This is my mobile");

	}

}
