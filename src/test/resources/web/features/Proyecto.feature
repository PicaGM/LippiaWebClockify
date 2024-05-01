@Proyecto @Regression
Feature: Comprobar el correcto funcionamiento del apartado proyectos de Clockify

  Background:
    Given estoy en Clockify con mi sesion iniciada

  @CrearUnNuevoProyectoExitoso @Smoke
  Scenario: Crear un nuevo proyecto de Clockify
    When hago click en el boton PROYECTOS
    And hago click en el boton CREAR NUEVO PROYECTO
    And relleno con el nombre del proyecto "Proyecto1"
    And hago click en el boton CREAR
    Then el proyecto se crea correctamente

  @ModificarNombreDeProyectoExitoso @Smoke
  Scenario: Modificar el nombre de un proyecto de Clockify
    When hago click en el boton CONFIGURACION
    And modifico la casilla de nombre con uno distinto
    Then se muestra el mensaje "Proyecto actualizado con exito"