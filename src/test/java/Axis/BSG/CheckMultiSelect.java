package Axis.BSG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckMultiSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\ak398\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		
		List <WebElement> allcheck = driver.findElements(By.xpath("//input[@type='checkbox']"));
		Thread.sleep(1000);
		
		for (WebElement wb : allcheck) {
			wb.click();
		}
	}

}
