package co.com.sura.cotizador.test.task;

import co.com.sura.cotizador.test.model.web.Usuario;
import co.com.sura.cotizador.test.user_interface.PaginaLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import co.com.sura.cotizador.test.user_interface.PaginaLoginPage.*;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

public class Loguearse implements Task {


    private Usuario usuario;
    PaginaLoginPage pagina = new PaginaLoginPage();

    public Loguearse(Usuario usuario){
        this.usuario = usuario;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(pagina));
        actor.attemptsTo(Click.on(PaginaLoginPage.EMPLEADO));
        actor.attemptsTo(Enter.theValue(usuario.getUsuario()).into(PaginaLoginPage.USUARIO));
        actor.attemptsTo(Enter.theValue(usuario.getContrasena()).into(PaginaLoginPage.CONTRASENA));
        actor.attemptsTo(Click.on(PaginaLoginPage.BTN_INICIAR_SESION));


    }

    public static Loguearse con(Usuario usuario){
        return Tasks.instrumented(Loguearse.class, usuario);
    }
}

