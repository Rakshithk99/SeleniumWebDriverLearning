package day28;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingSpecificBrowserWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	//implicit
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> windowIDs=driver.getWindowHandles();
		for(String winID:windowIDs) {
			String title=driver.switchTo().window(winID).getTitle();
			System.out.println(title);
			if(title.equals("OrangeHRM")) {
				driver.close();
			}
			
			//to close multiple windows
			if(title.equals("asas") || title.equals("dfdf")) {
				driver.close();
			}
		}
	}

}
