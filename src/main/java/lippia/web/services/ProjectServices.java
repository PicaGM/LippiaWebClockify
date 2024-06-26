package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LoginConstants;
import lippia.web.constants.ProjectConstants;
import lippia.web.constants.WorkspaceConstants;

public class ProjectServices {
    public static void loginClockify() throws Exception {
        WebActionManager.navigateTo("https://app.clockify.me/es/login");
        WebActionManager.click(LoginConstants.MANUAL_LOGIN_BUTTON);
        UtilsServices.login();
        WebActionManager.click(LoginConstants.LOGIN_BUTTON);
    }

    public static void newNameInput(String newName) {
        switch (newName) {
            case "Proyecto":
                WebActionManager.setInput(ProjectConstants.PROJECT_NAME_INPUT, newName + UtilsServices.randomName(5));
                break;
            case "Workspace":
                WebActionManager.setInput(WorkspaceConstants.WORKSPACE_NAME_INPUT, newName + UtilsServices.randomName(5));
                break;
            case "NewName":
                WebActionManager.setInput(WorkspaceConstants.WORKSPACE_RENAME_INPUT, newName + UtilsServices.randomName(5), true);
                break;
        }
    }
}
