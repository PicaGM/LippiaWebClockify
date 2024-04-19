@Login
Feature: Login de la pagina de Clockify

  Background:
    Given estoy en la URL "https://app.clockify.me/es/login"

  @LoginExitoso
  Scenario: Iniciar sesion exitosamente con mi correo
    When escribo mi mail
    And hago click en el boton Iniciar sesion
    And lleno la casilla con el codigo que se envio a mi mail
    Then puedo comprobar que se inicio sesion con mi correo

  @LoginConGoogle
  Scenario: Iniciar sesion exitosamente con Google
    When hago click en el boton Continuar con Google
    And elijo el correo a utilizar
    Then puedo verificar que se inicio sesion con mi correo

  @LoginManual
  Scenario: Iniciar sesion manualmente
    When hago click en el boton Iniciar sesion manualmente
    And lleno las casillas con mi correo y contraseña
    And hago clik en el boton Iniciar sesion
    Then puedo comprobar que se inicio sesion con mi correo

