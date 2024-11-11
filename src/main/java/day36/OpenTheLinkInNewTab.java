package day36;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenTheLinkInNewTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com");
		driver.manage().window().maximize();
		
		WebElement register = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		
		Actions act = new Actions(driver);
		
		//Ctrl+Register
		act.keyDown(Keys.CONTROL).click(register).keyUp(Keys.CONTROL).perform();
		
		//Switching to Register page
		List<String> windowIDs = new ArrayList(driver.getWindowHandles());
		
		driver.switchTo().window(windowIDs.get(1));	//Switch to register page
		driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		
	}

}
