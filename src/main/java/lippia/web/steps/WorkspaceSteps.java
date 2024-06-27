package lippia.web.steps;

import io.cucumber.java.Before;
import lippia.web.services.ApiHelperService;

public class WorkspaceSteps {
    @Before(value = "@RenombrarWorkspace")
    public void createWorkspace() {
        ApiHelperService.createWorkspace();
    }
}
