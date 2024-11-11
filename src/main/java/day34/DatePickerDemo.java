package day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {
	
	static void selectMonthAndYear(WebDriver driver, String month, String year) {
		//to select month and year
				while(true) {
					String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
					String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
					if(currentMonth.equals(month) && currentYear.equals(year)) {
						break;
					} else {
						driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();	//Next
					}
				}
				
	}
	
	static void selectDate(WebDriver driver,String date) {
		//to select date
		List<WebElement> dates= 	driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody/tr/td/a"));
		for(WebElement date1:dates) {
			String date2=date1.getText();
			if(date2.equals(date)) {
				date1.click();
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		//Method-1
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("08/19/2024");
		
		//Method-2
		String year="2025";
		String month="August";
		String date="21";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		
		selectMonthAndYear(driver, month, year);
		
		selectDate(driver, date);
		
		
	}

}
