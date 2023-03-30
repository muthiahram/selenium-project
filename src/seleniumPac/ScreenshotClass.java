package seleniumPac;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	WebDriver driver= new ChromeDriver();
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32.zip\\chromedriver.exe");
	driver.navigate().to("https://www.facebook.com");
	driver.manage().window().maximize();
	
	Date d =new Date();
	//System.out.println(d);
	String filename=d.toString().replace(" ", "-").replace(":","-");
	System.out.println(filename);
	TakesScreenshot srcsht= (TakesScreenshot) driver;
	File  srcfile=srcsht.getScreenshotAs(OutputType.FILE);
	String x="C:\\Users\\Administrator\\OneDrive\\Desktop\\one " + filename+".jpeg";
	File destfile= new File(x);
	FileUtils.copyFile(srcfile, destfile);

}}
