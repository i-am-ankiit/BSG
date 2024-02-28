package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ak398\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		 WebElement dropdown1 = driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
	        Select select1 = new Select(dropdown1);
	        select1.selectByVisibleText("Python");
	        
	        WebElement dropdown2 = driver.findElement(By.id("dropdowm-menu-2"));
	        Select select2 = new Select(dropdown2);
	        select2.selectByVisibleText("TestNG");  
	        
	        WebElement dropdown3 = driver.findElement(By.id("dropdowm-menu-3"));
	        Select select3 = new Select(dropdown3);
	        select3.selectByVisibleText("CSS");
	        
	        try {
	            Thread.sleep(2000); 
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	

}
}
