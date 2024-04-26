@Registro @Ignore
Feature: Registro de usuario en Clockify

  Background:
    Given estoy en la URL "https://app.clockify.me/es/signup"
    And acepto las "Condiciones de uso"

  @RegistroConMail @Ignore
  Scenario: Registrarse exitosamente con un mail
    When escribo mi mail "iagustinmahona@gmail.com"
    And hago click en el boton CONTINUAR CON CORREO ELECTRONICO
    Then puedo acceder usando el codigo de mi mail

  @RegistroConGoogle @Ignore
  Scenario: Registrarse con cuenta de Google
    When hago click en el boton Continuar con Google
    And selecciono mi cuenta de Google
    And relleno el espacio con el codigo recibido en mi mail
    Then mi cuenta se crea correctamente