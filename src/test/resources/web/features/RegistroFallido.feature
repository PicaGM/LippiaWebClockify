@Registro @Regression
Feature: Intento de registro con fallos en la pagina de Clockify

  Background:
    Given estoy en la URL "https://app.clockify.me/es/signup"

  @RegistroSinCondiciones @Smoke
  Scenario: Intentar registrarse sin aceptar las Condiciones de uso
    When escribo mi mail
    And no acepto las "Condiciones de uso"
    Then no se me permite clickear el boton Continuar con correo electronico

  @RegistroNoValido @Smoke
  Scenario: Intentar registrarse con un mail con caracteres no validos
    When escribo el mail "pepito"
    And acepto las "Condiciones de uso"
    Then se muestra el mensaje "Formato de correo electrónico no válido"

  @RegistroConCodigoInvalido @Ignore
  Scenario: Intentar registrarse con un codigo de mail no valido
    When escribo el mail "pepito@gmail.com"
    And acepto las "Condiciones de uso"
    And hago click en el boton Continuar con correo electronico
    And relleno el codigo del correo electronico con una cifra incorrecta
    Then se muestra el mensaje "Ese código no es válido. Inténtalo de nuevo."