@Proyecto @Regression
Feature: Comprobar el correcto funcionamiento del apartado proyectos de Clockify

  @CrearUnNuevoProyectoExitoso @Smoke
  Scenario: Crear un nuevo proyecto de Clockify
    Given estoy en Clockify con mi sesion iniciada
    When hago click en el boton Proyectos
    And hago click en el boton Crear nuevo
    And relleno con el nombre Proyecto
    And hago click en el boton Crear
    Then se muestra el mensaje Se ha creado el proyecto