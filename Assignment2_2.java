package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2_2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();

		String firstLeadID = driver.findElement(By.xpath("//div[contains(@class,'x-grid3-col-partyId')]/a[1]")).getText();
		
		System.out.println("The First Lead ID is " + firstLeadID);
				
		driver.findElement(By.xpath("//div[contains(@class,'x-grid3-col-partyId')]/a[1]")).click();
		
		driver.findElement(By.xpath("//a[text()='Delete']")).click();

		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		driver.findElement(By.xpath("//div[@class='x-form-element']/input[@name='id']")).sendKeys(firstLeadID);

		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		
		String verify = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		
		if (verify.equals("No records to display")) {
			System.out.println("I confirmed that the Lead ID " + firstLeadID + " has been Deleted Successfully");
		} else {
			System.out.println("The Lead ID " + firstLeadID + " has not Deleted yet");
		}

		Thread.sleep(2000);
		
		driver.close();

	}

}
