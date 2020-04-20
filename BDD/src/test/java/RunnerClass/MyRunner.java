package RunnerClass;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/features/login.feature",
				 glue="steps",
				 tags="@smoke")
public class MyRunner extends AbstractTestNGCucumberTests{

}
