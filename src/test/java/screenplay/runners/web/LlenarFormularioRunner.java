package screenplay.runners.web;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feature/web/LlenarFormulario.feature",
        glue = "screenplay.steps.web")

public class LlenarFormularioRunner {
}
