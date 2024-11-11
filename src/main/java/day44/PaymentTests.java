package day44;

import org.testng.annotations.Test;

public class PaymentTests {
	@Test (priority=1, groups= {"sanity", "regression", "functional"})
	void paymentInRupees() {
		System.out.println("Payment In Rupees...");
	}
	
	@Test(priority=2, groups= {"sanity", "regression", "functional"})
	void paymentInUSD() {
		System.out.println("Payment in USD...");
	}
	
	
}
