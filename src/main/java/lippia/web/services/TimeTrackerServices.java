package lippia.web.services;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import com.crowdar.driver.DriverManager;
import com.google.api.Page;
import jdk.javadoc.internal.doclets.formats.html.Navigation;
import lippia.web.constants.TimeTrackerConstants;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.reporters.jq.NavigatorPanel;

import java.awt.*;
import java.util.NavigableMap;

public class TimeTrackerServices {

    public static void timeInput(String FirstInput, String SecondInput) {
        WebActionManager.waitVisibility(TimeTrackerConstants.TIME_INPUT, "1");
        WebActionManager.getElement(TimeTrackerConstants.TIME_INPUT,"1").click();
        WebActionManager.setInput(TimeTrackerConstants.TIME_INPUT,FirstInput,"1");
        WebActionManager.getElement(TimeTrackerConstants.TIME_INPUT,"2").click();
        WebActionManager.setInput(TimeTrackerConstants.TIME_INPUT,SecondInput,true,"2");
    }

    public static void dateInput(String Date) {
        WebActionManager.waitClickable(TimeTrackerConstants.DATE_DROPDOWN).click();
        WebActionManager.click(TimeTrackerConstants.DATE_SELECT, Date);
    }

    public static void descriptionSet(String Description) {
        WebActionManager.setInput(TimeTrackerConstants.DESCRIPTION_INPUT_LOCATOR, Description);
    }

    public static void proyectSelector(String ProyectSelect) {
        WebActionManager.click(TimeTrackerConstants.PROYECT_DROPDOWN_LOCATOR);
        WebActionManager.waitClickable(TimeTrackerConstants.PROYECT_SELECT_LOCATOR, ProyectSelect);
        WebActionManager.click(TimeTrackerConstants.PROYECT_SELECT_LOCATOR, false, ProyectSelect);
    }

    public static void tagSelector(String TagSelector) {
        WebActionManager.click(TimeTrackerConstants.TAG_DROPDOWN_LOCATOR);
        WebActionManager.click(TimeTrackerConstants.TAG_SELECT_LOCATOR, TagSelector);
    }

    public static void timerInput(String duracion) {
        WebActionManager.click(TimeTrackerConstants.TIMER_INPUT_LOCATOR);
        WebActionManager.setInput(TimeTrackerConstants.TIMER_INPUT_LOCATOR, duracion);
    }
    public static void timerSelector() {
        WebActionManager.waitClickable(TimeTrackerConstants.TIMER_MODE_LOCATOR);
        WebActionManager.click(TimeTrackerConstants.TIMER_MODE_LOCATOR, false);
    }

    public static void timerCancel() {
        WebActionManager.click(TimeTrackerConstants.SIDEBAR_TIMER_LOCATOR);
        WebActionManager.click(TimeTrackerConstants.DISCARD_TIMER_LOCATOR);
        UtilsServices.universalButton(String.valueOf("Descartar"));
    }

    public static void timerEdit(String horarioI, String horarioF, String tag, String proyecto, String nombre) {
        WebActionManager.setInput(TimeTrackerConstants.EDIT_ENTRY_DESC_LOCATOR, nombre, true);
        WebActionManager.setInput(TimeTrackerConstants.EDIT_TIMER_INPUT, horarioI, "1");
        WebActionManager.setInput(TimeTrackerConstants.EDIT_TIMER_INPUT, horarioF, true, false, "2");
        WebActionManager.waitClickable(TimeTrackerConstants.EDIT_PROYECT_DROPDOWN);
        WebActionManager.click(TimeTrackerConstants.EDIT_PROYECT_DROPDOWN, false);
        WebActionManager.click(TimeTrackerConstants.PROYECT_SELECT_LOCATOR, false, proyecto);
        WebActionManager.click(TimeTrackerConstants.EDIT_TAG_DROPDOWN, false);
        WebActionManager.click(TimeTrackerConstants.TAG_SELECT_LOCATOR,false, tag);
    }
}
