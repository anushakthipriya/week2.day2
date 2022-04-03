package week2.day2;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdownSample {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();

		// 1: find the dropdown element (select tag)
		 
		WebElement eleDropdown = driver.findElement(By.id("dropdown1"));
		
		// 2: convert it to select class (Dropdown)
		
		Select dd = new Select(eleDropdown);
		
//		 3: choose your value from drop down 
//		dd.selectByVisibleText("Selenium");
//		dd.selectByIndex(1);
//		dd.selectByValue("1");
		
		// how to get options?
		
		List options = (List) dd.getOptions();
		int size = dd.getOptions().size();
		
		for(int i=0; i<size; i++)
		WebElement options = options.get(i);
		String text = option.getText();
			System.out.println(text);
			
			// dd.selectByIndex(size-2);
	}

}
