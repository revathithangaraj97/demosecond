package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Revathi T\\Desktop\\software testing\\Automation\\Eclipseworkspace\\Cucumberexample\\src\\test\\java\\Features\\login.feature",
glue= {"Stepdefiniton"},
plugin= {"pretty","junit:target/Junitreport/reports.xml"})
public class Runner {

}
