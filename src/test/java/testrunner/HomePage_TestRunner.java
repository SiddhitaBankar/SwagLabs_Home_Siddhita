package testrunner;

import org.testng.annotations.Test;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/Features/HomePage.feature"},
        glue = {"HomePage_stepdefinations", "apphooks"},
                 plugin= {"pretty" ,
                         "html:target/creport/cucumber",
                         "json:target/creport/cucumber.json",
                          "junit:target/creport/cucumber.xml"
                         }

        )

 

public class HomePage_TestRunner extends AbstractTestNGCucumberTests
{

}