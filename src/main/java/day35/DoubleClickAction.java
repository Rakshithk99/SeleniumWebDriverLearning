package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		

		WebElement field1 = driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement field2= driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement btn = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		field1.clear();
		field1.sendKeys("welcome");
		
		//Double Click
		Actions act = new Actions(driver);
		act.doubleClick(btn).build().perform();
		
		String val = field2.getAttribute("value");
		if(val.equals(field1.getAttribute("value"))) {
			System.out.println("Copied properly!");
		} else {
			System.out.println("Not copied properly");
		}
		
	}

}
