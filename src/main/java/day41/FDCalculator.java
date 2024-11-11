package day41;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FDCalculator {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.moneycontrol.com/personal-finance/tools/emi-calculator.html");
		driver.manage().window().maximize();
		
		String filePath = System.getProperty("user.dir")+"\\TestData\\DataDrivenData.xlsx";
		
		int rows = ExcelUtils.getRowCount(filePath, "Sheet1");

		for(int i=1; i<=rows; i++) {
			//read data from excel
			String loanAmount = ExcelUtils.getCellData(filePath, "Sheet1", i, 0);
			String loanPeriod = ExcelUtils.getCellData(filePath, "Sheet1", i, 1);
			String upFrontCharges = ExcelUtils.getCellData(filePath, "Sheet1", i, 2);
			String interestRate = ExcelUtils.getCellData(filePath, "Sheet1", i, 3);
			String totalPayment = ExcelUtils.getCellData(filePath, "Sheet1", i, 4);
			
			//Pass above data to application
			driver.findElement(By.xpath("//input[@id='carhome_loan']")).clear();
			driver.findElement(By.xpath("//input[@id='carhome_loan']")).sendKeys(loanAmount);
			driver.findElement(By.xpath("//input[@id='loan_period']")).clear();
			driver.findElement(By.xpath("//input[@id='loan_period']")).sendKeys(loanPeriod);
			driver.findElement(By.xpath("//input[@id='upfront_charges']")).clear();
			driver.findElement(By.xpath("//input[@id='upfront_charges']")).sendKeys(upFrontCharges);
			driver.findElement(By.xpath("//input[@id='interest_rate']")).clear();
			driver.findElement(By.xpath("//input[@id='interest_rate']")).sendKeys(interestRate);
			driver.findElement(By.xpath("//a[normalize-space()='Submit']")).click();
			Thread.sleep(3000);
			String actualTotalPayment = driver.findElement(By.id("total_payment")).getText();
			
			String TP[] = actualTotalPayment.split(",");
			String actualTP="";
			for(String temp:TP) {
				actualTP=actualTP+temp;
			}
			
			String expectedTP[] = totalPayment.split(",");
			String expectedTP1 = "";
			for(String temp2: expectedTP) {
				expectedTP1+=temp2;
			}
			System.out.println("Actual TP:"+ actualTP);
			
			//validation and updating results to the excel sheet
			if(Double.parseDouble(expectedTP1)==Double.parseDouble(actualTP)) {
				ExcelUtils.setCellData(filePath, "Sheet1", i, 5, "Pass");
				ExcelUtils.fillGreenColor(filePath, "Sheet1", i, 5);
			} else {
				ExcelUtils.setCellData(filePath, "Sheet1", i, 5, "Fail");
				ExcelUtils.fillRedColor(filePath, "Sheet1", i, 5);
			}
		}
		driver.quit();
	}

}
