package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButtons {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ak398\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		
		WebElement radiobox2 = driver.findElement(By.xpath("//input[@value='blue']"));
		Thread.sleep(500);
		
		if(radiobox2.isDisplayed()) {
			radiobox2.click();
		}
		WebElement radiobox1 = driver.findElement(By.xpath("//input[@value='green']"));
		Thread.sleep(500);
		
		if(radiobox1.isSelected()) {
			radiobox1.click();
		}

	}

}
