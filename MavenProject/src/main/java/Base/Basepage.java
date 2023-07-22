package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basepage {

	public static WebDriver driver;
	public String url;
	public Properties prop;
	
	
	public Basepage() throws IOException {
		prop=new Properties();
		FileInputStream data=new FileInputStream("C:\\Users\\91728\\eclipse-workspace\\First_project_Maven\\src\\main\\java\\resources\\config.properties");
		prop.load(data);
	}

	public WebDriver getDriver() throws IOException {
		prop = new Properties();
		FileInputStream data = new FileInputStream(
				"C:\\Users\\91728\\eclipse-workspace\\First_project_Maven\\src\\main\\java\\resources\\config.properties");
		prop.load(data);
		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\91728\\Desktop\\virtusa training\\driver1\\chromedriver3.exe\\");
			driver = new ChromeDriver();
		} else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\91728\\Desktop\\virtusa training\\driver1\\chromedriver3.exe\\");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		
		return driver;

	}
	public String getUrl() throws IOException {
		prop=new Properties();
		FileInputStream data=new FileInputStream("C:\\\\Users\\\\91728\\\\eclipse-workspace\\\\First_project_Maven\\\\src\\\\main\\\\java\\\\resources\\\\config.properties");
		prop.load(data);
		url=prop.getProperty("url");
		return url;
		
		
	}
	
	public void TakeSnapShot(String name) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File desFile = new File("C:\\Users\\91728\\eclipse-workspace\\First_project_Maven\\target\\screenshots" + timeStamp()+ ".png");
		
		FileUtils.copyFile(src, desFile);
	
	}
	public String timeStamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date()); 
	}
	
	

}
