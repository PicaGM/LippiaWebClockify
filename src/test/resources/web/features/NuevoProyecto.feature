@Proyecto
Feature: comprobar el correcto funcionamiento del apartado proyectos de Clockify

  @CrearUnNuevoProyecto
  Scenario: crear un nuevo proyecto de Clockify
    Given estoy en la URL "https://app.clockify.me/projects"
    When hago click en el boton CREAR NUEVO PROYECTO
    And relleno con el nombre del proyecto "Proyecto1"
    And hago click en el boton CREAR
    Then puedo comprobar que mi proyecto se ha creado correctamente