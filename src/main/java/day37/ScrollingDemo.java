package day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class ScrollingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//Approach -1: Scroll down page by pixel number
		js.executeScript("window.scrollBy(0,1500)", "");
		System.out.println(js.executeScript("return window.pageYoffset;"));
		
		//Approach-2: Scroll the page till element is visible
		WebElement communityPoll = driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
		js.executeScript("arguments[0].scrollIntoView();", communityPoll);
		System.out.println(js.executeScript("return window.pageYoffset;"));
		
		//Approach-3: Scroll till end of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYoffset;"));
		
		//Scroll up to initial position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	}

}
