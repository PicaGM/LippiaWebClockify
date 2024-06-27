@TimeTracker @Regression
Feature: Comprobar el correcto funcionamiento del Time Tracker de Clockify

  Background:
    Given estoy en Clockify con mi sesion iniciada

  @TimeEntry @Smoke
  Scenario Outline: Registro de horas de Clockify
    When escribo un <horarioInicial> y <horarioFinal> en las casillas
    And elijo una <fecha> de trabajo
    And hago click en el dropdown Proyecto
    And selecciono un <proyecto>
    And especifico <descripcion> y <tag>
    And hago click en el boton Añadir
    Then se muestra el mensaje Se ha creado la entrada de tiempo

  Examples:
    | horarioInicial | horarioFinal | fecha | proyecto | descripcion   | tag        |
    | 1600           | 1935         | 23    | 3        | primerPrueba  | Importante |
    | 1125           | 1530         | 16    | 1        | segundaPrueba | prueba     |

  @CancelEntry
  Scenario Outline: Registro de horas cancelado de Clockify
    When selecciono la entrada de temporizador
    And hago click en el dropdown Proyecto
    And selecciono un <proyecto>
    And especifico <descripcion> y <tag>
    And hago click en el boton Iniciar
    And inicio el temporizador pero lo descarto
    Then se muestra el mensaje Temporizador cancelado

  Examples:
    | proyecto | descripcion  | tag    |
    | 1        | tercerPrueba | prueba |

  @EditEntry
  Scenario Outline: Modificar registro de horas de Clockify
    When modifico el <horarioI>, <horarioF>, el <tag>, el <proyecto> y el <nombre>
    Then se muestra el mensaje Descripción actualizada con éxito

  Examples:
    | horarioI | horarioF | tag    | proyecto | nombre      |
    | 1200     | 1430     | prueba | 2        | editProyect |
