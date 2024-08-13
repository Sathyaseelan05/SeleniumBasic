
package basic;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Features {
	static WebDriver driver;

	
	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\sathya\\eclipse-workspace\\Selenium\\chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.navigate().to("https://leafground.com/");
			
		    WebElement Element =	driver.findElement(By.xpath("//*[@id=\"menuform:j_idt40\"]/a/i[1]"));
			Element.click();
			
			WebElement dropdown =	driver.findElement(By.xpath("//*[normalize-space()='Dropdown']"));
			dropdown.click();
			
			WebElement dropdownvalues =	driver.findElement(By.xpath("//*[@class=\"ui-selectonemenu\"]"));

			Select select = new Select(dropdownvalues);
			select.selectByIndex(3);
	}

}
