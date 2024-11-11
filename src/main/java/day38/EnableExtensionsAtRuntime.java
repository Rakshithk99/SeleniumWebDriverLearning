package day38;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnableExtensionsAtRuntime {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File("C:\\Users\\rakk0001\\Downloads\\SelectorsHub-XPath-Helper-Chrome-Web-Store.crx"));
		
		
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demo.opencart.com/");
		System.out.println(driver.getTitle());

	}

}
