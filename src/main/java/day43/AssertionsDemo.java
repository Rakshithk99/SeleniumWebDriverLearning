package day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {

	@Test
	void testTitle() {
		String exp_title = "Opencart";
		String act_title = "Openshp";
		//Assert-1
		//Assert.assertEquals(act_title, exp_title);
		
		//Assert-2
		if(exp_title.equals(act_title)) {
			Assert.assertTrue(true);	//expected true, passed true
		} else {
			Assert.assertTrue(false);	//expected true, passed false
		}
		
	}
}
