package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.*;
import org.testng.Assert;
import java.io.InputStream;
import java.util.Objects;
import java.util.Properties;

public class UtilsServices extends WebActionManager {

    public static void universalButton(String button) {
        if (!Objects.equals(button, "Iniciar sesión")) {
            waitClickable(LoginConstants.UNIVERSAL_BUTTON_1, button);
            click(LoginConstants.UNIVERSAL_BUTTON_1, false, button);
        } else if (button.equals("Iniciar sesión")) {
            waitClickable(LoginConstants.UNIVERSAL_BUTTON_2, button);
            click(LoginConstants.UNIVERSAL_BUTTON_2, button);
        }
    }

    public static void universalMSJ(String verifyMSJ) {
        if (!Objects.equals(verifyMSJ, "Formato de correo electrónico no válido")) {
            waitPresence(ProjectConstants.PROJECT_UPDATE_MSJ);
            Assert.assertTrue(WebActionManager.isPresent(ProjectConstants.PROJECT_UPDATE_MSJ));
        } else if (verifyMSJ.equals("Formato de correo electrónico no válido")) {
            String msjText = WebActionManager.getText(LoginConstants.UNIVERSAL_MSJ, String.valueOf(verifyMSJ));
            Assert.assertEquals(msjText, verifyMSJ);
        }
    }

    public static void clickDropdown(String dropdownButton) {
        switch (dropdownButton) {
            case "Opciones de proyecto" :
                click(ProjectConstants.PROJECT_OPTIONS_BUTTON, false);
                break;
            case "Workspaces" :
                waitClickable(WorkspaceConstants.DROPDOWN_WORKSPACE_BUTTON);
                click(WorkspaceConstants.DROPDOWN_WORKSPACE_BUTTON, false);
                break;
            case "Perfil" :
                click(LoginConstants.PROFILE_DROPDOWN_BUTTON, false);
                break;
            case "Exportar" :
                click(InformeConstants.EXPORT_DROPDOWN_LOCATOR, false);
        }
    }

    public static void login() throws Exception{
        Properties config = new Properties();
        InputStream input = null;

        try {
            input = UtilsServices.class.getClassLoader().getResourceAsStream("config.properties");

            config.load(input);

            String mail = config.getProperty("clocky.mail");
            String password = config.getProperty("clocky.password");

            setInput(LoginConstants.EMAIL_INPUT_LOCATOR, mail);
            setInput(LoginConstants.PASSWORD_INPUT_LOCATOR, password);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static String randomName(int charAmount) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder randomString = new StringBuilder();
        for (int i = 0; i < charAmount; i++) {
            int randomIndex = (int) (Math.random() * characters.length());
            randomString.append(characters.charAt(randomIndex));
        }
        return String.valueOf(randomString);
    }

}
