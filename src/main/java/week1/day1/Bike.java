package week1.day1;

public class Bike {
	
	public void applyBreak()
	{
		System.out.println("Applied break in bike");
	}

	public static void main(String[] args)
	
	{
		Bike scooty=new Bike();
		Car alto=new Car();

		alto.applyBreak();
		alto.soundHorn();
		scooty.applyBreak();
	}

}
