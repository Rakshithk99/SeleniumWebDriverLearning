package day43;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotations {
	@BeforeSuite
	void bs() {
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	void as() {
		System.out.println("After Suite");
	}
	
	@AfterTest
	void at() {
		System.out.println("This is after Test");
	}
	@BeforeTest
	void bt() {
		System.out.println("This is before Test");
	}
	
	@BeforeMethod
	   void login() {
		System.out.println("This is before method...");
	  }
	@AfterMethod
	  void logout() {
		  System.out.println("this is after method...");
	  }
	
	@Test
	void test() {
		System.out.println("Test");
	}
}
