package day44;

import org.testng.annotations.Test;

public class SignUpTests {

	@Test (priority=1, groups= {"regression"})
	void signupByEmail() {
		System.out.println("signup by email...");
	}
	
	@Test(priority=2, groups= {"regression"})
	void signupByFB() {
		System.out.println("signup by fb...");
	}
	
	@Test(priority=3, groups= {"regression"})
	void signupByTW() {
		System.out.println("signup by twitter...");
	}
}
