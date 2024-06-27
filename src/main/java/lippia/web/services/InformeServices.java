package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.InformeConstants;
import lippia.web.constants.TimeTrackerConstants;
import org.testng.Assert;

public class InformeServices {
    public static void dateSelector(String fechaInicial, String fechaFinal) {
        WebActionManager.waitClickable(InformeConstants.INF_CALENDAR_DROPDOWN);
        WebActionManager.click(InformeConstants.INF_CALENDAR_DROPDOWN, false);
        WebActionManager.click(TimeTrackerConstants.DATE_SELECT, false, fechaInicial);
        WebActionManager.click(TimeTrackerConstants.DATE_SELECT, false, fechaFinal);
    }

    public static void infButton() {
        WebActionManager.click(InformeConstants.INF_BUTTON_LOCATOR, false);
        WebActionManager.waitVisibility(InformeConstants.GRAPHICS_WINDOW_LOCATOR);
    }

    public static void convertToPDF() {
        WebActionManager.waitClickable(InformeConstants.PDF_BUTTON_LOCATOR);
        WebActionManager.click(InformeConstants.PDF_BUTTON_LOCATOR, false);
    }

    public static void validatePDF() {
        WebActionManager.getFluentWait();
        WebActionManager.waitVisibility(InformeConstants.EXPORT_WINDOW_LOCATOR);
        Assert.assertTrue(WebActionManager.isVisible(InformeConstants.EXPORT_WINDOW_LOCATOR));
        WebActionManager.waitInvisibility(InformeConstants.EXPORT_WINDOW_LOCATOR);
    }
}
