package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.TimeTrackerConstants;

public class TimeTrackerServices {

    public static void timeInput() {
        WebActionManager.waitVisibility(TimeTrackerConstants.TIME_INPUT, "1");
        WebActionManager.getElement(TimeTrackerConstants.TIME_INPUT,"1").click();
        WebActionManager.setInput(TimeTrackerConstants.TIME_INPUT,"1630","1");
        WebActionManager.getElement(TimeTrackerConstants.TIME_INPUT,"2").click();
        WebActionManager.setInput(TimeTrackerConstants.TIME_INPUT,"2230",true,"2");
    }

    public static void dateInput() {
        WebActionManager.waitClickable(TimeTrackerConstants.DATE_DROPDOWN).click();
        WebActionManager.click(TimeTrackerConstants.DATE_SELECT, "16");
    }
}
