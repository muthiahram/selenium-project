package seleniumPac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32.zip\\chromedriver.exe");
		driver.navigate().to("https://www.google.com");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//a[@class='_8esh']")).click();
		
	}

}
