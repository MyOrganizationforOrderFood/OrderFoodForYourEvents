package orderfood;


import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io. cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/MYfeatures",
		monochrome=true, 
     snippets = SnippetType.CAMELCASE,
     glue = "orderfood")
public class Acceptance {
	
	

}
