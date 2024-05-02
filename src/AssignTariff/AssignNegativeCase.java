package AssignTariff;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignNegativeCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/assigntariffplantocustomer.php");
		
		driver.findElement(By.name("customer_id")).sendKeys("321987");
		driver.findElement(By.name("submit")).click();
	}
 
}
