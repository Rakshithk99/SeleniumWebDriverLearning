package day27;


import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;



public class FluentWait {	//this is not working

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//Fluent wait declaration
		Wait<WebDriver> mywait = new org.openqa.selenium.support.ui.FluentWait<WebDriver>(driver)
									.withTimeout(Duration.ofSeconds(10))
									.pollingEvery(Duration.ofSeconds(2))
									.ignoring(NoSuchElementException.class);
		
		
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		WebElement txtusername=mywait .until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//input[@placeholder='Username']"));
			}
		});
		
		txtusername.sendKeys("Admin");
		
	}

}
