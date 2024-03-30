package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "Browser\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("Devanshi");
		driver.findElement(By.name("password")).sendKeys("Devanshi");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		//driver.close();
	}

}
