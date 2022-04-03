package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2_4 {

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
		
		driver.findElement(By.xpath("//div[contains(@class,'x-tab-item')]/following-sibling::div/div/input[@name='firstName']")).sendKeys("ANU");

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		driver.findElement(By.xpath("//div[contains(@class,'x-grid3-col-partyId')]/a")).click();
		
		if (driver.getTitle().contains("View Lead")) {
			System.out.println("Verify that the Current Page title is View Lead");
		} else {
			System.out.println("Current Page is not a View Lead page");
		}

		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[3]")).click();
		
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		String changedCompany = "INFOSYS";
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys(changedCompany);

		
		driver.findElement(By.xpath("//input[@value='Update']")).click();
	
		String company = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (company.contains(changedCompany)) {
			System.out.println("I confirmed that the Changed Company Name Appeared");
		} else {
			System.out.println("The Changed Company Name does not Appeared");
		}
		
		
		driver.close();

	}

}
