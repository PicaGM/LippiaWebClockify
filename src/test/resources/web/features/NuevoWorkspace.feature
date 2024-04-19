@Workspace
Feature: Crear un nuevo Worskpace en Clockify

  @CrearWorkspace
  Scenario: Crear un nuevo Worskpace
    Given estoy en la URL "https://app.clockify.me/workspaces"
    When hago click en el boton CREAR NUEVO ESPACIO DE TRABAJO
    And relleno la casilla con el nombre del Workspace "TP1"
    And hago click en el boton CREAR
    Then puedo comprobar el mensaje "Se ha creado el espacio de trabajo TP1."