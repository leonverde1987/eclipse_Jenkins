package main;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="features", 
		glue="steps",
		plugin = {"pretty", "html:target/Cucumber", "json:target/Cucumber.json", "junit:target/cucumber-reports/Cucumber.xml"}
				)
public class inicio {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
