@Workspace @Regression
Feature: Crear un nuevo Worskpace en Clockify

  Background:
    Given estoy en Clockify con mi sesion iniciada
    And hago click en el dropdown Workspaces
    And hago click en el boton Gestionar espacios de trabajo

  @CrearWorkspaceExitoso @Smoke
  Scenario: Crear un nuevo Worskpace
    When hago click en el boton Crear nuevo
    And relleno con el nombre Workspace
    And hago click en el boton Crear
    Then se muestra el mensaje Se ha creado el espacio de trabajo

  @RenombrarWorkspace @Smoke
  Scenario: Cambiar el nombre de un Workspace
    When hago click en el boton Configuración
    And relleno con el nombre NewName
    And hago click en el boton Actualizar
    Then se muestra el mensaje Se actualizó la configuración del espacio de trabajo