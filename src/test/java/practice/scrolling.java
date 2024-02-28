package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ak398\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://webdriveruniversity.com/Scrolling/index.html");
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		WebElement topSection = driver.findElement(By.id("zone1"));

		Actions actions = new Actions(driver);

        actions.moveToElement(topSection).perform();
        
        
		
		
	}

}
