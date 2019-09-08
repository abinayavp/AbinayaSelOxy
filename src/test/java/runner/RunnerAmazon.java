package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/java/feature/EditLead.Feature", glue = "testleaf",
monochrome = true /*dryRun = true, snippets = SnippetType.CAMELCASE*/)

public class RunnerAmazon extends AbstractTestNGCucumberTests {

	
}
