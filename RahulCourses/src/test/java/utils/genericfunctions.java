package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class genericfunctions {
	
	
	public WebDriver driver;
	
	public genericfunctions(WebDriver driver) {
		
		this.driver=driver;
		
		
	}

	public void getwindowshandels() {
		Set<String> ios = driver.getWindowHandles();
		Iterator<String> im = ios.iterator();
		String parent = im.next();
		String child = im.next();
		driver.switchTo().window(child);
		

	}

}
