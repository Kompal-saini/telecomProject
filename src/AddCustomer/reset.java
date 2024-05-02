package AddCustomer;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class reset {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/telecom/addcustomer.php");
		driver.findElement(By.xpath("//label[@for='pending']")).click();
		driver.findElement(By.id("fname")).sendKeys("bc");
		driver.findElement(By.name("lname")).sendKeys("fef");
		driver.findElement(By.id("email")).sendKeys("abd@def.com");
		driver.findElement(By.name("addr")).sendKeys("awcwef ghi");
		driver.findElement(By.id("telephoneno")).sendKeys("3234567890");
		driver.findElement(By.xpath("//input[@type='reset']")).click();
		driver.close();
		driver.quit();
	}

}
