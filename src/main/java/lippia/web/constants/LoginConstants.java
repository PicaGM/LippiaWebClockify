package lippia.web.constants;

public class LoginConstants {
    public static final String EMAIL_INPUT_LOCATOR = "Xpath: //input[@id='email' or @class='cl-form-control ng-tns-c127-2 ng-pristine ng-invalid ng-touched']";
    public static final String PASSWORD_INPUT_LOCATOR = "Xpath: //input[@id='password' or @class='cl-form-control ng-tns-c127-2 ng-pristine ng-invalid ng-touched']";
    public static final String LOGIN_BUTTON = "Xpath: //button[@data-test-id='login-button' or @class='cl-btn cl-btn-block cl-btn-primary ng-tns-c127-2']";
    public static final String MANUAL_LOGIN_BUTTON = "Xpath: //a[@data-test-id='login-manual' or @class='cl-d-block cl-text-center ng-tns-c127-2 ng-star-inserted']";
    public static final String PROFILE_DROPDOWN_BUTTON = "Xpath: //div[@class='cl-dropdown cl-component-divided-left cl-pr-0']";
    public static final String UNIVERSAL_MSJ = "Xpath: //*[text()=' %s ']";
    public static final String LOGOUT_BUTTON = "Xpath: //a[@class='cl-dropdown-item' and @data-cy='logout']";
    public static final String UNIVERSAL_BUTTON_1 = "Xpath: (//*[text()=' %s '])[1]";
    public static final String UNIVERSAL_BUTTON_2 = "Xpath: (//*[text()=' %s '])[2]";
}
