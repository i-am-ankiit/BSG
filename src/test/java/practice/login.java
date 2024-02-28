package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ak398\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://webdriveruniversity.com/Login-Portal/index.html?");
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		WebElement usernameField = driver.findElement(By.id("text"));
        usernameField.sendKeys("webdriver");
        
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("webdriver123");
        
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
        Thread.sleep(5000);
        
        Alert alt = driver.switchTo().alert();
		alt.accept();
        
		
		

	}

}
