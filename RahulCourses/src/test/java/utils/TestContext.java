package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Pages.PageObjectManager;

public class TestContext {

	public WebDriver driver;
	public String homepage;
	public String Topdealspage;
	public String[] rem;
	public PageObjectManager manager;
	public TestBase abc;
	public genericfunctions iop;

	public TestContext() throws IOException {
		
		
		
        abc=new TestBase();
		manager = new PageObjectManager(abc.Webdrivermanager());
		iop=new genericfunctions(abc.Webdrivermanager());

	}

}
