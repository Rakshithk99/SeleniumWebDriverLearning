package day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement fname = driver.findElement(By.xpath("//input[@id='name']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//JS statements will be used when driver throws ElementInterceptException
		
		/*
		 * If driver is assigned to ChromeDriver class, then upcasting is not required for JS
		 * ChromeDriver driver = new ChromeDriver();
		 * JavaScriptExecutor js = driver;
		 * 
		 * 
		 */
		
		//Passing the value instead of sendKeys
		js.executeScript("arguments[0].setAttribute('value','Rakshith')", fname);
		
		//Clicking on element
		WebElement rdBtn = driver.findElement(By.xpath("//input[@id='male']"));
		js.executeScript("arguments[0].click()", rdBtn);
	}

}
