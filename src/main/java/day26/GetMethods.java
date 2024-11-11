package day26;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	
	//get() to open the URL on the browser
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	System.out.println("Title: "+driver.getTitle());
	System.out.println("CurrentURL: "+driver.getCurrentUrl());
	System.out.println("PageSource"+driver.getPageSource());
	String windowID=driver.getWindowHandle();
	System.out.println("WindowID:"+windowID); //957C0C316C722BD752857EDFF05A7435
	driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	Set<String> windowIDs=driver.getWindowHandles();
	System.out.println("Window IDs:"+windowIDs); //[957C0C316C722BD752857EDFF05A7435, 94E5514940AB7293C7497B7CB8BF4226]
	
	
}
}
