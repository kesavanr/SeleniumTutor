package com.automation.practice;

import org.openqa.selenium.WebDriver;

import com.automation.practice.baseclass.BaseClass;
import com.automation.practice.pom.HomePage;
import com.automation.practice.pom.RegisterPage;

public class Register extends BaseClass {

	public static WebDriver driver;
	public static void main(String[] args) {

		try {
			driver = getBrowser("chrome");
			getURL("http://automationpractice.com/index.php");

			HomePage hp=new HomePage(driver);
			Click(hp.getSignIn());

			RegisterPage r = new RegisterPage(driver);
			findInputElement(r.getEmail_create(), "test1984@test.com");
			Click(r.getSubmitCreate());
			
			clickPresenceOfElement(r.getId_gender1Locat());
			findInputElement(r.getCustomer_firstname(), "kesa");
			findInputElement(r.getCustomer_lastname(), "van");
			findInputElement(r.getPasswd(), "123456");
			selectDropDown(r.getDaysLocat(), "9", "index");
			selectDropDown(r.getMonthsLocat(), "4", "value");
			selectDropDown(r.getYearsLocat(), "1984  ", "text");
			clickPresenceOfElement(r.getNewsletterLocat());
			clickPresenceOfElement(r.getOptinLocat());
			findInputElement(r.getFirstname(), "kesagopal");
			findInputElement(r.getLastname(), "vangopal");
			findInputElement(r.getCompany(), "test company");
			findInputElement(r.getAddress1(), "test addd1");
			findInputElement(r.getAddress2(), "test add 2");
			findInputElement(r.getCity(), "test city");
			selectDropDown(r.getId_stateLocat(), "9", "index");
			findInputElement(r.getPostcode(), "00000");
			selectDropDown(r.getId_countryLocat(), "United States", "text");
			findInputElement(r.getOther(), "test add information");
			findInputElement(r.getPhone(), "1231231231");
			findInputElement(r.getPhone_mobile(), "4564564");
			findInputElement(r.getAlias(), "test alias");
			//Click(r.getSubmitAccount());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			quitBrowser();
		}
	}

}
