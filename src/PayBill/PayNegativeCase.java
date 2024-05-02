package PayBill;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import AddCustomer.AddPositiveCase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PayNegativeCase extends AddPositiveCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/billing.php");
		driver.findElement(By.name("customer_id")).sendKeys("abcd");
		driver.findElement(By.name("submit")).click();
		
		
	}

}
