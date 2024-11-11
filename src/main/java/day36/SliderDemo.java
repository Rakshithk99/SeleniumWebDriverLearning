package day36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();

		//Minimum Slider
		WebElement min_slider = driver.findElement(By.xpath("//span[starts-with(@class,'ui-slider-handle')][1]"));
		System.out.println("Location of min slider:"+min_slider.getLocation());	//(59,249)
		
		Actions act = new Actions(driver);
		act.dragAndDropBy(min_slider, 100, 249).perform();
		
		System.out.println("Location of min slider after dragging:"+min_slider.getLocation());	//(158, 249)
		
		
		//Maximum Slider
		WebElement max_slider = driver.findElement(By.xpath("//span[starts-with(@class,'ui-slider-handle')][2]"));
		System.out.println("Location of max slider:"+max_slider.getLocation());	//(510, 249)
		act.dragAndDropBy(max_slider, -50, 249).perform();
		System.out.println("Location of max slider after dragging:"+max_slider.getLocation());	//(460, 249)
		
		
	}

}
