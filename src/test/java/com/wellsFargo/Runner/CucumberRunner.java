package com.wellsFargo.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Eclipse_New\\com.qa.wellsFargoPracticeCucumber\\src"
		+ "\\main\\resources\\featureFolder\\taggedHooks.feature", 
	glue = {"stepDefinition"},
	monochrome = true,
	strict = true,
	dryRun = false )
	
	//tags = {"@SmokeTest,@RegressionTest"})

// in tags annotation 
// ORnd : {" , "} -- execute all test case tags as smoke or regression 
//AnDed : {"  " , "  "}   -- execute all test cases tags as smoke and regression


public class CucumberRunner {

}
