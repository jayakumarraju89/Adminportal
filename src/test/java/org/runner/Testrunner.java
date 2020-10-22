package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/createsubscriber.feature", glue= {"stepdef"},
plugin= {"pretty","json: target/Repo/login.json"}, dryRun=false, monochrome=true)


public class Testrunner {
	
	

}
