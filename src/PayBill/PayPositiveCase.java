package PayBill;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import AddCustomer.AddPositiveCase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PayPositiveCase extends AddPositiveCase {
	  
	public static void billPayment(String custID){

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/billing.php");

		driver.findElement(By.name("customer_id")).sendKeys(custID);
		driver.findElement(By.name("submit")).click(); 
	}
	
	public static void main(String[] args) {
		
		String customerID =  AddPositiveCase.addCustomer();
		billPayment(customerID);

	}

	
}


