package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LoginConstants;
import lippia.web.constants.ProjectConstants;
import org.testng.Assert;

public class ProjectServices {
    public static void loginClockify() {
        WebActionManager.navigateTo("https://app.clockify.me/es/login");
        WebActionManager.click(LoginConstants.MANUAL_LOGIN_BUTTON);
        WebActionManager.setInput(LoginConstants.EMAIL_INPUT_LOCATOR, "iagustinmahona@gmail.com");
        WebActionManager.setInput(LoginConstants.PASSWORD_INPUT_LOCATOR, "Crowdar99");
        WebActionManager.click(LoginConstants.LOGIN_BUTTON);
    }

    public static void projectNameInput(String projectName) {
        WebActionManager.setInput(ProjectConstants.PROJECT_NAME_INPUT, projectName);
    }

    public static void verifyCreateProject() {
        WebActionManager.waitVisibility(ProjectConstants.PROYECT_1);
        Assert.assertTrue(WebActionManager.isPresent(ProjectConstants.PROYECT_1));
    }
    public static void verifyDeletedProject() {
        Assert.assertTrue(WebActionManager.isVisible(ProjectConstants.PROJECT_UPDATE_MSJ));
    }
}
