package Axis.BSG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dateSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\ak398\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		WebElement Date = driver.findElement(By.xpath("//span[contains(text(),'Departure')]"));
		Thread.sleep(500);
		Date.click();
		
		WebElement NewDate = driver.findElement(By.xpath("//div[@aria-label='Tue Feb 27 2024']"));
		NewDate.click();
		
		
	}

}
