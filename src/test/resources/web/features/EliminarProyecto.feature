@Proyecto
Feature: Eliminar un proyecto de Clockify

  @EliminarProyecto
  Scenario: Eliminar un proyecto ya creado
    Given estoy en la URL "https://app.clockify.me/projects" con un proyecto creado
    When hago click en el dropdown de opciones
    And hago click en el boton ARCHIVAR
    And nuevamente hago click en el boton ARCHIVAR de la ventana emergente
    And hago click en el dropdown de opciones
    And hago click en el boton ELIMINAR
    And nuevamente hago click en el boton ELIMINAR en la ventana emergente
    Then puedo comprobar que el proyecto se elimina correctamente con el mensaje "Proyecto eliminado con exito"