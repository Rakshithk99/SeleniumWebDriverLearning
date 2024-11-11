package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class SelectDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement dropCountryEle = driver.findElement(By.xpath("//select[@id='country']"));
		
		Select drpCountry = new Select(dropCountryEle);
		
		//select option from dropdown
		//drpCountry.selectByValue("japan");
		//drpCountry.selectByVisibleText("France");
		drpCountry.selectByIndex(3);
		
		//capture all the options of dropdown
		List<WebElement> options = drpCountry.getOptions();
		System.out.println(options.size());
		
		//printing the options
		for(WebElement option:options) {
			System.out.println(option.getText());
		}
		System.out.println("_______");
		for(int i=0; i<options.size(); i++) {
			
			System.out.println(options.get(i).getText());
		}
		
	}

}
