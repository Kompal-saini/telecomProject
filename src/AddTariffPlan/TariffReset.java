package AddTariffPlan;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TariffReset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/addtariffplans.php");
		
		driver.findElement(By.name("rental")).sendKeys("400");
		driver.findElement(By.name("local_minutes")).sendKeys("1000");
		driver.findElement(By.id("inter_minutes")).sendKeys("500");
		driver.findElement(By.id("sms_pack")).sendKeys("300");
		driver.findElement(By.name("minutes_charges")).sendKeys("20");
		driver.findElement(By.id("inter_charges")).sendKeys("30");
		driver.findElement(By.name("sms_charges")).sendKeys("10");
		driver.findElement(By.cssSelector("#main > div > form > div > div.\\36 u\\$ > ul > li:nth-child(2) > input")).click();
	}

}
