package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LogoutConstants;

public class LogoutServices {
    public static void clickLogout() {
        WebActionManager.click(LogoutConstants.LOGOUT_BUTTON_LOCATOR);
    }
}
