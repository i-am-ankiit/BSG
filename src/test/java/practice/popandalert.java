package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popandalert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ak398\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");
		driver.manage().window().maximize();
		
		WebElement alertButton = driver.findElement(By.id("button1"));
        alertButton.click();
        Thread.sleep(2000);
        
        Alert alt = driver.switchTo().alert();
		alt.accept();
		
		WebElement confirmationButton = driver.findElement(By.id("button4"));
        confirmationButton.click();
        Thread.sleep(2000);
        
        Alert alt1 = driver.switchTo().alert();
		alt1.dismiss();
		
		WebElement proalt = driver.findElement(By.id("button2"));
		proalt.click();
		Thread.sleep(500);
		
		
	}

}
