package Axis.BSG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavCmd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ak398\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://automationexercise.com/");
		
		driver.navigate().forward();
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.navigate().refresh();

		

	}

}
