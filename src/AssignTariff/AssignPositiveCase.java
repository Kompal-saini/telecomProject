package AssignTariff;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import AddCustomer.AddPositiveCase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignPositiveCase extends AddPositiveCase {

	static String customerID;
	
	public static void assign() {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/assigntariffplantocustomer.php");
		
		driver.findElement(By.name("customer_id")).sendKeys(customerID);
		driver.findElement(By.name("submit")).click();
		driver.close();
	}
	
	public static void main(String[] args) {
		
		customerID = AddPositiveCase.addCustomer();
		assign();	
}
	
}