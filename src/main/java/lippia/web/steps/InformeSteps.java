package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
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

    @And("elijo la opcion Guardar como PDF")
    public void elijoLaOpcionGuardarComoPDF() throws InterruptedException {
        InformeServices.convertToPDF();
    }

    @Then("se muestra una ventana de carga que exporta a PDF")
    public void seMuestraUnaVentanaDeCargaQueExportaAPDF() {
        InformeServices.validatePDF();
    }
}
