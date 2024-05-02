package AddCustomer;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddNegativeCase {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/telecom/addcustomer.php");
		driver.findElement(By.xpath("//label[@for='pending']")).click();
		driver.findElement(By.id("fname")).sendKeys("123");
		driver.findElement(By.name("lname")).sendKeys("432");
		driver.findElement(By.id("email")).sendKeys("abc12");
		driver.findElement(By.name("addr")).sendKeys("abc!!!");
		driver.findElement(By.id("telephoneno")).sendKeys("123ab");
		driver.findElement(By.name("submit")).click();
	}

}
