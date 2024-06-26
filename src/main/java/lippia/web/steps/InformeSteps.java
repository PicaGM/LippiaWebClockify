package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import lippia.web.services.InformeServices;
import lippia.web.services.LoginServices;

public class InformeSteps {
    @And("elijo una (.*) y (.*)")
    public void elijoUnaY(String fechaInicial, String fechaFinal) {
        InformeServices.dateSelector(fechaInicial, fechaFinal);
    }

    @When("voy al apartado de Informes")
    public void voyAlApartadoDeInformes() {
        InformeServices.infButton();
    }
}
