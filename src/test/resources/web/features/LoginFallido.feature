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