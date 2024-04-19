@Workspace
Feature: Modificar un Workspace de Clockify

  Background:
    Given estoy en la URL "https://app.clockify.me/workspaces"
    When hago click en el boton CONFIGURACION de un Workspace

  @ModificarNombreDeWorkspace
  Scenario: Modificar el nombre de un Workspace
    When modifico la casilla de nombre con uno distinto
    Then puedo comprobar el mensaje "Se actualizó la configuración del espacio de trabajo"

  @ModificarPrivacidadDeWorkspace
  Scenario: Modificar la privacidad de un Workspace de publico a privado o vicebersa
    When cambio la opcion de privacidad en el apartado de "Los nuevos proyectos son por defecto"
    Then puedo comprobar el mensaje "Se actualizó la configuración del espacio de trabajo"

  @ModificarElLogotipo
  Scenario: Modificar el logotipo de empresa de un Workspace
    When hago click en el boton SUBIR IMAGEN
    And selecciono una imagen menor a 1mb
    Then puedo combrobar el mensaje "Se actualizó la configuración del espacio de trabajo"
    And la subida de la imagen