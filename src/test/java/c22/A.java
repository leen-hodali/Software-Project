package c22;




import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"html: target/cucumber.html"},
features = "testcases",
monochrome=true,
snippets=SnippetType.CAMELCASE,
glue = {"c22"})

public class A{

}

	
