package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogleWithFirefox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sys-033\\eclipse-workspace\\\\SeleniumFiles\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.icicibank.com/");

		driver.manage().window().maximize(); Thread.sleep(1000);

		driver.navigate().to("https://www.syndicatebank.in/"); Thread.sleep(1000);

		driver.navigate().back(); Thread.sleep(1000);

		driver.navigate().forward(); Thread.sleep(1000);

		driver.navigate().refresh();

		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		driver.navigate().to("https://in.godaddy.com/"); Thread.sleep(1000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		driver.quit();
	}

}
