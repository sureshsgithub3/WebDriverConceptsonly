package WaitMthods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Implicitwait {

	public static void main(String[] args) {
	WebDriver	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.get("http://www.ndtv.com/");
		driver.manage().window().maximize();
		

	}

}
