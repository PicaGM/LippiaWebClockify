package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import lippia.web.services.LogoutServices;
import lippia.web.services.UtilsServices;

public class LogoutSteps {
    @And("hago click en Cerrar sesión")
    public void hagoClickEnCerrarSesion() {
        LogoutServices.clickLogout();
    }
}
