package day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//find total number of rows in a table
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();	//when there are multiple tables
		System.out.println("Number of rows:"+ rows);
		
		//approach 2
		System.out.println(driver.findElements(By.tagName("tr")).size());	//This works only when there is 1 table in the webpage
		
		
		//2)total number of columns in a table
		int columns = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("Number of columns:"+columns);
		
		//3) Read data from specific row and column (e.g.: 5th row and 1st column
		String val= driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]/td[1]")).getText();
		System.out.println(val);
		
		//4)Read data from all rows and columns
		for(int i=2; i<=rows; i++) {
			for(int j=1; j<=columns; j++) {
				String data = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+j+"]")).getText();
				System.out.print(data+" ");
			}
			System.out.println();
		}
		
		//5) Print book names whose author is Mukesh
		for(int i=2; i<=rows; i++) {
			String authorName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[2]")).getText();
			if(authorName.equals("Mukesh")) {
				String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[1]")).getText();
				System.out.println(bookName);
			}
		}
		
		//6) Find total price of all books
		int total=0;
		for(int r=2; r<=rows; r++) {
			int p=Integer.parseInt(driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText());
			total = total+p;
		}
		System.out.println("Total Price: "+total);
	}

}
