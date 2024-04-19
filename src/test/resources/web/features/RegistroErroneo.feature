@Registro
Feature: Intento de registro con fallos en la pagina de Clockify

  Background:
    Given estoy en la URL "https://app.clockify.me/es/signup"

  @RegistroSinCondiciones
  Scenario: Intentar registrarse sin aceptar las Condiciones de uso
    When escribo mi mail
    And no acepto las "Condiciones de uso"
    Then puedo comprobar que no se me permite clickear el boton Continuar con correo electronico

  @RegistroNoValido
  Scenario: Intentar registrarse con un mail con caracteres no validos
    When escribo el mail "pepito"
    And acepto las "Condiciones de uso"
    Then puedo comprobar el mensaje "Formato de correo electrónico no válido"

  @RegistroConCodigoInvalido
  Scenario: Intentar registrarse con un codigo de mail no valido
    When escribo el mail "pepito@gmail.com"
    And acepto las "Condiciones de uso"
    And hago click en el boton Continuar con correo electronico
    And relleno el codigo del correo electronico con una cifra incorrecta
    Then puedo comprobar el mensaje "Ese código no es válido. Inténtalo de nuevo."