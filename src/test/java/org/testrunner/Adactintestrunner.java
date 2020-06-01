package org.testrunner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Featurefiles",glue="org.stepdef", dryRun=false)


public class Adactintestrunner {

	
	
	
}
