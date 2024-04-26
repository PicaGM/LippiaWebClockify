package lippia.web.steps;

import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.constants.ProjectConstants;
import lippia.web.services.LoginServices;
import lippia.web.services.ProjectServices;
import lippia.web.services.UtilsServices;

public class ProjectSteps {
    @Given("estoy en Clockify con mi sesion iniciada")
    public void estoyEnClockifyConMiSesionIniciada() {
        ProjectServices.loginClockify();
    }

    @And("relleno con el nombre del proyecto (.*)")
    public void rellenoConElNombreDelProyecto(String projectName) {
        ProjectServices.projectNameInput(projectName);
    }

    @Then("el proyecto se crea correctamente")
    public void elProyectoSeCreaCorrectamente() {
        ProjectServices.verifyCreateProject();
    }

    @When("hago click en el dropdown (.*)")
    public void hagoClickEnElDropdownDeOpcionesDeProyecto(String dropdownButton) {
        UtilsServices.clickDropdown(dropdownButton);
    }

    @Then("el proyecto se elimina correctamente")
    public void elProyectoSeEliminaCorrectamente() {
        ProjectServices.verifyDeletedProject();
    }

    @And("nuevamente hago click en el boton (.*) emergente")
    public void nuevamenteHagoClickEnElBotonARCHIVAREmergente(String popupButton) {
        UtilsServices.clickPopupButton(popupButton);
    }
}
