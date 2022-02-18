package class16_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Java\\Chromedrive\\chromedriver_win32\\chromedriver.exe");
		WebDriver website;
		website = new ChromeDriver();
		website.get("https://www.google.com/");
		website.manage().window().maximize();
		website.findElement(By.name("q")).sendKeys("camera");
		website.findElement(By.name("btnk")).click();
	}

}
