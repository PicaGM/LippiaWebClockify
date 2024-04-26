package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.LoginServices;
import lippia.web.services.UtilsServices;

public class LoginSteps {
    @Given("estoy en la URL (.*)")
    public void estoyEnLaURL(String urlClockify) {
        LoginServices.urlClockify();
    }

    @When("hago click en el boton (.*)")
    public void hagoClickEnElBotonIniciarSesionManualmente(String button) {
        UtilsServices.clickButton(button);
    }

    @And("escribo mi mail (.*) y contraseña (.*)")
    public void escriboMiMailYContrasena(String mail, String pass) {
        LoginServices.login(mail, pass);
    }

    @Then("se inicia sesion con mi correo")
    public void seIniciaSesionConMiCorreo() {
        LoginServices.verifyProfile();
    }

    @When("escribo mi correo electronico (.*)")
    public void escriboMiCorreoElectronico(String email) {
        LoginServices.mailInput(email);
    }

    @Then("se muestra el mensaje (.*)")
    public void puedoComprobarElMensaje(String verifyMSJ) {

    }

    @Then("salgo de mi cuenta y vuelvo a la pagina de login")
    public void salgoDeMiCuentaYVuelvoALaPaginaDeLogin() {
        LoginServices.verifyLogout();
    }
}
