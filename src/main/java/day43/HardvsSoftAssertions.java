package day43;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardvsSoftAssertions {

	//@Test
	void test_HardAssertions() {
		System.out.println("Testing");
		Assert.assertEquals(1, 1);	//Hard Assertion
		System.out.println("testing");	//This wont be executed if the above assert statement fails
	}
	
	@Test
	void test_SoftAssertions() {
		System.out.println("Testing");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(1, 2);	//Soft Assertion
		System.out.println("testing");	//This will be executed even if the above assert statement fails
		
		sa.assertAll();  //This is mandatory for soft assert. If not, it will be pass by default
	}
}
