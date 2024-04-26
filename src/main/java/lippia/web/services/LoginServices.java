package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LoginConstants;
import org.testng.Assert;

public class LoginServices {

    public static void urlClockify() {
        WebActionManager.navigateTo("https://app.clockify.me/es/login");
    }
    public static void login(String mail, String pass) {
        WebActionManager.setInput(LoginConstants.EMAIL_INPUT_LOCATOR, "iagustinmahona@gmail.com");
        WebActionManager.setInput(LoginConstants.PASSWORD_INPUT_LOCATOR, "Crowdar99");
    }
    public static void verifyProfile() {
        WebActionManager.waitVisibility(LoginConstants.PROFILE_DROPDOWN_BUTTON);
        Assert.assertTrue(WebActionManager.isVisible(LoginConstants.PROFILE_DROPDOWN_BUTTON));
    }
    public static void mailInput(String email) {
        WebActionManager.setInput(LoginConstants.EMAIL_INPUT_LOCATOR, email);
    }
    public static void verifyError (String msjError) {
        String Error = WebActionManager.getText(LoginConstants.MENSAJE_ERROR_MAIL);
        Assert.assertEquals(Error, msjError);
    }
    public static void verifyLogout() {
        WebActionManager.waitPresence(LoginConstants.LOGIN_BUTTON);
        Assert.assertTrue(WebActionManager.isPresent(LoginConstants.LOGIN_BUTTON));
    }
}
