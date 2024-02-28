package Axis.BSG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ak398\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
		
		driver.switchTo().frame(iframe);
		WebElement content = driver.findElement(By.id("tinymce"));
		content.clear();
		content.sendKeys("hello world");
	}

}
