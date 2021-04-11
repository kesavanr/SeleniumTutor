package selenium;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.DriverAction;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
//import java.util.function.Function;
import java.util.logging.FileHandler;

import javax.imageio.ImageIO;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;
import com.google.common.collect.FluentIterable;

public class Launch {
	static WebElement q;

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		// TODO Auto-generated method stub
		Launch l1= new Launch();
		//l1.launchChromeDriver();
		//l1.launchInternetExplorerDriver();
		//l1.launchFirefoxDriver();

		//l1.LaunchFacebook();
		//l1.launchRedBus();
		//l1.launchGoogleSearch();
		//l1.launchICICI();
		//l1.launchHDFC();
		//l1.launchSwiggy();
		//l1.launchSnapDeal();
		//l1.launchAlert(); // demo for alert and screenshot

		//l1.demoListBox();
		//l1.demoWindowHandling();
		//l1.demoAlert();
		//l1.launchIframe();
		//l1.dragAndDrop();
		//l1.toolTip();
		//l1.selectable();
		//l1.autoComplete();
		//l1.downloadFiles();
		//l1.uploadFiles();
		//l1.handlesImages();
		//l1.hyperLinks();
		//l1.calender();
		//l1.sortable();
		//l1.ButtonHandling();
		//l1.TableHandling1();

		//l1.launchRobot();

		//l1.reloadPage();
		//l1.fullSCreen();
		//l1.AuthenticationPopup();
		//l1.printGoogleSugg();
		//l1.printGoogleSearch();
		//l1.printGoogleSearchURL();
		//l1.TableHandling();
		l1.amazonNewTabWindowsHandling();
		//l1.iframeHandle();
		//l1.googleSearchEnter();
		//l1.sendKeysWithoutFindElement();
		//l1.pageScroll();
		//l1.checkElementUndeline();
		//l1.keyInputWithoutSendKeys();
		//l1.checlAllCheckbox();
		//l1.demoTest();
		//l1.demoPojo();
		//l1.demoIterator();
		l1.demoAxes();
		//l1.demoFindElement();
		//l1.removeSpecialChar();
		//l1.tableDemo();
		//l1.webTable();
	}

	private void launchChromeDriver() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\TG\\AdactinCucumber\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");		
		Thread.sleep(2000); 

		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000); 

		driver.navigate().to("https://www.amazon.in");
		Thread.sleep(2000);

		driver.navigate().to("http://greenstech.in/selenium-course-content.html");
		Thread.sleep(2000);

		driver.navigate().to("http://gmail.com/");
		Thread.sleep(2000);

		driver.navigate().to("http://www.flipkart.com/");
		Thread.sleep(2000);

		driver.navigate().to("http://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);

		driver.navigate().to("https://www.facebook.com//login"); 
		Thread.sleep(2000);

		driver.quit();		
	}

	private void launchInternetExplorerDriver() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "D:\\TG\\AdactinCucumber\\drivers\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.greenstechnologys.com/");		
		Thread.sleep(2000); 

		//driver.navigate().to("https://www.facebook.com/");
		//Thread.sleep(2000); 

		driver.navigate().to("https://www.amazon.in");
		Thread.sleep(2000);

		driver.navigate().to("http://greenstech.in/selenium-course-content.html");
		Thread.sleep(2000);

		driver.navigate().to("http://gmail.com/");
		Thread.sleep(2000);

		driver.navigate().to("http://www.flipkart.com/");
		Thread.sleep(2000);

		driver.navigate().to("http://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);

		driver.navigate().to("https://www.facebook.com//login"); 
		Thread.sleep(2000);

		driver.quit();
	}

	private void launchFirefoxDriver() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\TG\\AdactinCucumber\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.greenstechnologys.com/");		
		Thread.sleep(2000); 

		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000); 

		driver.navigate().to("https://www.amazon.in");
		Thread.sleep(2000);

		driver.navigate().to("http://greenstech.in/selenium-course-content.html");
		Thread.sleep(2000);

		driver.navigate().to("http://gmail.com/");
		Thread.sleep(2000);

		driver.navigate().to("http://www.flipkart.com/");
		Thread.sleep(2000);

		driver.navigate().to("http://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);

		driver.navigate().to("https://www.facebook.com//login"); 
		Thread.sleep(2000);

		driver.quit();
	}

	private void LaunchFacebook() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\TG\\AdactinCucumber\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login");

		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email']"))).sendKeys("kesavanr.gopal@gmail.com");;
		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='pass']"))).sendKeys("123456");
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='loginbutton']"))).click();

		Thread.sleep(5000);

		driver.quit();
	}

	private void launchRedBus() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\TG\\AdactinCucumber\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");

		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='src']"))).sendKeys("Dindigul");
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@data-no='1'][@data-id='229']"))).click();

		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='dest']"))).sendKeys("Chennai");
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@data-no='1'][@data-id='123']"))).click();

		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='onward_cal']"))).click();
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='rb-calendar_onward_cal']/table/tbody/tr[6]/td[3]"))).click();

		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='search_btn']"))).click();

		Thread.sleep(10000);

		driver.quit();
	}

	private void launchGoogleSearch() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\sys-033\\\\eclipse-workspace\\\\SeleniumTutor\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");

		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='gLFyf gsfi']"))).sendKeys("Greens Technology");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(10000);

		driver.quit();
	}

	private void launchICICI() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\TG\\AdactinCucumber\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		driver.manage().window().fullscreen();

		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='login-input mode-select-userid']"))).click();
		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='login-input type_UserPrincipal']"))).sendKeys("abcdefgh");

		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='login-input-password']"))).sendKeys("123456");
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='cta']"))).click();

		Thread.sleep(5000);
		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Log Out']"))).click();
		driver.quit();
	}

	private void launchHDFC() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\TG\\AdactinCucumber\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/");
		driver.switchTo().frame("login_page");

		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".input_password"))).sendKeys("kesavanr");
		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@onclick='return fLogon();']"))).click();		
		System.out.println("here 1");

		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='fldPassword']"))).sendKeys("1234");		
		System.out.println("here 2");

		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@onclick='return fLogon();']"))).click();
		Thread.sleep(5000);
		driver.quit();
	}

	private void launchSwiggy() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\TG\\AdactinCucumber\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");

		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='location']"))).sendKeys("Dindigul");
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='_3lmRa'][@tabindex='5']"))).click();

		Thread.sleep(5000);
		driver.quit();
	}

	private void launchSnapDeal() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\TG\\AdactinCucumber\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/login");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.id("userName")).sendKeys("kesavanr.gopal@gmail.com");
		driver.findElement(By.id("checkUser")).click();

		driver.findElement(By.id("j_number")).sendKeys("9043180783");
		driver.findElement(By.id("j_name")).sendKeys("KESAVAN R");

		driver.findElement(By.id("j_dob")).sendKeys("09/04/1984");
		//driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr[2]/th[2]")).click();
		driver.findElement(By.id("j_password")).sendKeys("");
		driver.findElement(By.id("userSignup")).click();

		Thread.sleep(5000);
		driver.quit();
	}

	private void launchAlert() throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\TG\\AdactinCucumber\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//Simple Alert
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();

		//Alert alertSimple = driver.switchTo().alert();
		Alert alertSimple = SwitchToAlert(driver); //Thread.sleep(2000);

		System.out.println("Simple Alert : " + alertSimple.getText());	 	
		createScreenCaptureRobot("Full1.png"); //Take Screenshot
		Thread.sleep(2000);
		alertSimple.accept();
		/*
		//Take Screenshot	 	
		//TakesScreenshot tss = (TakesScreenshot) driver;
	 	//File srcFile = tss.getScreenshotAs(OutputType.FILE);
	 	//File destFile = new File("C:\\Users\\sys-033\\eclipse-workspace\\SeleniumTutor\\Screenshot\\1.png");
	 	//FileUtils.copyFile(srcFile, destFile);	
	 	//Thread.sleep(2000);

		//---------------------------------------------------------------

		//Confirm Alert
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		driver.findElement(By.xpath("//div[@id='CancelTab']/button")).click();

		//Alert confirmAlert = driver.switchTo().alert();Thread.sleep(2000);
		Alert confirmAlert = SwitchToAlert(driver); //Thread.sleep(2000);
		System.out.println("Confirm Alert : " + confirmAlert.getText());
		createScreenCaptureRobot("Full2.png"); //Take Screenshot
		Thread.sleep(2000);
		confirmAlert.accept();
		System.out.println("2. " + driver.findElement(By.id("demo")).getText());

		//tss = (TakesScreenshot) driver;
	 	//srcFile = tss.getScreenshotAs(OutputType.FILE);
	 	//destFile = new File("C:\\Users\\sys-033\\eclipse-workspace\\SeleniumTutor\\Screenshot\\2.png");
	 	//FileUtils.copyFile(srcFile, destFile);	
	 	//Thread.sleep(2000);

		//---------------------------------------------------------------

		//Prompt Alert
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'prompt box ')]")).click();

		//Alert promptAlert = driver.switchTo().alert();Thread.sleep(2000);
		Alert promptAlert = SwitchToAlert(driver);
		promptAlert.sendKeys("rrrrrrrr here ttttttttttttt");
		System.out.println("Prompt Alert : " + promptAlert.getText());
		createScreenCaptureRobot("Full3.png"); //Take Screenshot	 	
		//Thread.sleep(5000);
		promptAlert.accept();
		System.out.println("3. " + driver.findElement(By.id("demo1")).getText());

		//Take Screenshot
		//tss = (TakesScreenshot) driver;
	 	//srcFile = tss.getScreenshotAs(OutputType.FILE);
	 	//destFile = new File("C:\\Users\\sys-033\\eclipse-workspace\\SeleniumTutor\\Screenshot\\3.png");
	 	//FileUtils.copyFile(srcFile, destFile);
		 */
		driver.quit();
	}

	public static Alert SwitchToAlert(WebDriver driver) {
		WebDriverWait wt = new WebDriverWait(driver, 10);
		wt.until(ExpectedConditions.alertIsPresent());	

		return driver.switchTo().alert();
	}

	private void createScreenCaptureRobot(String filename) throws AWTException, IOException {			
		Robot robot = new Robot();
		Dimension Dim = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle = new Rectangle(Dim);
		BufferedImage sourcFile = robot.createScreenCapture(rectangle);
		File destinationFile = new File("C:\\Users\\sys-033\\eclipse-workspace\\SeleniumTutor\\Screenshot\\" + filename);
		ImageIO.write(sourcFile, "png", destinationFile);	
		//Thread.sleep(2000);
	}

	private void demoListBox() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sys-033\\eclipse-workspace\\SeleniumTutor\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");

		driver.findElement(By.id("dropdown1")).sendKeys("u");
		//Select selectDD1 = new Select(driver.findElement(By.id("dropdown1")));
		//selectDD1.selectByIndex(1);

		/*Select selectDD2 = new Select(driver.findElement(By.name("dropdown2")));
		selectDD2.selectByVisibleText("Appium");

		Select selectDD3 = new Select(driver.findElement(By.id("dropdown3")));
		selectDD3.selectByValue("2");

		System.out.println("------------Get the number of dropdown options");
		List<WebElement> options = new Select(driver.findElement(By.xpath("//select[@class='dropdown']"))).getOptions();
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
		}

		System.out.println("------------Select your programs");
		Select selectDD5 = new Select(driver.findElement(By.xpath("//div[@id='contentblock']/section/div[6]/select")));
		if(selectDD5.isMultiple()) {
			selectDD5.deselectAll();
			selectDD5.selectByValue("1");
			selectDD5.selectByValue("2");
			selectDD5.selectByValue("4");
			System.out.println("------------getAllSelectedOptions");
			List<WebElement> allSelectedOptions = selectDD5.getAllSelectedOptions();
			for (WebElement webElement : allSelectedOptions) {
				System.out.println(webElement.getText());
			}		
			System.out.println("getFirstSelectedOption : " + selectDD5.getFirstSelectedOption().getText());
			System.out.println("------------get All Options");
			List<WebElement> options2 = selectDD5.getOptions();
			for (WebElement webElement : options2) {
				System.out.println(webElement.getText());	
			}
			selectDD5.deselectByValue("0");
			System.out.println("------------getAllSelectedOptions after deselect");
			List<WebElement> allSelectedOptions1 = selectDD5.getAllSelectedOptions();
			for (WebElement webElement : allSelectedOptions1) {
				System.out.println(webElement.getText());
			}	
		}
		else
		{
			System.out.println("Not multiple selection list");
		}*/

		driver.quit();
	}

	private void demoWindowHandling() {
		System.setProperty("webdriver.chrome.driver", "D:\\TG\\AdactinCucumber\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");

		String parentWindowHandle = driver.getWindowHandle();
		driver.findElement(By.id("home")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String wind : windowHandles) {
			driver.switchTo().window(wind);
		}
		driver.findElement(By.xpath("//a[@href=\"pages/Edit.html\"]")).click();

		driver.close();
		driver.switchTo().window(parentWindowHandle);

		//-----------------

		driver.findElement(By.xpath("//button[@onclick='openWindows()']")).click();
		System.out.println("Cnt : " + driver.getWindowHandles().size());
		//-----------------

		for (String wind : driver.getWindowHandles()) {
			System.out.println("here");
			if(!wind.equals(parentWindowHandle)) {
				driver.switchTo().window(wind);
				driver.close();
			}
		}

		driver.switchTo().window(parentWindowHandle);

		WebElement dontclose = driver.findElement(By.xpath("//button[contains(text(),'Do not cl')]"));
		String cssValue = dontclose.getCssValue("background-color");
		System.out.println("color : " + cssValue);
	}

	private void demoAlert() throws InterruptedException, IOException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\TG\\AdactinCucumber\\drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		driver.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
		Alert  sAlert = driver.switchTo().alert();
		Thread.sleep(2000);
		fullScreenshot("simpleAlert.png");
		System.out.println(sAlert.getText());
		//normalScreeShot
		Thread.sleep(2000);
		sAlert.accept();
		//normalScreeShot(driver,"simpleAlert.png");		
		System.out.println("------------------------------");

		driver.findElement(By.xpath("//button[@onclick='confirmAlert()']")).click();
		Alert alertConfirmOk = driver.switchTo().alert();
		Thread.sleep(2000);
		fullScreenshot("alertConfirmOk.png");
		System.out.println(alertConfirmOk.getText());
		Thread.sleep(2000);				
		alertConfirmOk.accept();
		System.out.println("Confirm Alert Ok Result : " + driver.findElement(By.id("result")).getText());
		//normalScreeShot(driver, "alertConfirmOk.png");		
		driver.findElement(By.xpath("//button[@onclick='confirmAlert()']")).click();
		Alert alertConfirmCancel = driver.switchTo().alert();
		Thread.sleep(2000);
		fullScreenshot("alertConfirmCancel.png");
		System.out.println(alertConfirmCancel.getText());
		Thread.sleep(2000);		
		alertConfirmCancel.accept();
		System.out.println("Confirm Alert Cancel Result : " + driver.findElement(By.id("result")).getText());
		//normalScreeShot(driver, "alertConfirmCancel.png");		
		System.out.println("------------------------------");

		driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']")).click();
		Alert alertPromptOk = driver.switchTo().alert();
		Thread.sleep(2000);
		alertPromptOk.sendKeys("infotech");
		fullScreenshot("alertPromptOk.png");
		System.out.println(alertPromptOk.getText());
		Thread.sleep(2000);		
		alertPromptOk.accept();
		//normalScreeShot(driver, "alertPromptOk.png");
		System.out.println(driver.findElement(By.id("result1")).getText());
		driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']")).click();
		Alert alertPromptCancel = driver.switchTo().alert();
		Thread.sleep(2000);
		fullScreenshot("alertPromptCancel.png");
		System.out.println(alertPromptCancel.getText());
		Thread.sleep(2000);		
		alertPromptCancel.dismiss();
		//normalScreeShot(driver, "alertPromptCancel.png");
		System.out.println(driver.findElement(By.id("result1")).getText());
		System.out.println("------------------------------");

		driver.findElement(By.xpath("//button[@onclick='lineBreaks()']")).click();
		Alert alertLineBreak = driver.switchTo().alert();
		System.out.println(alertLineBreak.getText());
		Thread.sleep(2000);
		fullScreenshot("lineBreaks.png");
		alertLineBreak.accept();

		driver.findElement(By.xpath("//button[@onclick='sweetalert()']")).click();		
		Thread.sleep(2000);
		fullScreenshot("sweetalert.png");
		driver.findElement(By.xpath("//button[@class='swal-button swal-button--confirm']")).click();

		driver.quit();
	}

	private void normalScreeShot(WebDriver driver, String simpleAlert) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\sys-033\\eclipse-workspace\\SeleniumTutor\\Screenshot\\" + simpleAlert);
		//org.openqa.selenium.io.FileHandler.copy(src, dest);
		FileUtils.copyFile(src, dest);
	}

	private void fullScreenshot(String fullSS) throws AWTException, IOException {
		Robot robot = new Robot();
		Dimension Dim = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rec = new Rectangle(Dim);
		BufferedImage src = robot.createScreenCapture(rec);
		File dest = new File("C:\\Users\\sys-033\\eclipse-workspace\\SeleniumTutor\\Screenshot\\" + fullSS);
		ImageIO.write(src, "png", dest);
	}

	private void launchIframe() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\TG\\AdactinCucumber\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");

		driver.switchTo().frame(0);
		WebElement fFrame = driver.findElement(By.id("Click"));
		fFrame.click();
		System.out.println(fFrame.getText());

		driver.switchTo().defaultContent();

		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2"); //driver.switchTo().frame(0);

		WebElement fFrame1 = driver.findElement(By.id("Click1"));
		fFrame1.click();
		System.out.println("Nested Frames : " + fFrame1.getText());

		driver.switchTo().defaultContent();

		List<WebElement> findIframes = driver.findElements(By.tagName("iframe"));
		System.out.println("Total Frames : " + findIframes.size());

		driver.switchTo().frame(2);
		driver.switchTo().frame(0);
		System.out.println(driver.findElement(By.tagName("body")).getText());

		driver.switchTo().defaultContent();

		Thread.sleep(3000);
		driver.quit();
	}
	private void dragAndDrop() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\TG\\AdactinCucumber\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/drop.html");

		WebElement src = driver.findElement(By.id("draggable"));
		WebElement dest = driver.findElement(By.id("droppable"));

		Actions act = new Actions(driver);
		//act.clickAndHold(src).dragAndDrop(src, dest).release(dest).build().perform();
		//act.clickAndHold(src).moveToElement(dest).release(dest).build().perform();
		act.dragAndDrop(src, dest).build().perform();
		Thread.sleep(5000);
		driver.quit();

	}
	private void toolTip() throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "D:\\TG\\AdactinCucumber\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/tooltip.html");

		System.out.println(driver.findElement(By.id("age")).getAttribute("title"));

		Thread.sleep(5000);
		driver.quit();

	}

	private void selectable() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\TG\\AdactinCucumber\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/selectable.html");

		List<WebElement> lst = driver.findElements(By.xpath("//*[@id='selectable']/li"));
		Actions acts=new Actions(driver);
		/*acts.keyDown(Keys.CONTROL)
			.click(lst.get(0))
			.click(lst.get(1))
			.click(lst.get(5))
			.build().perform();*/
		acts.clickAndHold(lst.get(0))
		.clickAndHold(lst.get(5))
		.build().perform();

		Thread.sleep(5000);
		driver.quit();

	}

	private void autoComplete() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\TG\\AdactinCucumber\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/autoComplete.html");

		WebElement tags = driver.findElement(By.id("tags"));
		tags.sendKeys("s");
		//List<WebElement> lst = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		List<WebElement> lst = new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@id='ui-id-1']/li")));
		System.out.println(lst.size());
		for (WebElement el : lst) {
			if(el.getText().equalsIgnoreCase("soap")) {
				el.click();
				Thread.sleep(5000);
				break;
			}
		}


		driver.quit();
	}
	private void downloadFiles() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\TG\\AdactinCucumber\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/download.html");

		driver.findElement(By.linkText("Download Excel")).click();
		Thread.sleep(5000);
		File fileLocat = new File("C:\\Users\\sys-033\\Downloads\\testleaf.xlsx");
		if(fileLocat.exists()) {
			System.out.println("xlsx found");
		}
		else {
			System.out.println("xlsx not found");
		}
		//--------------------------------

		driver.findElement(By.linkText("Download PDF")).click();
		Thread.sleep(5000);
		fileLocat = new File("C:\\Users\\sys-033\\Downloads\\testleaf.pdf");
		if(fileLocat.exists()) {
			System.out.println("pdf found");
		}
		else {
			System.out.println("pdf not found");
		}
		//--------------------------------

		driver.findElement(By.linkText("Download Text")).click();
		Thread.sleep(5000);
		fileLocat = new File("C:\\Users\\sys-033\\Downloads\\testleaf.txt");
		if(fileLocat.exists()) {
			System.out.println("txt found");
		}
		else {
			System.out.println("txt not found");
		}
		//--------------------------------

		/*File fileLocat1 = new File("C:\\Users\\sys-033\\Downloads\\");
		File[] listFiles = fileLocat1.listFiles();
		for (File file : listFiles) {
			if(file.getName().equals("testleaf.xlsx")) {
				System.out.println("Found");break;
			}
		}*/
		driver.quit();
	}
	private void uploadFiles() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\TG\\AdactinCucumber\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/upload.html");

		WebElement findElement = driver.findElement(By.xpath("//input[@type='file']"));
		//WebElement findElement = driver.findElement(By.name("filename"));
		System.out.println(findElement.getAttribute("name"));
		findElement.click();

		/*String path="C:\\Users\\sys-033\\Downloads\\testleaf.xlsx";
		StringSelection sel=new StringSelection(path);
		ClipboardOwner owner=null;

		Thread.sleep(5000);
		Robot robot=new Robot();
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, owner);
		robot.keyPress(KeyEvent.VK_CONTROL);robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V); robot.keyPress(KeyEvent.VK_CONTROL);

		robot.keyPress(KeyEvent.VK_ENTER);robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(10000);*/
		driver.quit();
	}
	private void handlesImages() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\TG\\AdactinCucumber\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");

		WebElement fEle = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/img"));
		if(fEle.getAttribute("naturalWidth").equals("0"))
			System.out.println("1. Broken image");
		else
			System.out.println("1. Broken image");

		WebElement sEle = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/img"));
		String attribute = sEle.getAttribute("naturalWidth");
		if(attribute.equals("0")) {
			System.out.println("2. Broken image");
		}
		else
			System.out.println("2. Not broken image");

		WebElement tEle = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/img"));
		String attribute3 = tEle.getAttribute("naturalWidth");
		if(attribute3.equals("0")) {
			System.out.println("3. Broken image");
		}
		else
			System.out.println("3. Not broken image");

		WebElement tEle1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/img"));
		Actions acts=new Actions(driver);
		acts.click(tEle1).build().perform();

		//Thread.sleep(5000);
		//driver.quit();
	}

	private void hyperLinks() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\TG\\AdactinCucumber\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://leafground.com/pages/Link.html");

		driver.findElement(By.linkText("Go to Home Page")).click();		
		Thread.sleep(2000);

		driver.navigate().back();
		String attribute = driver.findElement(By.partialLinkText("Find where am supposed")).getAttribute("href");
		System.out.println("href : " + attribute);

		driver.findElement(By.linkText("Verify am I broken?")).click();
		if(driver.getTitle().contains("404")) {
			System.out.println("Broken link");
			Thread.sleep(2000);
			driver.navigate().back();
		}

		driver.findElement(By.linkText("Go to Home Page")).click();
		Thread.sleep(2000);
		driver.navigate().back();

		System.out.println("Total links : " + driver.findElements(By.tagName("a")).size());
		Thread.sleep(2000);

		driver.quit();
	}
	private void calender() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\TG\\AdactinCucumber\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://leafground.com/pages/Calendar.html");

		driver.manage().window().fullscreen();
		WebElement cale = driver.findElement(By.id("datepicker"));
		cale.sendKeys("11/10/2020" + Keys.ENTER);

		Thread.sleep(2000);
		cale.clear();
		Thread.sleep(2000);

		driver.findElement(By.id("datepicker")).click();
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		driver.findElement(By.xpath("//*[text()='20']")).click();

		Thread.sleep(2000);

		driver.quit();
	}
	private void sortable() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\TG\\AdactinCucumber\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://leafground.com/pages/sortable.html");

		//driver.manage().window().fullscreen();
		List<WebElement> lst = driver.findElements(By.xpath("//ul[@id='sortable']/li"));

		Actions acts=new Actions(driver);
		Thread.sleep(2000);
		acts.clickAndHold(lst.get(6)).moveToElement(lst.get(0)).release(lst.get(0)).build().perform();
		Thread.sleep(2000);	
		acts.clickAndHold(lst.get(5)).moveToElement(lst.get(0)).release(lst.get(0)).build().perform();
		Thread.sleep(2000);	
		acts.clickAndHold(lst.get(4)).moveToElement(lst.get(0)).release(lst.get(0)).build().perform();
		Thread.sleep(2000);	
		acts.clickAndHold(lst.get(3)).moveToElement(lst.get(0)).release(lst.get(0)).build().perform();
		Thread.sleep(2000);	
		acts.clickAndHold(lst.get(2)).moveToElement(lst.get(0)).release(lst.get(0)).build().perform();
		Thread.sleep(2000);	
		acts.clickAndHold(lst.get(1)).moveToElement(lst.get(0)).release(lst.get(0)).build().perform();

		Thread.sleep(5000);		
		driver.quit();
	}
	private void ButtonHandling() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\TG\\AdactinCucumber\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");

		WebElement findPosition = driver.findElement(By.id("position"));
		org.openqa.selenium.Point p = findPosition.getLocation();
		System.out.println("X :" + p.getX() + "\nY : " + p.getY());

		WebElement color = driver.findElement(By.id("color"));
		System.out.println(color.getCssValue("background-color"));

		WebElement size = driver.findElement(By.id("size"));
		System.out.println("Width : " + size.getSize().getWidth() + "\nHeight : " + size.getSize().getHeight());

		Thread.sleep(5000);		
		driver.quit();
	}
	private void TableHandling1() throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "D:\\TG\\AdactinCucumber\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/table.html");

		int rows = driver.findElements(By.xpath("//table[@id='table_id']/tbody/tr")).size();
		System.out.println("Total rows is : " + rows);

		int cols = driver.findElements(By.xpath("//table[@id='table_id']/tbody/tr/th")).size();
		System.out.println("Total Columns is : " + cols);

		//(//td[normalize-space()='Learn to interact with Elements']/following-sibling::td)[1]
		WebElement ThirdQuest = driver.findElement(By.xpath("(//td[text()='Learn to interact with Elements']/following-sibling::td)[1]"));
		System.out.println("Progress value of \"Learn to interact with Elements\" is : " + ThirdQuest.getText());

		List<Integer> progressValue = new ArrayList<>();

		List<WebElement> rowsList = driver.findElements(By.xpath("//table[@id='table_id']/tbody/tr"));
		for (int i = 2; i <= rowsList.size(); i++) {
			WebElement progressValueElement = driver.findElement(By.xpath("//table[@id='table_id']/tbody/tr[" + i + "]/td[2]"));
			//System.out.println(progressValueElement.getText().replace("%", ""));
			progressValue.add(Integer.parseInt(progressValueElement.getText().replace("%", "")));
		}

		System.out.println(progressValue);

		Integer minProgressValue = Collections.min(progressValue);
		System.out.println(minProgressValue);
		String minProgressString = minProgressValue.toString() + "%";
		String xPath="//td[text()='" + minProgressString + "']/following-sibling::td/input";
		System.out.println(xPath);
		WebElement chkTsk = driver.findElement(By.xpath(xPath));
		chkTsk.click();

		Thread.sleep(2000);		
		driver.quit();
	}
	private void TableHandling2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\TG\\AdactinCucumber\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/table.html");

		int rows = driver.findElements(By.xpath("//table[@id='table_id']/tbody/tr")).size();
		System.out.println("Total rows is : " + rows);

		int cols = driver.findElements(By.xpath("//table[@id='table_id']/tbody/tr/th")).size();
		System.out.println("Total Columns is : " + cols);

		WebElement ThirdQuest = driver.findElement(By.xpath("(//td[text()='Learn to interact with Elements']/following-sibling::td)[1]"));
		System.out.println("Progress value of \"Learn to interact with Elements\" is : " + ThirdQuest.getText());

		Integer smallVal = 0;
		List<WebElement> rowsList = driver.findElements(By.xpath("//table[@id='table_id']/tbody/tr/following-sibling::tr"));
		System.out.println(rowsList.size());
		for (int i = 2; i <= rowsList.size(); i++) {
			for (int j = i+1; j <= rowsList.size(); j++) {
				WebElement ele1 = driver.findElement(By.xpath("//table[@id='table_id']/tbody/tr[" + i + "]/td[2]"));
				WebElement ele2 = driver.findElement(By.xpath("//table[@id='table_id']/tbody/tr[" + j + "]/td[2]"));

				int pr1 = Integer.parseInt(ele1.getText().replace("%", ""));
				int pr2 = Integer.parseInt(ele2.getText().replace("%", ""));

				if(pr1 > pr2)
					smallVal = pr2;
				else
					smallVal = pr1;

			}
		}
		System.out.println(smallVal);

		String minProgressString = smallVal.toString() + "%";
		String xPath="//td[text()='" + minProgressString + "']/following-sibling::td/input";
		System.out.println(xPath);
		WebElement chkTsk = driver.findElement(By.xpath(xPath));
		chkTsk.click();

		Thread.sleep(2000);		
		driver.quit();
	}

	/*private void launchRobot() throws InterruptedException, AWTException {
		WebDriver driver = GetDriver.getDriver();
		GetDriver.getURL("https://www.google.co.in/");

		WebElement gmail = GetDriver.findElementToBeClickable(By.xpath("//a[@class='gb_g'][normalize-space()='Gmail']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(gmail).perform();
		actions.contextClick(gmail).perform();

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN); robot.keyRelease(KeyEvent.VK_DOWN);Thread.sleep(1000);		
		robot.keyPress(KeyEvent.VK_DOWN); robot.keyRelease(KeyEvent.VK_DOWN);Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_DOWN); robot.keyRelease(KeyEvent.VK_DOWN);Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);robot.keyRelease(KeyEvent.VK_ENTER);Thread.sleep(1000);

		Thread.sleep(2000);		
		driver.quit();
	}*/
	private void reloadPage() throws InterruptedException, AWTException {
		//WebDriver driver = GetDriver.getDriver();

		//Method 1 is driver.getCurrentUrl()
		/*GetDriver.getURL("https://www.google.co.in/");Thread.sleep(2000);
		WebElement gSearch = GetDriver.findVisibilityOfElementLocated(By.name("q"));
		gSearch.sendKeys("infotech limited");
		Thread.sleep(2000);*/

		/*GetDriver.getURL(driver.getCurrentUrl()); 
		WebElement gSearch1 = GetDriver.findVisibilityOfElementLocated(By.name("q"));gSearch1.sendKeys("green");*/

		//Method 2 is driver.navigate().refresh();
		/*driver.navigate().to("https://www.google.co.in/");		
		Thread.sleep(2000);
		WebElement gSearch = GetDriver.findVisibilityOfElementLocated(By.name("q"));
		gSearch.sendKeys("infotech limited");
		Thread.sleep(2000);
		driver.navigate().refresh();*/

		//Method 3 is Javascript Executor
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("history.go(0)");//location.reload()
		 */		

		//Method 4 is Robot class
		/*Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_F5); robot.keyRelease(KeyEvent.VK_F5);

		Thread.sleep(2000);
		driver.quit();*/
	}
	private void fullSCreen() throws InterruptedException {
		//		ChromeOptions op1 = new ChromeOptions();
		//		op1.addArguments("--start-maximized");
		/*WebDriver driver = GetDriver.getDriver();

		GetDriver.getURL("https://www.google.co.in/");*/
		//driver.manage().window().maximize();

		//org.openqa.selenium.Dimension di = new org.openqa.selenium.Dimension(1280, 1024);
		//driver.manage().window().setSize(di);

		/*Thread.sleep(2000);
		driver.quit();*/
	}

	private void AuthenticationPopup() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");


		Thread.sleep(2000);
		driver.quit();
	}
	private void printGoogleSugg() throws InterruptedException {
		/*WebDriver driver = GetDriver.getDriver();
		driver.get("https://www.google.co.in/");		
		//driver.findElement(By.name("q")).sendKeys("info");
		WebElement search = new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
		search.sendKeys("info");
		Thread.sleep(3000);

		List<WebElement> findElements = new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//ul[@role='listbox']//li")));
		System.out.println(findElements.size());
		for (WebElement webElement : findElements) {
			System.out.println("here : " + webElement.getText());
		}

		Thread.sleep(2000);
		driver.quit();*/

		System.setProperty("webdriver.chrome.driver", "D:\\TG\\AdactinCucumber\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
			driver.get("https://www.google.co.in/");		

			WebElement search = new FluentWait<>(driver)
					.withTimeout(Duration.ofSeconds(30))
					.pollingEvery(Duration.ofSeconds(5))
					.ignoring(NoSuchElementException.class)
					.ignoring(ElementNotInteractableException.class)
					.ignoring(ElementNotVisibleException.class)
					.until(new Function<WebDriver, WebElement>() {
						@Override
						public WebElement apply(WebDriver driver) {
							// TODO Auto-generated method stub
							//return driver.findElement(By.name("q"));
							return driver.findElement(By.xpath("//input[@name='q']"));
						}
					});
			search.sendKeys("info");
			Thread.sleep(100);

			List<WebElement> lst = (List<WebElement>) new FluentWait<>(driver)
					.withTimeout(Duration.ofSeconds(30))
					.pollingEvery(Duration.ofSeconds(3))
					.ignoring(NoSuchElementException.class)		
					.ignoring(ElementNotVisibleException.class)
					.until(new Function<WebDriver, List<WebElement>>() {
						@Override
						public List<WebElement> apply(WebDriver driver) {
							// TODO Auto-generated method stub
							System.out.println("here");
							return driver.findElements(By.xpath("//ul[@role='listbox']/li"));
						}
					});

			int pos=0;
			for (WebElement webElement : lst) {
				System.out.println("here : " + webElement.getText());

				//Task 1
				/*pos++;
				if(pos == 4) {
					webElement.click();break;
				}*/

				//Task 2
				if(webElement.getText().contains("technology")) {
					webElement.click(); break;
				}

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			Thread.sleep(5000);
			driver.quit();
		}

	}
	private void printGoogleSearch() throws InterruptedException {
		/*System.setProperty("webdriver.chrome.driver", "D:\\TG\\AdactinCucumber\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");		
		driver.findElement(By.name("q")).sendKeys("info");		
		Thread.sleep(100);

		List<WebElement> lst = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println(lst.size());
		for (WebElement el : lst) {
			System.out.println("here : " + el.getText());
		}

		driver.quit();*/

		System.setProperty("webdriver.chrome.driver", "D:\\TG\\AdactinCucumber\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		WebElement element = driver.findElement(By.name("q"));
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(element)).sendKeys("itechusa");
		//new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.name("q"))).sendKeys("itechusa");

		List<WebElement> lst = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@role='listbox']/li")));
		//List<WebElement> lst = new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//ul[@role='listbox']/li")));
		System.out.println(lst.size());
		for (WebElement el : lst) {
			System.out.println("here : " + el.getText());
		}

		driver.quit();

	}
	private void printGoogleSearchURL() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\TG\\AdactinCucumber\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		try {
			driver.get("https://www.google.co.in/");
			WebElement searchElement = new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(20))
					.pollingEvery(Duration.ofSeconds(3))
					.ignoring(NoSuchElementException.class)
					.until(new Function<WebDriver, WebElement>() {
						@Override
						public WebElement apply(WebDriver driver) {
							// TODO Auto-generated method stub
							return driver.findElement(By.name("q"));
						}
					});
			searchElement.sendKeys("infotech" + Keys.ENTER);
			Thread.sleep(5000);		

			/*WebElement searchElement1 = new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(20))
					.pollingEvery(Duration.ofSeconds(3))
					.ignoring(NoSuchElementException.class)
					.until(new Function<WebDriver, WebElement>() {
						@Override
						public WebElement apply(WebDriver driver) {
							// TODO Auto-generated method stub
							return driver.findElement(By.xpath("//span[text()='ITC Infotech | LinkedIn']"));
						}
					});id="rso"
			System.out.println(searchElement1.getText());*/
			List<WebElement> lst = new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(20))
					.pollingEvery(Duration.ofSeconds(3))
					.ignoring(NoSuchElementException.class)
					.until(new Function<WebDriver, List<WebElement>>() {	
						@Override
						public List<WebElement> apply(WebDriver driver) {
							// TODO Auto-generated method stub
							return driver.findElements(By.xpath("//div[@id='search']/div/div/div[2]/div/div/following::h3/parent::a"));
							//return driver.findElements(By.xpath("//div[@id='search']/div/div/div/following-sibling::div/following-sibling::div/div/div/a"));
						}
					});
			System.out.println(lst.size());
			for (WebElement el : lst) {
				String href = el.getAttribute("href");
				System.out.println(href);				
			}
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			Thread.sleep(2000);
			driver.quit();
		}
	}
	private void TableHandling() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\TG\\AdactinCucumber\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
			driver.get("https://www.w3schools.com/html/html_tables.asp");
			WebElement particularData = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[6]/td[2]"));
			System.out.println("==========Particular data==============");
			System.out.println(particularData.getText());

			List<WebElement> totColumn = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
			System.out.println("==========Total number of column==============");
			System.out.println(totColumn.size());

			List<WebElement> totRows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
			System.out.println("==========Total number of row including header==============");
			System.out.println(totRows.size());

			driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			Thread.sleep(2000);
			driver.quit();
		}
	}
	private void amazonNewTabWindowsHandling() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\TG\\AdactinCucumber\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		try {
			driver.get("https://www.amazon.in/");

			WebElement mobile = driver.findElement(By.xpath("(//div[@id=\"nav-xshop\"]/a)[1]"));
			Actions act = new Actions(driver);
			act.moveToElement(mobile).perform();
			act.contextClick(mobile).perform();
			Robot rob = new Robot();
			rob.keyPress(KeyEvent.VK_DOWN); rob.keyRelease(KeyEvent.VK_DOWN);
			rob.keyPress(KeyEvent.VK_ENTER); rob.keyRelease(KeyEvent.VK_ENTER);

			WebElement bestSeller = driver.findElement(By.xpath("(//div[@id=\"nav-xshop\"]/a)[2]"));
			//act = new Actions(driver);
			act.moveToElement(bestSeller).perform();
			act.contextClick(bestSeller).perform();
			rob = new Robot();
			rob.keyPress(KeyEvent.VK_DOWN); rob.keyRelease(KeyEvent.VK_DOWN);
			rob.keyPress(KeyEvent.VK_ENTER); rob.keyRelease(KeyEvent.VK_ENTER);

			WebElement todayDeals = driver.findElement(By.xpath("(//div[@id=\"nav-xshop\"]/a)[3]"));
			//act = new Actions(driver);
			act.moveToElement(todayDeals).perform();
			act.contextClick(todayDeals).perform();
			rob = new Robot();
			rob.keyPress(KeyEvent.VK_DOWN); rob.keyRelease(KeyEvent.VK_DOWN);
			rob.keyPress(KeyEvent.VK_ENTER); rob.keyRelease(KeyEvent.VK_ENTER);

			WebElement signIn = driver.findElement(By.id("nav-link-accountList"));
			//act = new Actions(driver);
			act.moveToElement(signIn).perform();
			act.contextClick(signIn).perform();
			rob = new Robot();
			rob.keyPress(KeyEvent.VK_DOWN); rob.keyRelease(KeyEvent.VK_DOWN);
			rob.keyPress(KeyEvent.VK_ENTER); rob.keyRelease(KeyEvent.VK_ENTER);

			//Windows Handle Start here
			String curentWindowHandle = driver.getWindowHandle();

			Set<String> allWindowHandles = driver.getWindowHandles();
			for (String window : allWindowHandles) {
				driver.switchTo().window(window);
				System.out.println(driver.getTitle());							
			}
			System.out.println("===============");
			Thread.sleep(3000);

			for (String window : allWindowHandles) {				
				driver.switchTo().window(window);
				if(driver.getTitle().equals("Amazon Sign In")) {
					driver.findElement(By.id("ap_email")).sendKeys("kesavanr.gopal@gmail.com");
					driver.findElement(By.id("continue")).click();

					driver.findElement(By.id("ap_password")).sendKeys("kesavanra480");
					driver.findElement(By.id("signInSubmit")).click();
					break;
				}
			}

			Thread.sleep(3300);
			WebElement accountList = driver.findElement(By.id("nav-link-accountList"));
			//act = new Actions(driver);
			act.moveToElement(accountList).perform();

			WebElement yourAccount = driver.findElement(By.xpath("//a/span[text()='Your Account' ]"));
			act.moveToElement(yourAccount).click(yourAccount).perform();

			Thread.sleep(2000);
			WebElement yourOrder = driver.findElement(By.xpath("(//a[@class=\"ya-card__whole-card-link\"])[1]"));
			act.moveToElement(yourOrder).pause(Duration.ofSeconds(3)).click(yourOrder);

			Thread.sleep(2000);
			System.out.println("w 2000");
			new Actions(driver).moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).perform();

			Thread.sleep(1000);
			System.out.println("w 1000");
			WebElement signOut = driver.findElement(By.id("nav-item-signout"));
			act.moveToElement(signOut).click(signOut);

			for (String window : allWindowHandles) {				
				driver.switchTo().window(window);
				if(!curentWindowHandle.equals(window)) {
					driver.close();
				}
			}

			Thread.sleep(5000);
			driver.switchTo().window(curentWindowHandle);
			driver.close();
			System.out.println("driver closed");
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {			
			driver.quit();
		}
	}

	private void iframeHandle() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\TG\\AdactinCucumber\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
			driver.get("http://demo.automationtesting.in/Frames.html");
			WebElement fFrame = driver.findElement(By.xpath("//div[@id='Single']/iframe[@id='singleframe']"));
			Thread.sleep(2000);
			driver.switchTo().frame(fFrame);
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("infotech");
			driver.switchTo().defaultContent();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//a[@href='#Multiple']")).click(); //click iframe with in an iframe button
			Thread.sleep(2000);
			WebElement secFrame = driver.findElement(By.xpath("//div[@id='Multiple']/iframe"));
			driver.switchTo().frame(secFrame);
			Thread.sleep(2000);

			WebElement inneriFrame = driver.findElement(By.xpath("//iframe"));
			driver.switchTo().frame(inneriFrame);
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("learning iframe");

			driver.switchTo().parentFrame(); //cursor switched to immediate parent frame
			driver.switchTo().defaultContent(); //cursor switched to webpage
			Thread.sleep(2000);

			driver.findElement(By.xpath("//a[@href='#Single']")).click(); //click single iframe button
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			Thread.sleep(5000);
			driver.quit();
		}
	}

	private void googleSearchEnter() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\TG\\AdactinCucumber\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
			driver.get("https://www.google.co.in/");
			WebElement search = driver.findElement(By.name("q"));
			//search.sendKeys("infotech" + Keys.ENTER);
			//search.sendKeys("infotech" + Keys.RETURN);

			//search.sendKeys("infotech");
			//search.submit();

			//search.sendKeys("infotech\n");

			search.sendKeys("infotech");
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			Thread.sleep(2000);
			driver.quit();
		}
	}

	private void sendKeysWithoutFindElement() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\TG\\AdactinCucumber\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
			driver.get("https://www.google.co.in/");

			//driver.switchTo().activeElement().sendKeys("infotech");

			PageFactory.initElements(driver, Launch.class);
			q.sendKeys("itechusa");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			Thread.sleep(2000);
			driver.quit();
		}
	}

	private void pageScroll() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\TG\\AdactinCucumber\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		try {
			driver.get("http://automationpractice.com/index.php");

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scroll(0,700);", ""); //scroll down
			Thread.sleep(1000);
			js.executeScript("window.scroll(0,-500);", ""); //scroll up
			Thread.sleep(1000);
			js.executeScript("window.scroll(0,document.body.scrollHeight);", ""); //scroll to bottom of page
			Thread.sleep(1000);
			js.executeScript("window.scroll(0,0);", ""); //scroll to Top of page
			Thread.sleep(1000);

			WebElement ele1 = driver.findElement(By.id("htmlcontent_home"));
			WebElement ele2 = driver.findElement(By.xpath("(//ul/li[contains(@class,'ajax_block_product ')])[1]"));
			js.executeScript("arguments[1].scrollIntoView()", ele1, ele2); // scroll to specific element
			Thread.sleep(1000);

			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_DOWN);robot.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_DOWN);robot.keyRelease(KeyEvent.VK_DOWN);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			Thread.sleep(2000);
			driver.quit();
		}
	}

	private void checkElementUndeline() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\TG\\AdactinCucumber\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		try {
			driver.get("https://www.google.co.in/");

			WebElement gmail = driver.findElement(By.xpath("//a[text()='Images']"));
			System.out.println("Before Hover : " + gmail.getCssValue("text-decoration"));
			System.out.println("Before Hover : " + gmail.getCssValue("color"));
			System.out.println("Before Hover : " + gmail.getCssValue("opacity"));

			Actions actions = new Actions(driver);
			actions.moveToElement(gmail).perform();
			System.out.println("After Hover : " + gmail.getCssValue("text-decoration"));
			System.out.println("After Hover : " + gmail.getCssValue("color"));
			System.out.println("After Hover : " + gmail.getCssValue("opacity"));

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			Thread.sleep(2000);
			driver.quit();
		}
	}
	private void keyInputWithoutSendKeys() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\TG\\AdactinCucumber\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		try {
			driver.get("http://proneuro.com/Contact");

			JavascriptExecutor js=(JavascriptExecutor) driver;
			//js.executeScript("document.getElementsByName('q')[0].value='infotech 123'", "");
			//WebElement Firstname = driver.findElement(By.name("Firstname"));
			//js.executeScript("arguments[0].scrollIntoView()", Firstname);
			js.executeScript("window.scroll(0,1000)", "");Thread.sleep(2000);
			js.executeScript("document.getElementsByName('Firstname')[0].value='infotech kesa'", "");
			js.executeScript("document.getElementsByName('Lastname')[0].value='infotech van'", "");

			WebElement Phoneno = driver.findElement(By.id("Phoneno"));

			WebElement Email = driver.findElement(By.id("Email"));
			js.executeScript("arguments[0].value='1212121'", Phoneno, Email);
			js.executeScript("arguments[1].value='test@test.com'", Phoneno, Email);

			//Robot class
			driver.navigate().to("https://www.google.co.in/");
			driver.switchTo().activeElement();
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_T);robot.keyRelease(KeyEvent.VK_T);
			robot.keyPress(KeyEvent.VK_E);robot.keyRelease(KeyEvent.VK_E);
			robot.keyPress(KeyEvent.VK_S);robot.keyRelease(KeyEvent.VK_S);
			robot.keyPress(KeyEvent.VK_T);robot.keyRelease(KeyEvent.VK_T);
			robot.keyPress(KeyEvent.VK_SPACE);robot.keyRelease(KeyEvent.VK_SPACE);
			robot.keyPress(KeyEvent.VK_S);robot.keyRelease(KeyEvent.VK_S);
			robot.keyPress(KeyEvent.VK_U);robot.keyRelease(KeyEvent.VK_U);
			robot.keyPress(KeyEvent.VK_B);robot.keyRelease(KeyEvent.VK_B);
			robot.keyPress(KeyEvent.VK_J);robot.keyRelease(KeyEvent.VK_J);
			robot.keyPress(KeyEvent.VK_E);robot.keyRelease(KeyEvent.VK_E);
			robot.keyPress(KeyEvent.VK_C);robot.keyRelease(KeyEvent.VK_C);
			robot.keyPress(KeyEvent.VK_T);robot.keyRelease(KeyEvent.VK_T);



		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			Thread.sleep(2000);
			driver.quit();
		}
	}

	private void checlAllCheckbox() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\TG\\AdactinCucumber\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		try {
			driver.get("http://leafground.com/pages/checkbox.html");

			List<WebElement> allChk = driver.findElements(By.xpath("//input[@type='checkbox']"));
			System.out.println(allChk.size());
			for (WebElement chk : allChk) {
				if(!chk.isSelected())
					chk.click();
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			Thread.sleep(2000);
			driver.quit();
		}
	}

	private void demoTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\TG\\AdactinCucumber\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		try {
			/*driver.get("http://leafground.com/pages/Calendar.html");
			WebElement element1 = driver.findElement(By.id("datepicker"));
			String attribute = element1.getAttribute("align");
			System.out.println(attribute);

			By locator =By.id("datepicker");
			WebElement element = driver.findElement(locator);

			WebDriverWait wt = new WebDriverWait(driver, 30);
			Boolean isEx = wt.until(ExpectedConditions.attributeContains(locator, "align", "left"));
			System.out.println("attributeContains : " + isEx);

			wt = new WebDriverWait(driver, 5);
			isEx = wt.until(ExpectedConditions.attributeToBeNotEmpty(element, "class"));
			System.out.println("attributeToBeNotEmpty : " + isEx);

			wt = new WebDriverWait(driver, 5);
			isEx = wt.until(ExpectedConditions.attributeToBe(element, "class", "hasDatepicker"));
			System.out.println("attributeToBe : " + isEx);*/

			Boolean isEx;
			WebDriverWait wt1 = new WebDriverWait(driver, 10);
			/*driver.get("http://leafground.com/pages/checkbox.html");
			WebElement element2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
			Actions actions = new Actions(driver);
			actions.moveToElement(element2).perform();			
			isEx = wt1.until(ExpectedConditions.elementToBeSelected(element2));
			System.out.println("elementToBeSelected : " + isEx);

			WebElement element2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
			Actions actions = new Actions(driver);
			actions.moveToElement(element2).perform();			
			isEx = wt1.until(ExpectedConditions.elementSelectionStateToBe(element2, true));
			System.out.println("elementSelectionStateToBe : " + isEx);*/

			driver.get("http://leafground.com/pages/checkbox.html");
			WebElement ele = driver.findElement(By.xpath("((//div)[10]/div)[1]"));			

			Boolean isP = wt1.until(ExpectedConditions.textToBePresentInElement(ele, "J"));
			System.out.println("textToBePresentInElement : " + isP);

			driver.get("http://leafground.com/pages/radio.html");
			ele = driver.findElement(By.xpath("(//input[@name='age'])[2]"));	
			isP = wt1.until(ExpectedConditions.textToBePresentInElementValue(ele, "1"));
			System.out.println("textToBePresentInElementValue : " + isP);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			//Thread.sleep(5000);
			driver.quit();
		}
	}

	private void demoPojo() {
		// TODO Auto-generated method stub

	}
	private void demoIterator() {
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(10);
		lst.add(30);
		lst.add(50);
		lst.add(70);

		/*System.out.println("============Iterator For Loop");
		for (Iterator iter = lst.iterator(); iter.hasNext();) {
			Integer integer = (Integer) iter.next();			
			System.out.println(integer);
		}*/

		/*System.out.println("============Iterator While Loop");
		Iterator<Integer> iterator1 = lst.iterator();
		while (iterator1.hasNext()) {
			Integer integer = (Integer) iterator1.next();			
			System.out.println(integer);
		}*/



		/*System.out.println("============ListIterator Backword While Loop");
		ListIterator<Integer> iterator2 = lst.listIterator();
		//listIterator.add(90);

		System.out.println("iterator2.hasPrevious() : " + iterator2.hasPrevious());
		while (iterator2.hasPrevious()) {
			Integer integer = (Integer) iterator2.previous();

			System.out.println(integer);
		}*/


		List<String> names = new ArrayList<String>();
		names.add("Shyam");
		names.add("Rajat");
		names.add("Paul");
		names.add("Tom");
		names.add("Kate");
		//Obtaining list iterator
		ListIterator<String> litr = names.listIterator();

		/*System.out.println("Traversing the list in forward direction:");
	    while(litr.hasNext()){
	       System.out.println(litr.next());
	    }*/
		System.out.println("\nTraversing the list in backward direction:");
		while(litr.hasPrevious()){
			System.out.println(litr.previous());
		}

		/*ListIterator<Integer> listIterator = lst.listIterator();
		while (listIterator.hasNext()) {
			Integer integer = (Integer) listIterator.next();
			//if(integer.equals(30)) listIterator.add(35);
			System.out.println(integer);
		}
		while (listIterator.hasPrevious()) {
			Integer integer = (Integer) listIterator.previous();
			//if(integer.equals(30)) listIterator.add(35);
			System.out.println(integer);
		}*/
	}
	private void demoAxes() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\TG\\AdactinCucumber\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		try {			
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			//org.openqa.selenium.Dimension di = new org.openqa.selenium.Dimension(1920, 1080);
			//driver.manage().window().setSize(di);
			driver.get("https://www.flipkart.com/mens-shorts/pr?sid=clo,vua,e8g,kc7&fm=neo%2Fmerchandising&iid=M_dfc45740-00b0-4dbd-8d5a-157b4b0f1c56_1_372UD5BXDFYS_MC.5ID80LFLDBHG&otracker=hp_rich_navigation_5_1.navigationCard.RICH_NAVIGATION_Fashion~Men%2527s%2BBottom%2BWear~Men%2527s%2BShorts_5ID80LFLDBHG&cid=5ID80LFLDBHG");
			List<Integer> priceLst= new ArrayList<Integer>();


			//List<WebElement> elements = driver.findElements(By.xpath("//h3[text()='Levis']//parent::div//descendant::span[@class=\"product-discountedPrice\"]"));
			//List<WebElement> elements = driver.findElements(By.xpath("//div[text()='Only Few Left!']//preceding-sibling::div//descendant::span[@class='product-discountedPrice']"));
			//WebDriverWait wt = new WebDriverWait(driver, 10) ;
			//List<WebElement> elements = wt.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[normalize-space()='Only Few Left!'][@class='xcelerator-plpXceleratorInfoTag']")));
			//System.out.println("result : " + elements.size());
			/*for (WebElement webElement : elements) {
				String stringValue = webElement.getText().replace("Rs. ", "");
				int value = Integer.parseInt(stringValue);
				priceLst.add(value);
				System.out.println(webElement.getText());
			}*/
			//Collections.sort(priceLst);
			//System.out.println(priceLst);
			//System.out.println("Higest price list is " + max);

			List<WebElement> findElements = driver.findElements(By.xpath("//div[contains(text(),'more, save extra 15%')]/parent::div/preceding-sibling::a[1]/div/div[1]"));
			WebDriverWait wt = new WebDriverWait(driver, 20) ;
			wt.until(ExpectedConditions.visibilityOfAllElements(findElements));
			//wt.until(ExpectedConditions.stalenessOf(element))
			//Thread.sleep(5000);
			for (WebElement webElement : findElements) {
				System.out.println("getText() : " + webElement.getText().replaceAll("[^A-Za-z0-9$]", ""));
			}



		} 
		catch (NoSuchElementException nsee) {
			System.err.println("================ NoSuchElementException ================");
			nsee.printStackTrace();
		}
		catch (Exception e) {
			System.err.println("================ Exception ================");
			e.printStackTrace();		
		}
		finally {
			driver.quit();
		}
	}
	private void demoFindElement() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		try {			
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();			
			driver.get("https://www.myntra.com/nike");			

			WebDriverWait wt = new WebDriverWait(driver, 10) ;
			WebElement findElement = wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//*[text()='Only Few Left!'])[1]"))));
			//Thread.sleep(5000);
			System.out.println("getText() : " + findElement.getText());
		} 
		catch (NoSuchElementException nsee) {
			System.err.println("================ NoSuchElementException ================");
			nsee.printStackTrace();
		}
		catch (Exception e) {
			System.err.println("================ Exception ================");
			e.printStackTrace();
		}
		finally {
			driver.quit();
		}
	}

	public void removeSpecialChar() {
		String s="This#is%%java^program@class*123";
		String op = s.replaceAll("[^a-zA-Z]", " ");
		System.out.println(op);

		//String replaceAll = s.replaceAll("This", " ");
		//System.out.println(replaceAll);
	}

	public void tableDemo() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));

		for (int row = 0; row < rows.size(); row++) {
			List<WebElement> cols = rows.get(row).findElements(By.tagName("td"));

			for (int col = 0; col < cols.size(); col++) {
				String text = cols.get(col).getText();
				System.out.println(text);
			}
		}
		driver.quit();

	}
	private void arrayMethods() {
		int[] arr = new int[4];
		List<String> lst = new ArrayList<String>();
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("a");

	}

	private void webTable() {
		//System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		//System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();
		//System.out.println("b : " + driver);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		//System.out.println("c :" + driver);
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		//System.out.println("d : " + rows.size());
		for (int i = 0; i < rows.size(); i++) {
			//System.out.println("i : " + i);
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));

			for (int j = 0; j < cols.size(); j++) {
				//System.out.println("j : " + j);
				WebElement webElement = cols.get(j);
				System.out.println(webElement.getText());
			}
		}
		driver.quit();
	}
}
