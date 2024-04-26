package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.WorkspaceConstants;

public class WorkspaceServices {
    public static void WorkspaceNameInput(String workspaceName) {
        WebActionManager.setInput(WorkspaceConstants.WORKSPACE_NAME_INPUT, workspaceName);
    }
    public static void WorkspaceDeleteInput(String deleteTxt) {
        WebActionManager.setInput(WorkspaceConstants.DELETE_WORKSPACE_BUTTON, deleteTxt);
    }
}
