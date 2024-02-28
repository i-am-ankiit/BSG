package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class contact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ak398\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
		driver.manage().window().maximize();
		Thread.sleep(500);
		WebElement firstname = driver.findElement(By.xpath("//input[@name='first_name']"));

		Actions builder = new Actions(driver);

		Action seriesofele = builder.moveToElement(firstname).click().keyDown(firstname, Keys.SHIFT)
				.sendKeys(firstname, "ankit").build();
		seriesofele.perform();

		WebElement lastNameField = driver.findElement(By.xpath("//input[@name='last_name']"));
		lastNameField.sendKeys("Doe");

		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("ak@gmail.com");
		
		WebElement comments = driver.findElement(By.xpath("//textarea[@name='message']"));
		comments.sendKeys("Hii, I am Ankit");
		
		WebElement submitButton = driver.findElement(By.xpath("//input[@class=\"contact_button\"][2]"));
		submitButton.click();
	}

}
