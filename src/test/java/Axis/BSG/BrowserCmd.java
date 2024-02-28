package Axis.BSG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCmd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\ak398\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://automationexercise.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String cururl = driver.getCurrentUrl();
		System.out.println(cururl);
		
		String pagesrc = driver.getPageSource();
		System.out.println(pagesrc);
		
		driver.close();
		
		
	}

}
