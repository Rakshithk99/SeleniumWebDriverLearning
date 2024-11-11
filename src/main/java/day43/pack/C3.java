package day43.pack;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C3 {

	@Test
	void mno() {
		System.out.println("C3");
	}
	
	@BeforeSuite
	void bs() {
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	void as() {
		System.out.println("After Suite");
	}
}
