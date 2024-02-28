package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ak398\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		
		WebElement checkbox = driver.findElement(By.id("checkboxes"));

        if (!checkbox.isSelected()) {
            checkbox.click();
        }


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (checkbox.isSelected()) {
            checkbox.click();
        }

        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@value='option-2']"));
		Thread.sleep(500);
		
		if(checkbox2.isDisplayed()) {
			checkbox2.click();
		
	}

}
}
