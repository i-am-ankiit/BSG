package Axis.BSG;


import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class table {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\ak398\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/tables");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		
		
		
		List <WebElement> rowno = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		int rowcount = rowno.size();
		System.out.println(rowcount);
		
		List <WebElement> colno = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]/td"));
		int colcount = colno.size();
		System.out.println(colcount);
		
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id = 'table1']/tbody/tr[4]/td[3]")));
		
		WebElement celldata = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[4]/td[3]"));
		
		System.out.println("Text in the cell: " + celldata.getText());
		
		
		
		
		
		
	}

}
