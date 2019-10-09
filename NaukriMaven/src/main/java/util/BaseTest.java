package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

	
	public static Properties properties=null;
	public static WebDriver driver=null;
	
	public static Properties loadPropertyFile() throws IOException {
		FileInputStream fs=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\util\\config.properties");
		properties=new Properties();
		properties.load(fs);
		return properties;
		
		}
	
		
	@BeforeSuite
	public static void  launchBrowser() throws IOException {
		loadPropertyFile();
		String browser=properties.getProperty("browser");
		String uRl=properties.getProperty("url");
				System.out.println(uRl);
		
	
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\java\\util\\chromedriver.exe");	
			driver=new ChromeDriver();
		}
		/*else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.driver", driverLoc);	
			driver=new FirefoxDriver();
		}*/
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(uRl);	
		
		
	}
	
	
	/*@AfterSuite
	public void tearDown() {
		driver.quit();
	}*/
}
	
	
	
	
	
	
	
	
	
