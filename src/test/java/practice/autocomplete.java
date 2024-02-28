package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autocomplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ak398\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		WebElement txtField = driver.findElement(By.xpath("//input[@id ='myInput']"));
		txtField.sendKeys("app");
		Thread.sleep(500);
		
		WebElement SelectTone = driver.findElement(By.xpath("//strong[contains(text(),'App')]"));
		SelectTone.click();
		Thread.sleep(500);
		
		WebElement submit = driver.findElement(By.xpath("//input[@id ='submit-button']"));
		submit.click();
	}

}
