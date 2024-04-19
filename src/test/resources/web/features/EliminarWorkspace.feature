@Workspace
Feature: Eliminar un Workspace de Clockify

  @EliminarWorkspace
  Scenario: Eliminar un Workspace
    Given estoy en la URL "https://app.clockify.me/workspaces"
    When hago click en la cruz de un Workspace
    And relleno la casilla de la ventana emergente con "DELETE"
    And presiono el boton ELIMINAR espacio de trabajo
    Then puedo comprobar el mensaje "Has salido de este espacio de trabajo"