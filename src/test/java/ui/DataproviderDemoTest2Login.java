package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners({util.Listener.class})
public class DataproviderDemoTest2Login {

	
	@Test(dataProvider="create")
	public void test1(String username, String password) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		Reporter.log("New chrome browser open.",true);
		
		driver.get("https://www.saucedemo.com/");
		String url = driver.getCurrentUrl();
		Reporter.log(url,true);
		
		driver.findElement(By.id("user-name")).sendKeys(username);
		Reporter.log("Login with user id : "+username+",");
		
		driver.findElement(By.id("password")).sendKeys(password);
		Reporter.log("Password is : "+password+".");
		
		driver.findElement(By.id("login-button")).click();
		Reporter.log("Login is successfull",true);
		Reporter.log("Windows closed");
		driver.close();
	}
	
	@DataProvider(name = "create")
	public Object[][] dataSet1(){
		return new Object[][] {
			{"standard_user","secret_sauce"},
			{"locked_out_user","secret_sauce"},
			{"problem_user","secret_sauce"},
			{"performance_glitch_user","secret_sauce"}
		};
	}
	
}
