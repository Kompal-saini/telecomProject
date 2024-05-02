package AddCustomer;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddPositiveCase {

	public static void main(String[] args) {
		addCustomer();
	}
	
	public static String addCustomer(){
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/telecom/addcustomer.php");
		driver.findElement(By.xpath("//label[@for='pending']")).click();
		driver.findElement(By.id("fname")).sendKeys("abc");
		driver.findElement(By.name("lname")).sendKeys("def");
		driver.findElement(By.id("email")).sendKeys("abc@def.com");
		driver.findElement(By.name("addr")).sendKeys("abcdef ghi");
		driver.findElement(By.id("telephoneno")).sendKeys("1234567890");
		driver.findElement(By.name("submit")).click();
		String custId = driver.findElement(By.xpath("//table[@class='alt access']//td[2]//h3")).getText();
		return custId;
		
	
}

}
