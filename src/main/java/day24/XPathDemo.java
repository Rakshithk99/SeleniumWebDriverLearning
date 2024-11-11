package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.opencart.com/");
	driver.manage().window().maximize();
	
	//xpath with single attribute
	//driver.findElement(By.xpath("//img[@title='MacBook']")).click();
	
	//xpath with multiple attributes
	//driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("asasa");
	
	//xpath with and operator
	//driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("asasa");
	
	//xpath with OR operator
	//driver.findElement(By.xpath("//input[@name='search' or @placeholder='Sech']")).sendKeys("asasa");
	
	//xpath without any attributes. with the help of link's inner text. syntax: //a[text()='value']
	//driver.findElement(By.xpath("//a[text()='MacBook']")).click();
	
	//xpath with inner text. Syntax: //tagname[text()='value']
	boolean isFeaturedVisible = driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
	System.out.println(isFeaturedVisible);
	System.out.println(driver.findElement(By.xpath("//h3[text()='Featured']")).getText());
	
	//xpath with contains
	driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("dsdsd");
	driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("fgfgf");
	
	
	//chained xpath
	boolean logoStatus=driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
	System.out.println(logoStatus);
}
}
