package Practice.Practice_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import bsh.Remote;

public class Launch_Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	WebDriverManager.chromeDriver().Setup();

//		RemoteWebDriver driver= new ChromeDriver();
		
//		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		System.out.println("Browser opened...");

	}

}
