@Workspace
Feature: Comprobar los posibles errores del apartado de Workspaces de Clockify

  Background:
    Given estoy en la URL "https://app.clockify.me/workspaces"

  @WorkspaceExistente
  Scenario: Intentar crear un Workspace con el nombre de uno ya existente
    When hago click en el boton CREAR NUEVO ESPACIO DE TRABAJO
    And ingreso el nombre "AgusWorkspace"
    Then puedo comprobar el mensaje "Espacio de trabajo con el nombre 'AgusWorkspace' ya existe"