package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignmet2_3 {

public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoCSR");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.linkText("Email")).click();
		
		driver.findElement(By.xpath("//label[text()='Email Address:']/following-sibling::div/input")).sendKeys("aspanu@gmail.com");

		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		String fName = driver.findElement(By.xpath("//div[contains(@class,'x-grid3-col-firstName')]/a")).getText();
		String lName = driver.findElement(By.xpath("//div[contains(@class,'x-grid3-col-lastName')]/a")).getText();
		String name = fName + " " + lName;
		System.out.println("The First Resulting Lead is " + name);

		driver.findElement(By.xpath("//div[contains(@class,'x-grid3-col-partyId')]/a")).click();

		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[text()='Duplicate Lead']")).click();
		
		if (driver.getTitle().contains("Duplicate Lead")) {
			System.out.println("I Verified that the Current Page title is Duplicate Lead");
		} else {
			System.out.println("The Current Page is not a Duplicate Lead page");
		}

	
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
	
		String dupFName = driver.findElement(By.xpath("//span[contains(@id,'firstName')]")).getText();
		String dupLName = driver.findElement(By.xpath("//span[contains(@id,'lastName')]")).getText();
		String dupName = dupFName + " " + dupLName;
		if (name.equals(dupName)) {
			System.out.println("I confimed that the Duplicated Lead Name is same as Captured Lead Name");
		} else {
			System.out.println("The Duplicated Lead Name is not same as Captured Lead Name");
		}
		
		driver.close();
		

	}

}
