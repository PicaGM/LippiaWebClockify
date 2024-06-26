package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.InformeConstants;
import lippia.web.constants.TimeTrackerConstants;

public class InformeServices {
    public static void dateSelector(String fechaInicial, String fechaFinal) {
        //WebActionManager.waitClickable(InformeConstants.INF_CALENDAR_DROPDOWN);
        WebActionManager.click(InformeConstants.INF_CALENDAR_DROPDOWN, false);
        WebActionManager.click(TimeTrackerConstants.DATE_SELECT, false, fechaInicial);
        WebActionManager.click(TimeTrackerConstants.DATE_SELECT, false, fechaFinal);
    }

    public static void infButton() {
        WebActionManager.click(InformeConstants.INF_BUTTON_LOCATOR, false);
    }
}
