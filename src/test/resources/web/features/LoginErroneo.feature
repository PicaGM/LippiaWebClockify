@Login
Feature: Intento de login con fallos en la pagina de Clockify

  Background:
    Given estoy en la URL "https://app.clockify.me/es/login"

  @LoginConCorreoErroneo
  Scenario Outline: Intento de inicio de sesion con un correo no valido
    When escribo mi correo electronico <mail>
    And presiono el boton Continuar con correo electronico
    Then puedo comprobar el mensaje de error "Formato de correo electrónico no válido"

    Examples:
      | mail         |
      | pepito@gmail |
      | pepitogmail  |
      | pepito.com   |
      | pepito       |

  @LoginConCodigoInvalido
  Scenario: Intento de inicio de sesion con un codigo de mail no valido
    When escribo el mail "pepito@gmail.com"
    And presiono el boton Continuar con correo electronico
    And relleno el codigo del correo electronico con una cifra incorrecta
    Then puedo comprobar el mensaje "Ese código no es válido. Inténtalo de nuevo."