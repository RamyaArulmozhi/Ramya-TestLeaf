package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/");
		
		System.out.println("The Leaftap browser launched successfully");
		
		Thread.sleep(4000);
		
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		Thread.sleep(3000);
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Accounts")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Create Account")).click();
		
		Thread.sleep(3000);
		
		WebElement ac=driver.findElement(By.id("accountName"));
		
		ac.sendKeys("Ramya13");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		Thread.sleep(5000);
		
		WebElement industry1=driver.findElement(By.name("industryEnumId"));
		
		Select industry=new Select(industry1);
		
		industry.selectByValue("IND_SOFTWARE");
		
		Thread.sleep(5000);
		
		WebElement ownership1=driver.findElement(By.name("ownershipEnumId"));
		
		Select ownership=new Select(ownership1);
		
		ownership.selectByVisibleText("S-Corporation");
		
		Thread.sleep(5000);
		
		WebElement source1=driver.findElement(By.id("dataSourceId"));
		
		Select source=new Select(source1);
		
		source.selectByValue("LEAD_EMPLOYEE");
		
		Thread.sleep(4000);
		
		WebElement marketingCampaign= driver.findElement(By.id("marketingCampaignId"));
		
		Select mc=new Select(marketingCampaign);
		
		mc.selectByIndex(6);
		
		WebElement stateProvince=driver.findElement(By.id("generalStateProvinceGeoId"));
		
		Select state=new Select(stateProvince);
		
		state.selectByValue("TX");
		
		Thread.sleep(5000);
		
		driver.findElement(By.className("smallSubmit")).click();
		
		Thread.sleep(3000);
		
		driver.close();
		
		
		
		
		
		
				
				
		
		
		
		
		
		
		

	}

}
