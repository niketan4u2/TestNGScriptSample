package ui;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import common.CommonDataSetup;

public class BeforeAfterClass extends CommonDataSetup {
 
	@BeforeClass
	public void beforClass() {
		System.out.println("Run this before class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("Run this after class");
	}
	
	@BeforeGroups(value = "regression")
	public void beforGroup() {
		System.out.println("Run this before regression Groups");
	}
	
	@AfterGroups(value = "regression")
	public void afterGroup () {
		System.out.println("Run this after regression Groups");
	}
	
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
