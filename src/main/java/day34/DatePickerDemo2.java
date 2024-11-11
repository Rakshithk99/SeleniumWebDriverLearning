package day34;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerDemo2 {
	
	static void selectDate(WebDriver driver, String year, String month, String date) {
		//Select year
				WebElement yearDrpDown = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
				Select year1 = new Select(yearDrpDown);
				year1.selectByVisibleText(year);
				
				//Select Month
				//span[@class='ui-datepicker-month']
				while(true) {
				String displayedMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
				Month displayMonth = convertMonth(displayedMonth);
				Month expectedMonth = convertMonth(month);
				
				
				//compare
				int result = expectedMonth.compareTo(displayMonth);
				if(result<0) {
					//past month
					//span[@class='ui-icon ui-icon-circle-triangle-w']
					driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
				} else if(result>0) {
					//future month
					driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
				} else {
					break;
				}
			
				}
				
				List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody/tr/td/a"));
				for(WebElement dt:allDates) {
					if(dt.getText().equals(date)) {
						dt.click();
						break;
					}
				}
	}

	static Month convertMonth(String month) {
		HashMap<String, Month> monthMap= new HashMap<String, Month>();
		monthMap.put("January", Month.JANUARY);
		monthMap.put("February", Month.FEBRUARY);
		monthMap.put("March", Month.MARCH);
		monthMap.put("April", Month.APRIL);
		monthMap.put("May", Month.MAY);
		monthMap.put("June", Month.JUNE);
		monthMap.put("July", Month.JULY);
		monthMap.put("August", Month.AUGUST);
		monthMap.put("September", Month.SEPTEMBER);
		monthMap.put("October", Month.OCTOBER);
		monthMap.put("November", Month.NOVEMBER);
		monthMap.put("December", Month.DECEMBER);
		
		Month vmonth = monthMap.get(month);
		if(vmonth==null) {
			System.out.println("Invalid month");
			
		}
		
		
		
		return vmonth;
		
	}
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("frame-one796456169");
		
		driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();
		String month="January";
		String date="25";
		String year="2021";
		
		selectDate(driver, year, month, date);
	}

}
