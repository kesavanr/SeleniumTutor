package com.automation.practice;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.automation.practice.baseclass.BaseClass;
import com.automation.practice.pom.AddToCart;
import com.automation.practice.pom.HomePage;
import com.automation.practice.pom.SignInPage;

public class Main extends BaseClass {
	
	public static WebDriver driver;
	
	//public static void main(String[] args) throws InterruptedException {
	@Test
	public void mainPage() {
		try {
			driver = getBrowser("chrome");
			getURL("http://automationpractice.com/index.php");
			
			HomePage hp = new HomePage(driver);		
			Click(hp.getSignIn());
			
			SignInPage signPage=new SignInPage(driver);
			findInputElement(signPage.getEmail(), "demolink1984@gmail.com");
			findInputElement(signPage.getPasswd(), "123456");
			Click(signPage.getSubmitLogin());
			
			boolean displayed = isDisplayedStatus(signPage.getWelcome());
			System.out.println("welcomeText : " + signPage.getWelcome().getText());
						
			AddToCart cartPage = new AddToCart(driver);
			moveToElement(cartPage.getWomenTab());
			
			WebElement gettShirts = cartPage.gettShirts();
			moveToElement(gettShirts);
			clickOnElement(gettShirts);
			scrollIntoView(cartPage.getSelectProductSortLocat());
			moveToElement(cartPage.getProductContainer());
			moveToElement(cartPage.getQuickView());
			clickOnElement(cartPage.getQuickView());

			//switchToFrameUsingId("id", 0);			
			driver = switchToFrame(cartPage.getFirstFrame());
			
			moveToElement(cartPage.getFancyBox());
			clickOnElement(cartPage.getFancyBox()); 	
			Click(cartPage.getAddQty()); 			
			Click(cartPage.getAddQty());
			selectDropDown(cartPage.getGroup_1Locat(), "2", "value");
			clickOnElement(cartPage.getBlue());
			Click(cartPage.getSubmitButton());
			
			driver = defaultContent();
			Click(cartPage.getProceedToCheckout());
			Click(cartPage.getProceedToCheckout2());
			Click(cartPage.getProcessAddress());
			clickPresenceOfElement(cartPage.getCgvLocat());
			Click(cartPage.getProcessCarrier());
			Click(cartPage.getPayByBankWire());
			Click(cartPage.getConfirmOrder());
			Click(cartPage.getBackToOrders());
			
			System.out.println("==========DONE=========");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		finally {
			quitBrowser();
		}
	}

	/*
	private void signIn(WebDriver driver) throws InterruptedException {
		try {
			driver.get("http://automationpractice.com/index.php");
			driver.findElement(By.linkText("Sign in")).click();

			Thread.sleep(2000);
			driver.findElement(By.id("email")).sendKeys("demolink1984@gmail.com");
			driver.findElement(By.id("passwd")).sendKeys("123456");

			driver.findElement(By.id("SubmitLogin")).click();
			Thread.sleep(2000);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			
		}
	}
	
	private void placeOrder(WebDriver driver) throws InterruptedException {
		try {
			Actions actions = new Actions(driver);
			
			WebElement womenTab = driver.findElement(By.xpath("//a[@title='Women']"));
			actions.moveToElement(womenTab).perform();
			Thread.sleep(2000);
			
			WebElement tShirts = driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]"));
			actions.moveToElement(tShirts).click(tShirts).perform();
			Thread.sleep(2000);
			
			WebElement selectProductSort = driver.findElement(By.id("selectProductSort"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", selectProductSort);
			
			WebElement productContainer = driver.findElement(By.xpath("//div[@class='product-image-container']"));
			actions.moveToElement(productContainer).click(productContainer).perform();
			Thread.sleep(5000);
			System.out.println("w 5000");
			WebElement firstFrame = driver.findElement(By.xpath("//iframe"));
			driver.switchTo().frame(firstFrame);
			Thread.sleep(2000);
			
			WebElement fancyBox = driver.findElement(By.xpath("(//img[@alt='Faded Short Sleeve T-shirts'])[5]"));
			actions.moveToElement(fancyBox).perform();
			Thread.sleep(1000);
			
			WebElement addQty = driver.findElement(By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']"));
			addQty.click();	addQty.click(); addQty.click();
			
			WebElement group_1 = driver.findElement(By.id("group_1"));
			Select size = new Select(group_1);
			size.selectByValue("2");
			
			driver.findElement(By.name("Blue")).click();			
			driver.findElement(By.xpath("//p[@id='add_to_cart']/button[@name='Submit']")).click();
			
			driver.switchTo().defaultContent();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();			
			driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();			
			driver.findElement(By.xpath("//button[@name='processAddress']")).click();			
			driver.findElement(By.id("cgv")).click();			
			driver.findElement(By.xpath("//button[@name='processCarrier']")).click();
			
			WebElement cartShow = driver.findElement(By.xpath("//div[@class='shopping_cart']/a"));
			Actions ac = new Actions(driver);
			ac.moveToElement(cartShow).perform();Thread.sleep(2000);
			WebElement btnOrderCart = driver.findElement(By.id("button_order_cart"));
			ac.moveToElement(btnOrderCart).click(btnOrderCart).perform();
			
			driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();			
			driver.findElement(By.xpath("//button[@name='processAddress']")).click();			
			driver.findElement(By.id("cgv")).click();			
			driver.findElement(By.xpath("//button[@name='processCarrier']")).click();			
			driver.findElement(By.xpath("//a[@title='Pay by bank wire']")).click();			
			driver.findElement(By.xpath("//button/span[text()='I confirm my order']")).click();			
			driver.findElement(By.xpath("//a[@title='Back to orders']")).click();
						
			System.out.println("==========DONE=========");
		}
		catch (Exception e) {
			e.printStackTrace();			
		}
		finally {
			
		}
	}
	private void QuitDriver(WebDriver driver) throws InterruptedException {
		try {
			driver.findElement(By.xpath("//a[@title='Log me out']")).click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			Thread.sleep(5000);
			driver.quit();
		}
		
	}
	private void demo1() {
		WebDriver driver = GetDriver.getDriver();
		GetDriver.getURL("https://www.google.co.in/");
		try {
			WebElement gmail = GetDriver.findElementToBeClickable(By.xpath("//a[@class='gb_g'][normalize-space()='Gmail']"));
			Actions actions = new Actions(driver);
			actions.moveToElement(gmail).perform();
			actions.contextClick(gmail).perform();

			Thread.sleep(2000);		

		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			driver.quit();
		}

	}*/
}
