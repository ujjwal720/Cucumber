package Runner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "C:\\Users\\DELL\\eclipse-workspace\\RahulCourses\\src\\main\\resources\\Feature\\checkout.feature", glue = { "Steps" }
		,monochrome=true)

public class TestNgRunner extends AbstractTestNGCucumberTests {

}
