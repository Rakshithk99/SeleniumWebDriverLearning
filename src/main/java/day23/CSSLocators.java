package day23;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CSSLocators {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.nopcommerce.com");
	driver.manage().window().maximize();
	//tag id 	 tag#id
	driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("iPhone");
	//only id
	driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("iPhone");
	
	//tag  class	tag.classname
	driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("iPhone");
	driver.findElement(By.cssSelector(".search-box-text")).sendKeys("iPhone");
	
	//tag attribute 	tag[attribute="value"]
	driver.findElement(By.cssSelector("input[placeholder=\"Search store\"]")).sendKeys("sqasa");
	driver.findElement(By.cssSelector("[placeholder=\"Search store\"]")).sendKeys("sqasa");
	
	driver.findElement(By.cssSelector("input.search-box-text[name=\"q\"]")).sendKeys("sds");
	driver.findElement(By.cssSelector(".search-box-text[name=\"q\"]")).sendKeys("sds");
	
	
}
}
