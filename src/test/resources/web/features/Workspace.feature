@Workspace @Regression
Feature: Crear un nuevo Worskpace en Clockify

  @CrearWorkspaceExitoso @Smoke
  Scenario: Crear un nuevo Worskpace
    Given estoy en Clockify con mi sesion iniciada
    When hago click en el dropdown Workspaces
    And hago click en el boton Gestionar
    And hago click en el boton Crear nuevo
    And relleno con el nombre Workspace
    And hago click en el boton Crear
    Then se muestra el mensaje Se ha creado el espacio de trabajo