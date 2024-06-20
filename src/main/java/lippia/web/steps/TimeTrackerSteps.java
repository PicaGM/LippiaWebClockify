package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import lippia.web.services.ProjectServices;
import lippia.web.services.TimeTrackerServices;

public class TimeTrackerSteps {

    @When("especifico un horario en las casillas")
    public void especificoUnHorarioEnLasCasillas() {
        TimeTrackerServices.timeInput();
    }

    @And("especifico una fecha de trabajo")
    public void especificoUnaFechaDeTrabajo() {
        TimeTrackerServices.dateInput();
    }
}
