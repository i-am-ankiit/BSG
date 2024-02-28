package Axis.BSG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ak398\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
		
		WebElement radiobox2 = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		Thread.sleep(500);
		
		if(radiobox2.isDisplayed()) {
			radiobox2.click();
		}
		WebElement radiobox1 = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		Thread.sleep(500);
		
		if(radiobox1.isSelected()) {
			radiobox1.click();
		}
	}

}
