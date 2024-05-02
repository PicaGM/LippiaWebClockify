@TimeTracker @Regression
Feature: Comprobar el correcto funcionamiento del Time Tracker de Clockify

  @Smoke
  Scenario: Registro de horas de Clockify
    Given estoy en Clockify con mi sesion iniciada
    When especifico un horario en las casillas
    And especifico una fecha de trabajo
    And hago click en el boton Añadir
    Then se muestra el mensaje Se ha creado la entrada de tiempo