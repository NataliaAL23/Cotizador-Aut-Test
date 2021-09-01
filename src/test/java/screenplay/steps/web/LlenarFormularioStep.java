package screenplay.steps.web;

import co.com.sura.cotizador.test.model.web.Usuario;
import co.com.sura.cotizador.test.task.Loguearse;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Dado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class LlenarFormularioStep {

    private Actor actor;
    private WebDriver navegador;


    @Dado("que el usuario se loguea en el cotizador con las credenciales")
    public void queElUsuarioSeLogueaEnElCotizadorConLasCredenciales(DataTable table) {
        List<Usuario> usuarios = new ArrayList<>();
        usuarios = table.asList(Usuario.class);
        actor= Actor.named("Maria");
        actor.whoCan(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Loguearse.con(usuarios.get(0)));


    }
}
