package selenium;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenGoogle {

	public static void main(String[] args) {
		OpenGoogle t1= new OpenGoogle();
		//t1.Task1();
		//t1.Task2();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sys-033\\eclipse-workspace\\SeleniumTutor\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {

			t1.login(driver);

			for (int i = 0; i < 5; i++) {
				//t1.mailSendImplicity(driver, i+1);
				//Thread.sleep(3000);
				t1.mailSendExplicit(driver, i+1);
				
			}

			t1.findInbox(driver);
			t1.logout(driver);
		}
		catch (NoSuchElementException e) {			
			System.out.println(e.getMessage());
		}catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		finally {
			//driver.close();
			driver.quit();
		}
	}
	private void login(WebDriver driver) {
		try {


			driver.navigate().to("https://www.google.com/gmail/about/#");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//a[@ga-event-action='sign in'])[2]")).click();

			Set<String> windowHandlesNew = driver.getWindowHandles();
			for (String newWindow : windowHandlesNew) {
				driver.switchTo().window(newWindow);
			}

			driver.findElement(By.cssSelector("#identifierId")).sendKeys("demolink1984@gmail.com");
			driver.findElement(By.cssSelector("#identifierNext")).click();


			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys("Chennai1#");
			driver.findElement(By.cssSelector("#passwordNext")).click();

			//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		} catch (NoSuchElementException e) {			
			throw e;
		}
		catch(Exception e) {
			throw e;
		}

	}
	private void mailSendImplicity(WebDriver driver, int cnt) {
		// TODO Auto-generated method stub
		try {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//click Compose btn			
			driver.findElement(By.cssSelector(".aic div div")).click();

			//sendkey -> To
			driver.findElement(By.xpath("//textarea[@name='to'][@class='vO']")).sendKeys("demolink1984@gmail.com");

			//subject
			driver.findElement(By.xpath("//input[@name='subjectbox'][@placeholder='Subject']")).sendKeys("test automation subject : " + cnt);

			//message
			driver.findElement(By.cssSelector(".Am.Al.editable.LW-avf.tS-tW")).sendKeys("automation message : " + cnt);

			//send click
			driver.findElement(By.cssSelector(".T-I.J-J5-Ji.aoO.v7.T-I-atl.L3")).click();			
			

		} catch (NoSuchElementException e) {			
			throw e;
		} catch (Exception e) {
			throw e;
		}
	}
	private void mailSendExplicit(WebDriver driver, int cnt) throws Exception {
		// TODO Auto-generated method stub
		try {
			//click Compose btn
			WebDriverWait wt= new WebDriverWait(driver, 30);
			wt.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".aic div div"))).click();
			//wt.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".aic div div"))).click();
			//driver.findElement(By.cssSelector(".aic div div")).click();

			//sendkey -> To
			wt= new WebDriverWait(driver, 30);
			wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@name='to'][@class='vO']"))).sendKeys("demolink1984@gmail.com");
			//driver.findElement(By.xpath("//textarea[@name='to'][@class='vO']")).sendKeys("demolink1984@gmail.com");

			//subject
			wt= new WebDriverWait(driver, 30);
			wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='subjectbox'][@placeholder='Subject']"))).sendKeys("test automation subject : " + cnt);
			//driver.findElement(By.xpath("//input[@name='subjectbox'][@placeholder='Subject']")).sendKeys("test automation subject : " + cnt);

			//message
			wt= new WebDriverWait(driver, 30);
			wt.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".Am.Al.editable.LW-avf.tS-tW"))).sendKeys("test automation message : " + cnt);
			//driver.findElement(By.cssSelector(".Am.Al.editable.LW-avf.tS-tW")).sendKeys("automation message : " + cnt);

			//Robot Start
			System.out.println("Robot START");
			
			//click attachment icon
			//new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.cssSelector(".a1.aaA.aMZ"))).click();
			WebDriverWait wt1 = new WebDriverWait(driver, 30);
			WebElement ele = wt1.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".a1.aaA.aMZ")));
			ele.click();
			
			ClipboardOwner owner =null;
			String filePath = "C:\\Users\\sys-033\\Desktop\\MEETING URL.txt";
			
			Robot robot = new Robot();
			StringSelection attPath= new StringSelection(filePath);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(attPath, owner);
			
			robot.setAutoDelay(5000);System.out.println("5000 ms");
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			
			robot.setAutoDelay(5000);System.out.println("5000 ms");
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);			
			
			System.out.println("Robot END");
			//Robot End
			
			//Thread.sleep(5000);
			//send click
			//driver.findElement(By.cssSelector(".T-I.J-J5-Ji.aoO.v7.T-I-atl.L3")).click();			
			wt= new WebDriverWait(driver, 30);
			wt.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".T-I.J-J5-Ji.aoO.v7.T-I-atl.L3"))).click();
			
			Thread.sleep(1000);			

		} catch (NoSuchElementException e) {			
			throw e;
		} catch (Exception e) {
			throw e;
		}
	}
	private void findInbox(WebDriver driver) {
		// TODO Auto-generated method stub
		//click inbox
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='J-Ke n0'][text()='Inbox']"))).click();
		driver.navigate().refresh();
		
		List<WebElement> webElements = new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//span[@class='bqe']")));
		for (WebElement webElement : webElements) {
			if(webElement.getText().startsWith("test automation subject")) {
				System.out.println("Found : " + webElement.getText());
				//webElement.click();
			}
		}
	}
	private void logout(WebDriver driver) {
		// TODO Auto-generated method stub
		try {
			//click profile icon
			driver.findElement(By.xpath("//*[@id='gb']/div[2]/div[3]/div[1]/div[2]/div/a")).click();

			//Thread.sleep(3000);
			//logout click
			driver.findElement(By.xpath("//*[@id='gb_71']")).click();

		} catch (NoSuchElementException e) {			
			throw e;
		} catch(Exception e) {
			throw e;
		}
	}
	private void Task1() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sys-033\\eclipse-workspace\\\\SeleniumFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Thread.sleep(2000);

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
	private void Task2() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sys-033\\eclipse-workspace\\\\SeleniumFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//System.setProperty("webdriver.ie.driver", "C:\\Users\\sys-033\\eclipse-workspace\\\\SeleniumFiles\\IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();

		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\sys-033\\eclipse-workspace\\\\SeleniumFiles\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		driver.get("https://www.google.com/gmail/about/#");		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		String windowHandleCurrent = driver.getWindowHandle();
		WebElement findElementSign = driver.findElement(By.xpath("(//a[@ga-event-action='sign in'])[2]"));
		findElementSign.click();		
		Set<String> windowHandlesNew = driver.getWindowHandles();
		for (String newWindow : windowHandlesNew) {
			driver.switchTo().window(newWindow);
			System.out.println(driver.switchTo().window(newWindow).getTitle());
		}		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("demolink1984@gmail.com");
		driver.findElement(By.xpath("//*[@id='identifierNext']")).click();

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("Chennai1#");
		driver.findElement(By.xpath("//*[@id='passwordNext']")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		System.out.println("Browser Closed");
		Thread.sleep(20000);
		driver.quit();
	}
	private void Task3() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sys-033\\eclipse-workspace\\\\SeleniumFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {


			driver.navigate().to("https://www.google.com/gmail/about/#");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("(//a[@ga-event-action='sign in'])[2]")).click();

			Set<String> windowHandlesNew = driver.getWindowHandles();
			for (String newWindow : windowHandlesNew) {
				driver.switchTo().window(newWindow);
			}

			driver.findElement(By.cssSelector("#identifierId")).sendKeys("demolink1984@gmail.com");
			driver.findElement(By.cssSelector("#identifierNext")).click();


			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys("Chennai1#");
			driver.findElement(By.cssSelector("#passwordNext")).click();

			//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			//click Compose btn
			driver.findElement(By.cssSelector(".aic div div")).click();

			//sendkey -> To
			driver.findElement(By.xpath("//textarea[@id=\":9l\"]")).sendKeys("demolink1984@gmail.com");

			//subject
			driver.findElement(By.xpath("//input[@name='subjectbox'][@placeholder='Subject']")).sendKeys("test automation subject");

			//message
			driver.findElement(By.cssSelector(".Am.Al.editable.LW-avf.tS-tW")).sendKeys("automation message");

			//send click
			//driver.findElement(By.cssSelector(".T-I.J-J5-Ji.aoO.v7.T-I-atl.L3")).click();			
			WebDriverWait wt= new WebDriverWait(driver, 30);
			wt.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".T-I.J-J5-Ji.aoO.v7.T-I-atl.L3"))).click();
			/*
			//click profile icon
			driver.findElement(By.xpath("//*[@id='gb']/div[2]/div[3]/div[1]/div[2]/div/a")).click();

			Thread.sleep(3000);
			//logout click
			driver.findElement(By.xpath("//*[@id='gb_71']")).click();	
			 */
			System.out.println("Browser Closed");

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.out.println(e.getMessage());
			throw e;
		}
		catch(Exception e) {
			throw e;
		}
		finally {
			driver.close();
			driver.quit();
		}

	}

}
