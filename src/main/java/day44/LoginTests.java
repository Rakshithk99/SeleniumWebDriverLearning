package day44;

import org.testng.annotations.Test;

public class LoginTests {

	@Test (priority=1, groups= {"sanity"})
	void loginByEmail() {
		System.out.println("Login by email...");
	}
	
	@Test(priority=2, groups= {"sanity"})
	void loginByFB() {
		System.out.println("Login by fb...");
	}
	
	@Test(priority=3, groups= {"sanity"})
	void loginByTW() {
		System.out.println("Login by twitter...");
	}
}
