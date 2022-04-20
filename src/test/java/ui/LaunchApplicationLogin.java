package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApplicationLogin {
	
	//public static String browser = "edge";//External configuration XLS,CSV
	public static WebDriver driver;
	
	@Parameters({"browser"})
	@Test
	public void launchApplication(String browser) {
		
		if(browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
		}else if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			
		}else if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
		}
		
		WebDriver driver = new ChromeDriver();
		Reporter.log("New chrome browser open.",true);
		
		driver.get("https://www.saucedemo.com/");
		String url = driver.getCurrentUrl();
		Reporter.log(url,true);
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Reporter.log("Login with user id : standard_user");
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Reporter.log("Password is : secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		Reporter.log("Login is successfull",true);
		Reporter.log("Windows closed");
		driver.close();
	}
}