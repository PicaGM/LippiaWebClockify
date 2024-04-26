@Login @Regression
Feature: Login exitoso de la pagina de Clockify

  Background:
    Given estoy en la URL "https://app.clockify.me/es/login"

  @LoginExitoso @Smoke
  Scenario: Iniciar sesion exitosamente con mi correo
    When hago click en el boton Iniciar sesion manualmente
    And escribo mi mail "iagustinmahona@gmail.com" y contraseña "Crowdar99"
    And hago click en el boton CONTINUAR CON CORREO ELECTRONICO
    Then se inicia sesion con mi correo

