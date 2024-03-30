package seleniumPrograms;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Browser\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.close();
		
	}
}
