@Proyecto
Feature: Modificar un proyecto de Clockify

  Background:
    Given estoy en la URL "https://app.clockify.me/projects" con un proyecto creado
    When hago click sobre un proyecto de Clockify

  @ModificarNombreDeProyecto
  Scenario: Modificar el nombre de un proyecto de Clockify
    When hago click en CONFIGURACION
    And modifico la casilla de nombre con uno distinto
    Then puedo comprobar el mensaje "Proyecto actualizado con exito"

  @ModificarColorDeProyecto
  Scenario: Modificar el color de un proyecto de Clockify
    When hago click en CONFIGURACION
    And hago click en el Dropdown de colores
    And elijo uno de los colores disponibles
    Then puedo comprobar el mensaje "Proyecto actualizado con exito"

  @AgregarNotaAlProyecto
  Scenario: Agregar una nota a un proyecto de Clockify
    When hago click en NOTA
    And lleno el cuadro de Nota
    Then puedo comprobar el mensaje "Proyecto actualizado con exito"

  @ModificarVisibilidadDeProyecto
  Scenario: modificar la visibilidad de un proyecto de Clockify
    When hago click en ACCESO
    And selecciono un tipo de visibilidad
    Then puedo comprobar el mensaje "Proyecto actualizado con exito"