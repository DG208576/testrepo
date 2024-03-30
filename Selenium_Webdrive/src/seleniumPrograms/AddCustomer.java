package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Browser\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		long startTime = System.currentTimeMillis();
		//start watch	
		driver.navigate().to("https://demo.guru99.com/telecom/addcustomer.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/form/div/div[1]/label")).click();
		driver.findElement(By.id("fname")).sendKeys("Devanshi");
		driver.findElement(By.id("lname")).sendKeys("Gandhi");
		driver.findElement(By.id("email")).sendKeys("abc123@outlook.com");
		driver.findElement(By.name("addr")).sendKeys("dont give out your actual address");
		driver.findElement(By.id("telephoneno")).sendKeys("1234567");
		driver.findElement(By.name("submit")).click();
		String value=driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/table/tbody/tr[1]/td[2]/h3")).getText();
		System.out.println("The Customer ID is:"+value);
		
		driver.close();
		long endtime = System.currentTimeMillis();
		// stop time
		long responsetime = endtime - startTime;
		long sec = (responsetime/1000);
		
		System.out.print("Total Response Time:" + sec + "Seconds");
		
		
		
	
  }

}