
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
//@CucumberOptions (features = "src/test/resources/features/google_search.feature", tags = "@searchButton")
@CucumberOptions (features = "src/test/resources/features/google_search.feature", tags = "@searchSuggestions")

public class RunnerTags {

}
