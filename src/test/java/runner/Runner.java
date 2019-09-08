package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/feature/Login.feature",glue="stepstocreateLead",
monochrome=true,
tags = "@smoke"
/*dryRun=true,
snippets=SnippetType.CAMELCASE*/)


public class Runner extends AbstractTestNGCucumberTests {

}
