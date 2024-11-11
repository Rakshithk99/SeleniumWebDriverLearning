package day21;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new EdgeDriver();
		driver.get("https://demo.opencart.com");
		
		//Validate title should be "Your Store"
		String act_title=driver.getTitle();
		if(act_title.equals("Your Store")) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		//close driver
		driver.close();
		//driver.quit();
	}

}
