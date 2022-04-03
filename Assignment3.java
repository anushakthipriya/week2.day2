package week2.day2;


	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Assignment3 {
		public static void main(String[] args) throws InterruptedException {
			
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://acme-test.uipath.com/login");
		

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.findElement(By.xpath("//div[contains(@class,'control-group')]//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");

			driver.findElement(By.xpath("//label[@for='password']/following-sibling::input[@id='password']"))
					.sendKeys("leaf@12");

			driver.findElement(By.xpath("//a[@class='btn bg-warning']/preceding-sibling::button")).click();
			
			String title = driver.getTitle();
			System.out.println(title);
			
			driver.findElement(By.xpath("//form[@id='logout-form']/following-sibling::li/a")).click();
			
			driver.close();
		}
	}

