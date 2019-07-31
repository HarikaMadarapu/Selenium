 package runner;

import cucumber.api.CucumberOptions;
//import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/features/CreateLead.feature",glue="methodsteps",monochrome=true/*,dryRun=true,
                        snippets=SnippetType.CAMELCASE*/)

public class RunTest extends AbstractTestNGCucumberTests   {

}
