package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.ProjectServices;
import lippia.web.services.TimeTrackerServices;

import java.sql.Time;

public class TimeTrackerSteps {

    @When("escribo un (.*) y (.*) en las casillas")
    public void especificoUnHorarioEnLasCasillas(String FirstInput, String SecondInput) {
        TimeTrackerServices.timeInput(SecondInput, FirstInput);
    }

    @And("elijo una (.*) de trabajo")
    public void elijoUnaFechaDeTrabajo(String Date) {
        TimeTrackerServices.dateInput(Date);
    }

    @Then("los datos no se guardan y se cancela la entrada")
    public void losDatosNoSeGuardanYSeCancelaLaEntrada() {
    }

    @And("selecciono un (.*)")
    public void seleccionoUn(String ProyectSelect) {
        TimeTrackerServices.proyectSelector(ProyectSelect);
    }

    @And("especifico (.*) y (.*)")
    public void especificoY(String ProyectDesc, String ProyectTag) {
        TimeTrackerServices.descriptionSet(ProyectDesc);
        TimeTrackerServices.tagSelector(ProyectTag);
    }

    @When("modifico el (.*), (.*), el (.*), el (.*) y el (.*)")
    public void modificoElHorarioLaFechaElTagElProyectoYElNombre(String horarioI, String horarioF, String tag, String proyecto, String nombre) {
        TimeTrackerServices.timerEdit(horarioI, horarioF, tag, proyecto, nombre);
    }

    @When("selecciono la entrada de temporizador")
    public void seleccionoLaEntradaDeTemporizador() {
        TimeTrackerServices.timerSelector();
    }

    @And("especifico la (.*) del temporizador")
    public void especificoLaDuracionDelTemporizador(String duracion) {
        TimeTrackerServices.timerInput(duracion);
    }

    @And("inicio el temporizador pero lo descarto")
    public void inicioElTemporizadorPeroLoDescarto() {
        TimeTrackerServices.timerCancel();
    }
}
