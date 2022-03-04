package com.test_runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		junit= "--step-notifications",
		plugin = {"json:target/cucumber.json"},
		features="feature",       //folder name
		glue={"step_definition"}   //pacakage name
		,tags= "@hover1" //which code we need to run that data we shld pass
		)

public class TestRunner 
{

}
