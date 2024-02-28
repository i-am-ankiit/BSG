package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ajaxLoader {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ak398\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Ajax-Loader/index.html");
		
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		driver.manage().timeouts().implicitlyWait(7000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//span[@type='button']")).click();
		
		
		Thread.sleep(3000);
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}

}
