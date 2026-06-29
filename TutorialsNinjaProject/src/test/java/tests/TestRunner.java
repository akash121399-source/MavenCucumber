package tests;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resource/features",
		glue="stepdefinition",
	//	tags="@smoke",
	//	plugin={"html:traget/CucumberReport.html"}
		plugin={"html:traget/CucumberReport/CucumberReport.html",
				"json:traget/CucumberReport/CucumberReport.json",
				"junit:traget/CucumberReport/CucumberReport.xml"
		}
		)
public class TestRunner {

}
