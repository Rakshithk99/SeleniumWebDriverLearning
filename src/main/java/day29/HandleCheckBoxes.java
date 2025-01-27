package day29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBoxes {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com");
	driver.manage().window().maximize();
	
	
	//1)select specific checkbox
	//driver.findElement(By.id("tuesday")).click();
	
	//2)select all checkboxes
	List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
	
	/*
	for(int i=0; i<checkboxes.size(); i++) {
		checkboxes.get(i).click();
	}
	*/
	//enhanced for loop
	/*
	for( WebElement checkbox:checkboxes) {
		checkbox.click();
	}
	*/
	//3)Select last 3 checkboxes	//7-3=4
	/*
	for(int i=4; i<checkboxes.size(); i++) {
		checkboxes.get(i).click();
	}
	*/
	//select first 3 checkboxes
	/*
	for(int i=0; i<checkboxes.size()-4;i++) {
		checkboxes.get(i).click();
	}
	*/
	//4) Unselect checkboxes
	for(int i=0; i<checkboxes.size()-4;i++) {
		checkboxes.get(i).click();
	}
	
	Thread.sleep(5000);
	for(int i=0; i<checkboxes.size();i++) {
		if(checkboxes.get(i).isSelected()) {
		checkboxes.get(i).click();
		}
	}
	
}
}
