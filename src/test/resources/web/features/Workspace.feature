@Workspace @Regression
Feature: Crear un nuevo Worskpace en Clockify

  Background:
    Given estoy en Clockify con mi sesion iniciada
    And hago click en el dropdown Workspaces
    And hago click en el boton Gestionar

  @CrearWorkspaceExitoso @Smoke
  Scenario: Crear un nuevo Worskpace
    When hago click en el boton CREAR NUEVO ESPACIO DE TRABAJO
    And relleno la casilla con el nombre del Workspace
    And hago click en el boton CREAR de Workspace
    Then se muestra el mensaje Se ha creado el espacio de trabajo TP1.

  @EliminarWorkspaceExitoso @Smoke
  Scenario: Eliminar un Workspace
    When hago click en el boton Cruz de un Workspace
    And relleno la casilla de la ventana emergente con DELETE
    And hago click en el boton ELIMINAR espacio de trabajo
    Then se muestra el mensaje "Has salido de este espacio de trabajo"

  @ModificarNombreDeWorkspaceExitoso @Smoke
  Scenario: Modificar el nombre de un Workspace
    When hago click en el boton CONFIGURACION de un Workspace
    And modifico la casilla de nombre con uno distinto
    Then se muestra el mensaje "Se actualizó la configuración del espacio de trabajo"

  @ModificarPrivacidadDeWorkspaceExitoso @Smoke
  Scenario: Modificar la privacidad de un Workspace de publico a privado o vicebersa
    When hago click en el boton CONFIGURACION de un Workspace
    And cambio la opcion de privacidad en el apartado de "Los nuevos proyectos son por defecto"
    Then se muestra el mensaje "Se actualizó la configuración del espacio de trabajo"

  @ModificarElLogotipoExitoso @Ignore
  Scenario: Modificar el logotipo de empresa de un Workspace
    When hago click en el boton CONFIGURACION de un Workspace
    And hago click en el boton SUBIR IMAGEN
    And selecciono una imagen menor a 1mb
    Then se muestra el mensaje "Se actualizó la configuración del espacio de trabajo"
    And la subida de la imagen