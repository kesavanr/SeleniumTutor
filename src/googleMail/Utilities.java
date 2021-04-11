package googleMail;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Utilities {
	public static void windowHandle(WebDriver driver) {
		Set<String> windowHandlesNew = driver.getWindowHandles();
		for (String newWindow : windowHandlesNew) {
			driver.switchTo().window(newWindow);
		}
	}
	
	public static void bindAttachement() {
		try {
			Robot robot = new Robot();
			ClipboardOwner owner = null;
			String filePath="C:\\Users\\sys-033\\Desktop\\MEETING URL.txt";
			StringSelection path = new StringSelection(filePath);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, owner);
			
			robot.setAutoDelay(5000);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.setAutoDelay(5000);
			
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
