package HomeWork6.SauceDemo;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
  features = "src/test/resources/Features", 
		  glue = {"HomeWork6.SauceDemo.stepDef"},
		  plugin = {
                  "pretty",
                  "json:target/cucumber-report/cucumber.json",
                  "html:target/cucumber-report/cucumber.html"}

public class RunnerHomeWork6 {

}