@Workspace @Regression
Feature: Crear un nuevo Worskpace en Clockify

  Background:
    Given estoy en Clockify con mi sesion iniciada
    When hago click en el dropdown Workspaces
    And hago click en el boton Gestionar

  @CrearWorkspaceExitoso @Smoke
  Scenario: Crear un nuevo Worskpace
    When hago click en el boton CREAR NUEVO ESPACIO DE TRABAJO
    And relleno la casilla con el nombre del Workspace
    And hago click en el boton CREAR de Workspace
    Then se muestra el mensaje Se ha creado el espacio de trabajo TP1.

  @CrearWorkspaceFallido @Smoke
  Scenario: Creacion de un Workspace con el nombre de uno ya existente
    When hago click en el boton CREAR NUEVO ESPACIO DE TRABAJO
    And ingreso el nombre "AgusWorkspace"
    Then puedo comprobar el mensaje "Espacio de trabajo con el nombre 'AgusWorkspace' ya existe"