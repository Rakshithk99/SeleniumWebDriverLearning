package day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {
@Test
void test1() {
	//Assert.assertEquals("xyz", "xyz1");
	Assert.assertEquals(456, 123);
	
	Assert.assertNotEquals(123, 123);	//failed
	Assert.assertNotEquals(123, 456);	//passed
	
	Assert.assertTrue(true); 	//passed
	Assert.assertTrue(false);	//failed
	Assert.assertTrue(1==2);	//fail
	Assert.assertTrue(1==1);	//pass
	
	Assert.assertFalse(1==2); //pass
	Assert.assertFalse(1==1); //fail
	
	Assert.fail();
	
}
}
