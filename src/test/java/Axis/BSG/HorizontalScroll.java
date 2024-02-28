package Axis.BSG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class HorizontalScroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ak398\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1000)", "");
		 
		 js.executeScript("window.scrollBy(0,-400)", "");
		 Thread.sleep(500);
		 
		 js.executeScript("window.scrollBy(400,0)", "");
		 
		 js.executeScript("window.scrollBy(-200,0)", "");
		 
		 WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'Meta © 2024')]"));
	}

}
