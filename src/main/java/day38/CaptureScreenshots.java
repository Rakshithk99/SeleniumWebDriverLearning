package day38;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshots {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php/");
		driver.manage().window().maximize();
		
		//1)Capture full page screenshot
		TakesScreenshot scrnshot = (TakesScreenshot) driver;
		File srcFile = scrnshot.getScreenshotAs(OutputType.FILE);
		File targetFile = new File(System.getProperty("user.dir")+"\\screenshots\\Fullpage.png");
		srcFile.renameTo(targetFile);
	
		
		//2)Capture the screenshot from the Specific section
		driver.get("https://demo.opencart.com/");
		WebElement banner = driver.findElement(By.xpath("//div[@id='carousel-banner-1']"));
		File sourceFile = banner.getScreenshotAs(OutputType.FILE);
		File trgtFile = new File(System.getProperty("user.dir")+"\\screenshots\\Fullpage1.png");
		sourceFile.renameTo(trgtFile);
		
		
		//3)Capture screenshot of webelement
		
		driver.get("https://demo.opencart.com/");
		WebElement logo = driver.findElement(By.xpath("//img[@title='Your Store']"));
		
		File sourceFile1 = logo.getScreenshotAs(OutputType.FILE);
		File trgtFile1 = new File(System.getProperty("user.dir")+"\\screenshots\\logo.png");
		sourceFile1.renameTo(trgtFile1);
	}

}
