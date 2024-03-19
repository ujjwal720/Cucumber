package Steps;

import java.io.IOException;

import io.cucumber.java.After;
import utils.TestContext;

public class cucmberhooks {

	public TestContext a;

	public cucmberhooks(TestContext a) {

		this.a = a;

	}
	
	@After
	public void teardown() throws IOException {
		
		
		a.abc.Webdrivermanager().quit();
		
		
		
	}

}
