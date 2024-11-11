package day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php/");
		driver.manage().window().maximize();
		
		//single file upload
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\rakk0001\\Downloads\\storeJsonSchema.json");
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("storeJsonSchema.json"))
				System.out.println("File name is matching");
		else	System.out.println("File name is not matching");
		
		//Multiple files upload
		String file1 = "C:\\Users\\rakk0001\\Downloads\\storeJsonSchema.json";
		String file2 = "C:\\Users\\rakk0001\\Downloads\\storeJsonSchema - Copy.json";
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
		
		int noOfFiles = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		
		if(noOfFiles == 2) {
			System.out.println("All files are uploaded");
		} else System.out.println("Incorrect number of files uploaded");

		//To deisplay the uploaded file names
		for(WebElement ele:driver.findElements(By.xpath("//ul[@id='fileList']//li"))) {
			System.out.println(ele.getText());
		}
	}

}
