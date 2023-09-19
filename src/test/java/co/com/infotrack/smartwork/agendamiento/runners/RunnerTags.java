package co.com.infotrack.smartwork.agendamiento.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features"
        , snippets = SnippetType.CAMELCASE
        , tags = "@CP001_Creacion_OrdenServicio"
        , glue = "co.com.infotrack.smartwork.agendamiento.definition")

public class RunnerTags {
    // gradle clean test aggregate -Dtags=@CP001_Creacion_OrdenServicio
}
