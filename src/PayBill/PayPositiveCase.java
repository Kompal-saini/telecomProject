package PayBill;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import AddCustomer.AddPositiveCase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PayPositiveCase extends AddPositiveCase {
	
	  static String customerID;
	public static void billPayment(){

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/billing.php");

		driver.findElement(By.name("customer_id")).sendKeys(customerID);
		driver.findElement(By.name("submit")).click(); 
	}
	
	public static void main(String[] args) {
		
		customerID =  AddPositiveCase.addCustomer();
		billPayment();

	}

	
}


