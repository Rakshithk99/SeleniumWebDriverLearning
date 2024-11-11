package day26;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		//isDisplayed
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println(logo.isDisplayed());
		
		//isEnabled
		boolean firstnameEnabled=driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		System.out.println(firstnameEnabled);
		
		//isSelected
		WebElement maleRB=driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement femaleRB=driver.findElement(By.xpath("//input[@id='gender-female']"));
		System.out.println("Male RB:"+maleRB.isSelected());
		maleRB.click();
		System.out.println("Male RB:"+maleRB.isSelected());
	}

}