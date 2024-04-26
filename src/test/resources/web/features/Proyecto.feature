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

  @EliminarProyecto @Smoke
  Scenario: Eliminar un proyecto ya creado
    When hago click en el boton PROYECTOS
    And hago click en el dropdown Opciones de proyecto
    And hago click en el boton ARCHIVAR
    And nuevamente hago click en el boton ARCHIVAR emergente
    And hago click en el dropdown Opciones de proyecto
    And hago click en el boton ELIMINAR
    And nuevamente hago click en el boton ELIMINAR emergente
    Then el proyecto se elimina correctamente

  @ModificarNombreDeProyecto @Smoke
  Scenario: Modificar el nombre de un proyecto de Clockify
    When hago click en el boton CONFIGURACION
    And modifico la casilla de nombre con uno distinto
    Then se muestra el mensaje "Proyecto actualizado con exito"

  @ModificarColorDeProyecto @Smoke
  Scenario: Modificar el color de un proyecto de Clockify
    When hago click en el boton CONFIGURACION
    And hago click en el dropdown colores
    And elijo uno de los colores disponibles
    Then se muestra el mensaje "Proyecto actualizado con exito"

  @AgregarNotaAlProyecto @Smoke
  Scenario: Agregar una nota a un proyecto de Clockify
    When hago click en el boton NOTA
    And lleno el cuadro de Nota
    Then se muestra el mensaje "Proyecto actualizado con exito"

  @ModificarVisibilidadDeProyecto @Smoke
  Scenario: modificar la visibilidad de un proyecto de Clockify
    When hago click en el boton ACCESO
    And selecciono un tipo de visibilidad
    Then se muestra el mensaje "Proyecto actualizado con exito"