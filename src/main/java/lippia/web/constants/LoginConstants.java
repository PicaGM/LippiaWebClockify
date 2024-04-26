package lippia.web.constants;

public class LoginConstants {
    public static final String EMAIL_INPUT_LOCATOR = "Xpath: //input[@id='email' or @class='cl-form-control ng-tns-c127-2 ng-pristine ng-invalid ng-touched']";
    public static final String PASSWORD_INPUT_LOCATOR = "Xpath: //input[@id='password' or @class='cl-form-control ng-tns-c127-2 ng-pristine ng-invalid ng-touched']";
    public static final String LOGIN_BUTTON = "Xpath: //button[@data-test-id='login-button' or @class='cl-btn cl-btn-block cl-btn-primary ng-tns-c127-2']";
    public static final String MANUAL_LOGIN_BUTTON = "Xpath: //a[@data-test-id='login-manual' or @class='cl-d-block cl-text-center ng-tns-c127-2 ng-star-inserted']";
    public static final String PROFILE_DROPDOWN_BUTTON = "Xpath: //div[@class='cl-dropdown cl-component-divided-left cl-pr-0']";
    public static final String MENSAJE_ERROR_MAIL = "Xpath: //span[@data-test-id='invalid-email' or @class='cl-invalid-feedback cl-block cl-mt-0 ng-tns-c128-9 ng-star-inserted']";
    public static final String EMAIL_CODE_INPUT = "Xpath: //input[@class='cl-verification-code-input cl-p-0 cl-pl-2 cl-form-control ng-touched ng-dirty ng-invalid']";
    public static final String LOGOUT_BUTTON = "Xpath: //a[@class='cl-dropdown-item' and @data-cy='logout']";
}
