package Pattern;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tata {

	public static void main(String[] args) throws IOException
	{
	System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\Sagar Paulkar\\Desktop\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.tataaia.com/");
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("scroll(0,5000)");
	WebElement
	name=driver.findElement(By.xpath("//input[@id='createLeadneedformfullname']"));
	name.sendKeys("vidya jagtap");
	WebElement moblieno=driver.findElement(By.xpath("//input[@name='mobileNo']"));
	moblieno.sendKeys("8830352761");
	WebElement splan=driver.findElement(By.xpath("//select[@id='selectValue']"));
	Select s=new Select(splan);
	s.selectByVisibleText("Saving Plans");
	
	WebElement gclick=driver.findElement(By.xpath("//button[@id='getCallBacksbtnabc']"));
	 gclick.click();
	}
}

