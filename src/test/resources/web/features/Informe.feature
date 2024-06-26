@Informe @Regression
  Feature: Generar un informe de Clockify

    @InformePDF @Smoke
      Scenario Outline: Obtener un informe en PDF con fechas establecidas
      Given estoy en Clockify con mi sesion iniciada
      When voy al apartado de Informes
      And hago click en el boton Esta semana
      And elijo una <fechaInicial> y <fechaFinal>
      And hago click en el dropdown Exportar
      And hago click en el boton Guardar como PDF
      Then se muestra el mensaje Exportando informe PDF

    Examples:
      | fechaInicial | fechaFinal |
      | 11           | 16         |
      | 20           | 23         |