package day42;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRMTest {
	
	WebDriver driver;
  @Test(priority=1)
  public void openapp() {
	  driver = new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
  }
  
  @Test(priority=2)
  public void testLogo() throws InterruptedException {
	  Thread.sleep(5000);
	  boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	  System.out.println("Logo Displayed..."+status);
  }
  
  @Test(priority=3)
  public void testLogin() {
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	
  }
  
  @Test(priority=4)
  public void testLogout() {
	  driver.quit();
  }
}
