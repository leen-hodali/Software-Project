package clinicf;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "testcases" , 
          monochrome=true,
          snippets = SnippetType.CAMELCASE,
          
          glue = {"clinicf"})
public class AcceptanceTest {

}