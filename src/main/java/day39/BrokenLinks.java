package day39;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
public static void main(String[] args)   {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("http://www.deadlinkcity.com/");
	driver.manage().window().maximize();
	
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println("Number of Links:"+ links.size());
	
	int brokenlinks=0;
	for(WebElement link:links) {
		String hrefValue = link.getAttribute("href");
		if(hrefValue==null || hrefValue.isEmpty()) {
			System.out.println("href attribute value is null or empty. So not possible to check");
			continue;
		}
		
		//hit url to the server
		try {
			URL url = new URL(hrefValue);		//converted href value from string to URL format
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();		//open connection to the server
			conn.connect();		//connect to server and send request to server
			if(conn.getResponseCode()>=400) {
				System.out.println(hrefValue+": It is a broken link");
				brokenlinks++;
			} else {
				System.out.println(hrefValue+ ": It is not a broken link");
			}
		} catch (Exception e) {
			
		}
			
			
	}
	System.out.println("No. of broken links: "+ brokenlinks);
	
}
}
