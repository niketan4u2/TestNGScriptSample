package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import common.CommonDataSetup;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleAndTextTest extends CommonDataSetup {

	@Test
	public void titleTest() {
		
		SoftAssert softAssert = new SoftAssert();
		String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		String expectedText = "Search";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		String actualTitle = driver.getTitle();
		
		System.out.println("Verify Title");
		softAssert.assertEquals(actualTitle, expectedTitle,"Title verification failed");
		
		String actualText = driver.findElement(By.xpath("//input[@id='gh-btn']")).getAttribute("value");
		System.out.println("Verify Text");
		softAssert.assertEquals(actualText, expectedText, "Text verification failed");
		System.out.println("Closing Windows");
		
		driver.close();
		softAssert.assertAll();
	}
	
}
