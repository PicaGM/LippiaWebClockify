@Registro
Feature: Registro de usuario en Clockify

  Background:
    Given estoy en la URL "https://app.clockify.me/es/signup"
    When acepto las "Condiciones de uso"

  @RegistroConMail
  Scenario: Registrarse exitosamente con un mail
    When escribo mi mail
    And hago click en el boton Continuar con correo electronico
    And relleno el espacio con el codigo recibido en mi mail
    Then puedo comprobar que mi cuenta fue creada

  @RegistroConGoogle
  Scenario: Registrarse con cuenta de Google
    When hago click en el boton Continuar con Google
    And selecciono mi cuenta de Google
    And relleno el espacio con el codigo recibido en mi mail
    Then puedo comprobar que mi cuenta fue creada