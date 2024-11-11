package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrap {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();

		//Select single option from the dropdown
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();	//opens dropdown options
		//driver.findElement(By.xpath("//input[@value='Java']")).click();	//Select single option
		
		//capture all options and get size
		List<WebElement> options=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		System.out.println(options.size());
		
		//printing options from dropdown
		for(WebElement option:options) {
			System.out.println(option.getText());
		}
		
		//select multiple options
		for(WebElement option:options) {
			String optionValue = option.getText();
			if(optionValue.equals("Java") || optionValue.equals("Python") || optionValue.equals("Oracle")) {
				option.click();
			}
		}
		
		
	}

}
