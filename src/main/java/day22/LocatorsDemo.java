package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com");
		driver.manage().window().maximize();
		
		//name
		//driver.findElement(By.name("search")).sendKeys("Mac");
		
		//id
		//boolean logoDisplayStatus = driver.findElement(By.id("logo")).isDisplayed();
		//System.out.println(logoDisplayStatus);
		
		//linktext and partial linktext
		//driver.findElement(By.linkText("Tablets")).click();
		//driver.findElement(By.partialLinkText("Tab")).click();
		
		//classname
		//List<WebElement> headerLinks=driver.findElements(By.className("list-inline-item"));
		//System.out.println("Total number of header links: "+ headerLinks.size());
		
		//tagname
		//List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		//System.out.println(allLinks.size());
		
		List<WebElement> imageLinks = driver.findElements(By.tagName("img"));
		System.out.println(imageLinks.size());
		
	}
}
