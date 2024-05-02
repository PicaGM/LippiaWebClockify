package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import lippia.web.services.ProjectServices;
import lippia.web.services.UtilsServices;

public class ProjectSteps {
    @Given("estoy en Clockify con mi sesion iniciada")
    public void estoyEnClockifyConMiSesionIniciada() throws Exception {
        ProjectServices.loginClockify();
    }

    @And("relleno con el nombre (.*)")
    public void rellenoConElNombreDelProyecto(String newName) {
        ProjectServices.newNameInput(newName);
    }

    @When("hago click en el dropdown (.*)")
    public void hagoClickEnElDropdownDeOpcionesDeProyecto(String dropdownButton) {
        UtilsServices.clickDropdown(dropdownButton);
    }
}
