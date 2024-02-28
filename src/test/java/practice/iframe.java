package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\ak398\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/IFrame/index.html");
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='frame']"));
		driver.switchTo().frame(iframe);
		
		WebElement content = driver.findElement(By.xpath("//a[contains(text(),'Our Products')]"));
		content.click();

	}

}
