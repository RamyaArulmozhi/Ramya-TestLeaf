package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.manage().window().maximize();
		
		driver.get("https://en-gb.facebook.com/");
		
		System.out.println("Browser launched sucessfully");
		
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Ramya29");
		
		driver.findElement(By.name("lastname")).sendKeys("Arulmozhi");
		
		driver.findElement(By.name("reg_email__")).sendKeys("12345678");
		
		driver.findElement(By.id("password_step_input")).sendKeys("R@mya@123");
		
		//Select date from 1st dropdown
		
		WebElement date=driver.findElement(By.id("day"));
		
		Select date1=new Select(date);
		
		date1.selectByVisibleText("22");
		
		//Select month from 2nd dropdown
		
		WebElement month=driver.findElement(By.id("month"));
		
		Select month1=new Select(month);
		
		month1.selectByValue("5");
		
		//Select year from 3rd dropdown
		
		WebElement year=driver.findElement(By.id("year"));
		
		Select year1=new Select(year);
		
		year1.selectByVisibleText("1993");
		
		System.out.println("The account creation entry is done sucessfully");
		
		Thread.sleep(4000);
		
		driver.findElement(By.name("sex")).click();
		
		driver.close();
		
		
		

	}

}
