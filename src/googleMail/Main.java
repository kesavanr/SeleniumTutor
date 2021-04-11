package googleMail;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class Main {

	public final static String userName="demolink1984@gmail.com";
	public final static String passWord="Chennai1#";
	public final static long sec=30;
	public final static String recoveryEmail="kesavanr.gopal@gmail.com";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locators m1= new Locators();
		WebDriver driver = m1.getWebDriver();
		try {
			m1.navigateURL(driver);
			
			m1.signIn(driver, sec).click();
			
			Utilities.windowHandle(driver);
			
			m1.username(driver, sec).sendKeys(userName);
			m1.usernameClick(driver, sec).click();
			m1.password(driver, sec).sendKeys(passWord);
			m1.passwordClick(driver, sec).click();
			
			if(m1.isExistsRecoveryEmailLink(driver, sec)) {
				System.out.println("Email Recovery Section");
				m1.recoveryEmailClick(driver, sec).click();
				m1.recoveryEmail(driver, sec).sendKeys(recoveryEmail);
				m1.recoveryNextClick(driver, sec).click();				
			}
			
			for (int i = 0; i < 2; i++) {
				m1.composeClick(driver, sec).click();
				m1.toMailAddress(driver, sec).sendKeys("demolink1984@gmail.com");
				m1.toSubject(driver, sec).sendKeys("test automation subject : " + (i+1));
				m1.toMessage(driver, sec).sendKeys("test automation message : " + (i+1));

				//m1.attachementClick(driver, sec).click();
				//Utilities.bindAttachement(); //Robot START

				m1.sendClick(driver, sec).click();
				Thread.sleep(2000);	
			}
			
			
			m1.inboxClick(driver, sec).click();
			//driver.navigate().refresh();
			m1.showInbox(driver, sec);
			
			m1.profileClick(driver, sec).click();
			m1.logoutClick(driver, sec).click();
			
			
			System.out.println("Browser Closed");
		} catch (NoSuchElementException e) {			
			//System.out.println(e.toString());
			e.printStackTrace();
		} catch (Exception e) {
			//System.out.println(e.toString());
			e.printStackTrace();
		}
		finally {
			driver.quit();
		}
		
	}

}
