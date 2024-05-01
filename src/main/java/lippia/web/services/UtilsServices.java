package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LoginConstants;
import lippia.web.constants.ProjectConstants;
import lippia.web.constants.WorkspaceConstants;
import org.testng.Assert;
import java.io.InputStream;
import java.util.Objects;
import java.util.Properties;

public class UtilsServices extends WebActionManager {

    public static void universalButton(String button) {
        //click(LoginConstants.UNIVERSAL_BUTTON_1, String.valueOf(button));

        if (!Objects.equals(button, "Iniciar sesión")) {
            click(LoginConstants.UNIVERSAL_BUTTON_1, button);
        } else if (button.equals("Iniciar sesión")) {
            click(LoginConstants.UNIVERSAL_BUTTON_2, button);
        }
    }

    public static void universalMSJ(String verifyMSJ) {
        String msjText = WebActionManager.getText(LoginConstants.UNIVERSAL_MSJ);
        Assert.assertEquals(msjText, verifyMSJ);
    }

    public static void clickButton(String button) {

        switch (button) {
            case "Iniciar sesion manualmente" :
                click(LoginConstants.MANUAL_LOGIN_BUTTON);
                break;
            case "CONTINUAR CON CORREO ELECTRONICO" :
                click(LoginConstants.LOGIN_BUTTON);
                break;
            case "PROYECTOS" :
                click(ProjectConstants.SIDEBAR_MENU, String.valueOf(4));
                break;
            case "CREAR NUEVO PROYECTO" :
                click(ProjectConstants.NEW_PROJECT_BUTTON, false);
                break;
            case "CREAR" :
                click(ProjectConstants.CREATE_PROJECT_BUTTON);
                break;
            case "CREAR de Workspace" :
                click(WorkspaceConstants.CREATE_WORKSPACE_BUTTON);
                break;
            case "ARCHIVAR" :
                click(ProjectConstants.ARCHIVE_PROJECT_BUTTON);
                break;
            case "ARCHIVAR de la ventana emergente" :
                click(ProjectConstants.ARCHIVE_POPOUT_BUTTON);
                break;
            case "ELIMINAR" :
                click(ProjectConstants.DELETE_BUTTON);
                break;
            case "ELIMINAR en la ventana emergente" :
                click(ProjectConstants.DELETE_POPUP_BUTTON);
                break;
            case "Gestionar" :
                click(WorkspaceConstants.WORKSPACE_GESTION_BUTTON);
                break;
            case "CREAR NUEVO ESPACIO DE TRABAJO" :
                click(WorkspaceConstants.NEW_WORKSPACE_BUTTON, false);
                break;
            case "Cerrar sesión" :
                click(LoginConstants.LOGOUT_BUTTON);
                break;
            case "ELIMINAR espacio de trabajo" :
                click(WorkspaceConstants.DELETE_WORKSPACE_BUTTON);
                break;
            case "Cruz de un Workspace" :
                click(WorkspaceConstants.WORKSPACE_CROSS_BUTTON);
                break;
            case "CONFIGURACION de un Workspace" :
                click(WorkspaceConstants.WORKSPACE_CONFIG_BUTTON, String.valueOf(2));
                break;
        }
    }

    public static void clickDropdown(String dropdownButton) {

        switch (dropdownButton) {
            case "Opciones de proyecto" :
                click(ProjectConstants.PROJECT_OPTIONS_BUTTON);
                break;
            case "Workspaces" :
                click(WorkspaceConstants.DROPDOWN_WORKSPACE_BUTTON);
                break;
            case "Perfil" :
                click(LoginConstants.PROFILE_DROPDOWN_BUTTON);
                break;
        }
    }

    public static void clickPopupButton(String popupButton) {

        switch (popupButton) {
            case "ARCHIVAR" :
                click(ProjectConstants.ARCHIVE_POPOUT_BUTTON);
                break;
            case "ELIMINAR" :
                click(ProjectConstants.DELETE_POPUP_BUTTON, false);
                break;
        }
    }

    public static void login(String username, String password) throws Exception{
        Properties config = new Properties();
        InputStream input = null;

        try {
            //input = getClass().getClassLoader().getResourceAsStream("config.properties");

            config.load(input);

            username = config.getProperty("clocky.username");
            password = config.getProperty("clocky.password");

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
}
