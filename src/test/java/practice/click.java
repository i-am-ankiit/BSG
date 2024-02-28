package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class click {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ak398\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://webdriveruniversity.com/Click-Buttons/index.html");
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		 List<WebElement> buttons = driver.findElements(By.xpath("//span[@type='button']"));

	        
	        for (WebElement button : buttons) {
	            
	            button.click();

	            
	            try {
	                Thread.sleep(2000);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }

	            
	        }
		
		
	}

}
