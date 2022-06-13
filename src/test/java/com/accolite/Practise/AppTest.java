package com.accolite.Practise;

import org.testng.annotations.BeforeSuite;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "Feature_File"
        ,glue={"stepDefinition"}
        ,tags= "@Testing"
        )

        public class AppTest extends AbstractTestNGCucumberTests{
	
	
@BeforeSuite
public void overAll() {
	System.out.println("OverAll");
}


        }