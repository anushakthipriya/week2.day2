package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class relativeXpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
			
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("TestLeaf");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Haja");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("J");
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(text);
		
		String title = driver.getTitle();
		System.out.println(title); 
		
		driver.close();
		
		
		
	}
		
	}
