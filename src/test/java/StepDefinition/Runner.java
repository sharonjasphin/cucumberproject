package StepDefinition;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature/login.feature",glue = {"StepDefinition"},
monochrome=true,
plugin= {"pretty","html:target/HtmlReports"},
tags = "@smoketest"
)

public class Runner extends AbstractTestNGCucumberTests{

}
