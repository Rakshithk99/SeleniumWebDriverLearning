package day33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/*
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@id='input-username']"));
		username.clear();
		username.sendKeys("demo");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
		password.clear();
		password.sendKeys("demo");
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
		driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();
		*/
		
		String s = driver.findElement(By.xpath("//div[contains(text(),'Pages')]")).getText();
		//Fetching number of pages - Approach 1
		//String s="Showing 1 to 10 of 1984 (199 Pages)";
		String pages = s.split("\\(")[1];
		String pages1 = pages.split("\\ ")[0];
		System.out.println(pages1);
		
		//Approach 2
		System.out.println(s.substring(s.indexOf("(")+1, s.indexOf("Pages")-1));
		int total_pages = Integer.parseInt(s.substring(s.indexOf("(")+1, s.indexOf("Pages")-1));
		
		for(int p=1; p<=total_pages; p++) {
			if(p>1) {
				WebElement active_page = driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
				active_page.click();
			}
			
			//reading data from page
			int rows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//thead//tr")).size();
			
			for(int i=1; i<=rows; i++) {
				String customerName = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//thead//tr["+i+"]/th[2]")).getText();
				String customerEmail = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//thead//tr["+i+"]/th[3]")).getText();
				System.out.println(customerName+"\t"+customerEmail);
				
			}
		}
		
		
		
		
	}

}
