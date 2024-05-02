package AddTariffPlan;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TariffNegativeCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/addtariffplans.php");
		
		driver.findElement(By.name("rental")).sendKeys("abc");
		driver.findElement(By.name("local_minutes")).sendKeys("aaa");
		driver.findElement(By.id("inter_minutes")).sendKeys("xyz");
		driver.findElement(By.id("sms_pack")).sendKeys("ww");
		driver.findElement(By.name("minutes_charges")).sendKeys("ad");
		driver.findElement(By.id("inter_charges")).sendKeys("aff");
		driver.findElement(By.name("sms_charges")).sendKeys("we");
		driver.findElement(By.name("submit")).click();
	}

}
