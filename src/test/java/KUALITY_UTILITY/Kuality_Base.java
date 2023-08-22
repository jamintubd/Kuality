package KUALITY_UTILITY;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Kuality_Base {
	
	public static WebDriver driver;
	public static Properties KPro;
	
	public Kuality_Base () {
		try {
			FileInputStream K_file = new FileInputStream (System.getProperty("user.dir")+"//src/test/java/KUALITY_CONFIQ/Kuality_Confiq.Properties");
			KPro = new Properties ();
			KPro.load(K_file);
		} catch (FileNotFoundException e) {
			
			System.out.println("Please check the Constructor");
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	public void Kuality_Browser () {
		
		String KBrowser = KPro.getProperty("Browser1");
		
		if(KBrowser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",(System.getProperty("user.dir")+ "Chrome_Driver/chromedriver.exe"));
			ChromeOptions Chromeko = new ChromeOptions ();
			Chromeko.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Kuality_Utility.pageLoadTimeout));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Kuality_Utility.implicitlyWait));
			driver.manage().window().maximize();
			
		}
		else if(KBrowser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+ "Edge_Driver/msedgedriver.exe");
			EdgeOptions Edgeko = new EdgeOptions ();
			Edgeko.addArguments("--remote-allow-origins=*");
			driver = new EdgeDriver();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Kuality_Utility.pageLoadTimeout));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Kuality_Utility.implicitlyWait));
			driver.manage().window().maximize();
		}
	}
	public static void KualityLaunchingURL (String URL) {
		driver.get(KPro.getProperty("KualityURL"));
		
	}
}
