package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ak398\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/File-Upload/index.html");
		driver.manage().window().maximize();
		
		WebElement upload = driver.findElement(By.xpath("//input[@id='myFile']"));
		upload.sendKeys("C:\\Users\\ak398\\Downloads\\OrangeHRM_SRS.pdf");
		Thread.sleep(500);
		
		WebElement submit = driver.findElement(By.xpath("//input[@id='submit-button']"));
		submit.click();
		Thread.sleep(500);
	}

}
