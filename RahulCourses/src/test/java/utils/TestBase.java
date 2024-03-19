package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public WebDriver driver;

	public WebDriver Webdrivermanager() throws IOException {
		
		File a=new File("C:\\Users\\DELL\\eclipse-workspace\\RahulCourses\\src\\main\\resources\\Global\\Global.Properties");
		FileInputStream inpus=new FileInputStream(a);
		Properties props=new Properties();
		props.load(inpus);
		
		String url=props.getProperty("url");
		
		

		if (driver == null) {
			driver = new ChromeDriver();
			driver.get(url);

		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		return driver;

	}

}
