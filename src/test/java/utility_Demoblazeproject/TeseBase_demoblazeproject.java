package utility_Demoblazeproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TeseBase_demoblazeproject {
	public Properties Propp2 = new Properties();
	public WebDriver driver;

	public TeseBase_demoblazeproject() {

		try {
			FileInputStream files2 = new FileInputStream(System.getProperty("user.dir")
					+ "\\src\test\\java\\configration_Demoblazeproject\\Demoblazeproject.properties");

			Propp2.load(files2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

public void open2() {
	
	String bName = Propp2.getProperty("Browser");
	if(bName.equals("Chrome")) {
		System.setProperty("WebDriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	
	}

	else if(bName.equals("IE"));
}


}