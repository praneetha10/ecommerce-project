package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class baseclass {
	
	private WebDriver driver;
	@Test
	public void launchBrowser(String browser) {
		
		if(browser.equalsIgnoreCase(browser)) {
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase(browser)) {
			driver=new EdgeDriver();
		}
	}
	
	public static String getValueInPropertiesFile(String propertyname) throws Exception   {
		
		String pfpath=System.getProperty("iser.dir")+"\\src\\main\\java\\config\\config.properties";
		FileInputStream fi=new FileInputStream(pfpath);
		Properties p=new Properties();
		p.load(fi);
		String value=p.getProperty(propertyname);
		fi.close();
		return(value);
	}
	
	
		public void launchSite(WebDriver driver) throws Exception
		{
			String temp=getValueInPropertiesFile("url");
			driver.get(temp);
			driver.manage().window().maximize();
		}
	
	

}
