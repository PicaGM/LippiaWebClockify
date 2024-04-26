@Login @Regression
Feature: Login fallido en la pagina de Clockify

  Background:
    Given estoy en la URL "https://app.clockify.me/es/login"

  @LoginConCorreoErroneo @Smoke
  Scenario Outline: Inicio de sesion fallido con un correo no valido
    When escribo mi correo electronico <mail>
    And hago click en el boton CONTINUAR CON CORREO ELECTRONICO
    Then se muestra el mensaje <mensaje de error>

    Examples:
      | mail         | mensaje de error                        |
      | pepito@gmail | Formato de correo electrónico no válido |
      | pepitogmail  | Formato de correo electrónico no válido |
      | pepito.com   | Formato de correo electrónico no válido |
      | pepito       | Formato de correo electrónico no válido |

  @LoginConCodigoInvalido @Ignore
  Scenario: Inicio de sesion fallido con un codigo de mail no valido
    When escribo el mail: pepito@gmail.com
    And presiono el boton Continuar con correo electronico
    And relleno el codigo del correo electronico con una cifra incorrecta
    Then se muestra el error: Ese código no es válido. Inténtalo de nuevo.