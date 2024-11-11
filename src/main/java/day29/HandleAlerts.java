package day29;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet-herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();

		//Normal alert with OK button
		driver.findElement(By.xpath("asasas")).click();
		Thread.sleep(5000);
		Alert myAlert = driver.switchTo().alert();
		System.out.println(myAlert.getText());
		myAlert.accept();
		
		//Conformation Alert - OK and Cancel
		driver.findElement(By.xpath("fdfdf")).click();
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();	//This will close Alert using Ok button
		driver.switchTo().alert().dismiss();	//This will close Alert using Dismiss button
		
		//Prompt alert - Input field
		driver.findElement(By.xpath("grgrgrg")).click();
		Thread.sleep(5000);
		Alert myAlert2 = driver.switchTo().alert();
		myAlert2.sendKeys("Welcome");
		myAlert2.accept();
		
		
		
		
	}

}
