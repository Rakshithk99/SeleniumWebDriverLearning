package day28;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalMethods {

	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver = new ChromeDriver();
		//driver.get("https://demo.nopcommerce.com");	//accepts URL only in the String format
		//driver.navigate().to("https://demo.nopcommerce.com");	//accepts URL in String format as well as in URL object

		URL myURL = new URL("https://demo.nopcommerce.com");
		driver.navigate().to(myURL);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().back();
		System.out.println("After clicking back:"+driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println("After clicking forward:"+driver.getCurrentUrl());
		driver.navigate().refresh();

	}

}
