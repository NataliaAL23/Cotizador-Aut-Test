package co.com.sura.cotizador.test.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
@DefaultUrl("https://cotizadoreslab.sura.com/#/Inicio")


public class PaginaLoginPage extends PageObject {
    public static final Target EMPLEADO = Target.the("EMPLEADO").locatedBy("//*[@id='ctl00_ContentMain_idTabEmpleado']");
    public static final Target USUARIO = Target.the("USUARIO").locatedBy("//*[@id='suranetName']");
    public static final Target CONTRASENA = Target.the("CONTRASEÑA ").locatedBy("//*[@id='suranetPassword']");
    public static final Target ASESOR = Target.the("ASESOR").locatedBy("//*[@id='ctl00_ContentMain_idTabInternet']");
    public static final Target BTN_INICIAR_SESION = Target.the("INICIAR SESIÓN").locatedBy("//*[@id='session-enterprise']");

}