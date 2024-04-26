package lippia.web.steps;

import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.ProjectServices;
import lippia.web.services.WorkspaceServices;

public class WorkspaceSteps {

    @And("relleno la casilla con el nombre del (.*)")
    public void rellenoLaCasillaConElNombreDelWorkspace(String workspaceName) {
        WorkspaceServices.WorkspaceNameInput(workspaceName);
    }

    @And("modifico la casilla de nombre con uno distinto")
    public void modificoLaCasillaDeNombreConUnoDistinto() {
    }
}
