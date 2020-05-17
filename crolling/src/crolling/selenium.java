package crolling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;



public class selenium {

	public static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdirver.chrome.driver", ".\\dirvers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		// open the web app
		driver.navigate().to("https://naver.com");
		driver.manage().window().maximize();
		
		
	}
}
