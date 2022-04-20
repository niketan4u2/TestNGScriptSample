package ui;

import org.testng.annotations.Test;

import common.CommonDataSetup;

import org.testng.annotations.Test;

@Test(groups="user.registration")
public class GroupsDemoTest  extends CommonDataSetup{

	@Test(priority = 1, groups = "regression")
	public void loginTest() {
		System.out.println("Login is successful.");
	}

	@Test(priority = 2,groups = "regression" )
	public void logout() {
		System.out.println("Logout is successful.");
	}
	
	@Test(groups= {"regression","bvt"})
	public void bTest3() {
		System.out.println("test3");
	}
	
	@Test(groups = "bvt")
	public void btest4() {
		System.out.println("test4");
	} 
	

}
