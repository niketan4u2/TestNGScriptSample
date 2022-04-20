package ui;

import org.testng.annotations.Test;

import common.CommonDataSetup;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest extends CommonDataSetup  {

	@BeforeTest
	public void loginToApplication() {
		System.out.println("Logged in to application");
	}

	@AfterTest
	public void logoutFromApplication() {
		System.out.println("Logout from the application");
	}

	@BeforeMethod
	public void dbconnect() {
		System.out.println("DB Connected");
	}
	@AfterMethod
	public void disconnectdb() {
		System.out.println("Disconnected database");
	}
	
	@Test(priority = 1, description = "This is login test")
	public void loginTest() {
		System.out.println("Login is successful.");
	}

	@Test(priority = 2, description = "This is logout")
	public void logout() {
		System.out.println("Logout is successful.");
	}
}
