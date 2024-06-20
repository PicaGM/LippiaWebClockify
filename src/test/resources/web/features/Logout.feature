@Logout @Regression
Feature: Cierre de sesion en Clockify

  @Smoke
  Scenario: Cierre de sesion de cuenta de Clockify
    Given estoy en Clockify con mi sesion iniciada
    When hago click en el dropdown Perfil
    And hago click en el boton Cerrar sesión
    Then salgo de mi cuenta y vuelvo a la pagina de login