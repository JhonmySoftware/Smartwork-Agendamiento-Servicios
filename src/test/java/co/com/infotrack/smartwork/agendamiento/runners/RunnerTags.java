package co.com.infotrack.smartwork.agendamiento.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-html-report.html",
                "json:target/cucumber.json",
                "junit:target/cucumber.xml",
                "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features"
        , snippets = SnippetType.CAMELCASE
        , tags = "@CP002_Agendamiento_Servicio"
        //CP001_Creacion_OrdenServicio
        //CP002_Agendamiento_Servicio
        , glue = "co.com.infotrack.smartwork.agendamiento.definition")

public class RunnerTags {
    // gradle clean test aggregate -Dtags=@CP001_Creacion_OrdenServicio
}
