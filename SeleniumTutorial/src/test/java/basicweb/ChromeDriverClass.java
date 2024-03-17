package basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"/media/masud1901/CLASS & STUDY/My Learning Journey/Software Testing Practice/scraping with selenium/chromedriver-linux64/chromedriver");

		WebDriver driver = new ChromeDriver();

		String baseURLString = "https://www.letskodeit.com/practice";
		driver.get(baseURLString);

	}

}
