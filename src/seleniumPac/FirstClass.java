package seleniumPac;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FirstClass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32.zip\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		/*
		 * Thread.sleep(1000);
		 * driver.findElement(By.xpath("//input[@id='imagesrc']")).click();
		 * r.setAutoDelay(2000); System.out.println("After clicking"); StringSelection
		 * s= new StringSelection("C:\\Users\\Administrator\\OneDrive\\Desktop\\two");
		 * Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		 * r.setAutoDelay(2000); r.keyPress(KeyEvent.VK_CONTROL);
		 * r.keyPress(KeyEvent.VK_V); r.keyRelease(KeyEvent.VK_V);
		 * r.keyRelease(KeyEvent.VK_CONTROL); r.keyPress(KeyEvent.VK_ENTER);
		 * r.keyRelease(KeyEvent.VK_ENTER);
		 */

	}

}
