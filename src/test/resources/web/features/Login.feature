@Login @Regression
Feature: Login exitoso de la pagina de Clockify

  Background:
    Given estoy en la URL "https://app.clockify.me/es/login"

  @LoginExitoso @Smoke
  Scenario: Iniciar sesion exitosamente con mi correo
    When hago click en el boton Iniciar sesión manualmente
    And escribo mi mail y contraseña
    And hago click en el boton Iniciar sesión
    Then se inicia sesion con mi correo

  @LoginConCorreoErroneo @Smoke
  Scenario Outline: Inicio de sesion fallido con un correo no valido
    When escribo mi correo electronico <mail>
    Then se muestra el mensaje Formato de correo electrónico no válido

    Examples:
      | mail       |
      | Pepito     |
      | Pepito.com |

