package googleMail;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locators implements Action{
	
	public WebDriver getWebDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sys-033\\eclipse-workspace\\SeleniumTutor\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		return driver;
	}
	
	public WebElement signIn(WebDriver driver, long sec) {
		// TODO Auto-generated method stub
		WebElement element = new WebDriverWait(driver, sec).until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@ga-event-action='sign in'])[2]")));
		return element;
	}
	
	public WebElement username(WebDriver driver, long sec) {
		// TODO Auto-generated method stub
		WebElement element = new WebDriverWait(driver, sec).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#identifierId")));
		return element;
	}
	
	public WebElement usernameClick(WebDriver driver, long sec) {
		// TODO Auto-generated method stub
		WebElement element = new WebDriverWait(driver, sec).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#identifierNext")));
		return element;
	}
	
	public WebElement password(WebDriver driver, long sec) {
		// TODO Auto-generated method stub
		WebElement element = new WebDriverWait(driver, sec).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")));
		return element;
	}
	
	public WebElement passwordClick(WebDriver driver, long sec) {
		// TODO Auto-generated method stub
		WebElement element = new WebDriverWait(driver, sec).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#passwordNext")));
		return element;
	}	
	
	String xpathRecoveryEmailClick = "//div[@class='vxx8jf'][text()='Confirm your recovery email']";
	public Boolean isExistsRecoveryEmailLink(WebDriver driver, long sec) {
		try {
			List<WebElement> elements = new WebDriverWait(driver, sec).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpathRecoveryEmailClick)));
			System.out.println("elements.size() : " + elements.size());
			if(elements.size() == 1)
				return true;
			else
				return false;
		} catch (Exception e) {
			System.out.println("Error");
			return false;
		}
	}
	
	public WebElement recoveryEmailClick(WebDriver driver, long sec) {
		// TODO Auto-generated method stub
		WebElement element = new WebDriverWait(driver, sec).until(ExpectedConditions.elementToBeClickable(By.xpath(xpathRecoveryEmailClick)));
		return element;
	}
	
	public WebElement recoveryEmail(WebDriver driver, long sec) {
		// TODO Auto-generated method stub
		WebElement element = new WebDriverWait(driver, sec).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"knowledge-preregistered-email-response\"]")));
		return element;
	}
	
	public WebElement recoveryNextClick(WebDriver driver, long sec) {
		// TODO Auto-generated method stub
		WebElement element = new WebDriverWait(driver, sec).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/div[2]")));
		return element;
	}
	
	public WebElement composeClick(WebDriver driver, long sec) {
		// TODO Auto-generated method stub
		WebElement element = new WebDriverWait(driver, sec).until(ExpectedConditions.elementToBeClickable(By.cssSelector(".aic div div")));
		return element;
	}
	
	public WebElement toMailAddress(WebDriver driver, long sec) {
		// TODO Auto-generated method stub
		WebElement element = new WebDriverWait(driver, sec).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@name='to'][@class='vO']")));
		return element;
	}
	
	public WebElement toSubject(WebDriver driver, long sec) {
		// TODO Auto-generated method stub
		WebElement element = new WebDriverWait(driver, sec).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='subjectbox'][@placeholder='Subject']")));
		return element;
	}
	
	public WebElement toMessage(WebDriver driver, long sec) {
		// TODO Auto-generated method stub
		WebElement element = new WebDriverWait(driver, sec).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".Am.Al.editable.LW-avf.tS-tW")));
		return element;
	}
	
	public WebElement sendClick(WebDriver driver, long sec) {
		// TODO Auto-generated method stub
		WebElement element = new WebDriverWait(driver, sec).until(ExpectedConditions.elementToBeClickable(By.cssSelector(".T-I.J-J5-Ji.aoO.v7.T-I-atl.L3")));
		return element;
	}
	
	public WebElement inboxClick(WebDriver driver, long sec) {
		// TODO Auto-generated method stub
		WebElement element = new WebDriverWait(driver, sec).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='J-Ke n0'][text()='Inbox']")));
		return element;
	}

	public void showInbox(WebDriver driver, long sec) {
		// TODO Auto-generated method stub
		List<WebElement> elements = new WebDriverWait(driver, sec).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[@class='bqe']")));
		for (WebElement webElement : elements) {
			if(webElement.getText().startsWith("test automation subject")) {
				System.out.println("Found : " + webElement.getText());
				//webElement.click();
			}
		}
	}
	
	public WebElement profileClick(WebDriver driver, long sec) {
		// TODO Auto-generated method stub
		WebElement element = new WebDriverWait(driver, sec).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='gb']/div[2]/div[3]/div[1]/div[2]/div/a")));
		return element;
	}
	
	public WebElement logoutClick(WebDriver driver, long sec) {
		// TODO Auto-generated method stub
		WebElement element = new WebDriverWait(driver, sec).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='gb_71']")));
		return element;
	}

	
	public WebElement attachementClick(WebDriver driver, long sec) {
		// TODO Auto-generated method stub
		WebElement element = new WebDriverWait(driver, sec).until(ExpectedConditions.elementToBeClickable(By.cssSelector(".a1.aaA.aMZ")));
		return element;
	}
	
	@Override
	public void navigateURL(WebDriver driver) {
		driver.navigate().to("https://www.google.com/gmail/about/#");		
	}
	
}
