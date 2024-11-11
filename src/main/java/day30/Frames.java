package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		

		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");
		
		driver.switchTo().defaultContent();
		
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		
		driver.switchTo().frame(frame2);
		
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Selenium");
		
		driver.switchTo().defaultContent();
		
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Java");
		driver.switchTo().frame(0);	//switching to frame using index. Index to be used only when there is 1 frame inside
		
		//Get the iframe URL from F12 and then in the new page, inspect for elements
		//https://docs.google.com/forms/d/e/1FAIpQLScP-K8zi-9ar0MCq93D3VIFhegSNPveBfdLqiMfTYR9Q1iSKQ/viewform?embedded=true
		WebElement rdbutton = driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']"));
		
		//Approach 1
		//rdbutton.click();
		
		//Approach 2
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", rdbutton);
		
		
		
	}

}
