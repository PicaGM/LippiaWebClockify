@Login @Regression
Feature: Login exitoso de la pagina de Clockify

  Background:
    Given estoy en la URL "https://app.clockify.me/es/login"

  @LoginExitoso @Smoke
  Scenario: Iniciar sesion exitosamente con mi correo
    When hago click en el boton Iniciar sesión manualmente
    And escribo mi mail "iagustinmahona@gmail.com" y contraseña "Crowdar99"
    And hago click en el boton Iniciar sesión
    Then se inicia sesion con mi correo

  @LoginConCorreoErroneo @Smoke
  Scenario Outline: Inicio de sesion fallido con un correo no valido
    When escribo mi correo electronico <mail>
    And hago click en el boton Continuar con correo electrónico
    Then se muestra el mensaje <mensaje de error>

    Examples:
      | mail         | mensaje de error                        |
      | pepito@gmail | Formato de correo electrónico no válido |
      | pepitogmail  | Formato de correo electrónico no válido |
      | pepito.com   | Formato de correo electrónico no válido |
      | pepito       | Formato de correo electrónico no válido |

