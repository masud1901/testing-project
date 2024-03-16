package basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManager;

public class SeleniumManagerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String driverPathString = SeleniumManager.getInstance().getDriverPath("chromedriver", true);
		System.setProperty("webdriver.chrome.driver",
				"/media/masud1901/CLASS & STUDY/My Learning Journey/Software Testing Practice/scraping with selenium/chromedriver-linux64/chromedriver");

		WebDriver driver = new ChromeDriver();

		String baseURLString = "http://www.daraz.com.bd";
		driver.get(baseURLString);
		System.out.println(driver.getTitle());
//		System.out.println(driverPathString);
		driver.quit();

	}

}
