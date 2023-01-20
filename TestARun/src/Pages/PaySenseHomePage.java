package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaySenseHomePage {

	public void Launch()
	{
	System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.gopaysense.com/");
	}
	
	
	
}
