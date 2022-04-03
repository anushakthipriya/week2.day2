package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 

		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Anu");
		driver.findElement(By.name("lastname")).sendKeys("Shakthi Priya");
		driver.findElement(By.name("reg_email__")).sendKeys("jkanu15@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("aspanu15");
		WebElement eleDropdown=driver.findElement(By.xpath("//select[@title='Day']"));
		Select dd=new Select(eleDropdown);
		dd.selectByVisibleText("15");
		WebElement eleDropdown1=driver.findElement(By.xpath("//select[@title='Month']"));
		Select dd1=new Select(eleDropdown1);
		dd1.selectByVisibleText("Feb");
		WebElement eleDropdown2=driver.findElement(By.xpath("//select[@title='Year']"));
		Select dd2=new Select(eleDropdown2);
		dd2.selectByVisibleText("1992");
		driver.findElement (By.xpath ("//label[text()='Female']")).click();
	}

	

}
