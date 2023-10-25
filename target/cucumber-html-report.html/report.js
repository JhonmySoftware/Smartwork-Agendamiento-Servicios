$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/02_Agendar_Servicio.feature");
formatter.feature({
  "name": "Proceso de agendamiento de servicios",
  "description": "",
  "keyword": "Característica",
  "tags": [
    {
      "name": "@CP002_Agendamiento_Servicio"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Agendar una orden de servicio desde el call center con diferentes datos",
  "description": "",
  "keyword": "Esquema del escenario"
});
formatter.step({
  "name": "el usuario realiza una solicitud de agendamiento con los siguientes datos",
  "keyword": "Cuando ",
  "rows": [
    {
      "cells": [
        "Id",
        "IdServicio",
        "IdZona",
        "IdCuadrilla",
        "IdEstado",
        "FechaInicio",
        "FechaFin"
      ]
    },
    {
      "cells": [
        "\u003cId\u003e",
        "\u003cIdServicio\u003e",
        "\u003cIdZona\u003e",
        "\u003cIdCuadrilla\u003e",
        "\u003cIdEstado\u003e",
        "\u003cFechaInicio\u003e",
        "\u003cFechaFin\u003e"
      ]
    }
  ]
});
formatter.step({
  "name": "la orden de servicio debe ser agendada correctamente",
  "keyword": "Entonces "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Ejemplos",
  "rows": [
    {
      "cells": [
        "Id",
        "IdServicio",
        "IdZona",
        "IdCuadrilla",
        "IdEstado",
        "FechaInicio",
        "FechaFin"
      ]
    },
    {
      "cells": [
        "0",
        "1997",
        "94",
        "105",
        "1",
        "2023-10-25 16:00",
        "2023-10-25 16:30"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Antecedentes"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que el usuario tiene acceso al servicio de agendamiento",
  "keyword": "Dado "
});
formatter.match({
  "location": "StepAgendarServicio.queElUsuarioTieneAccesoAlServicioDeAgendamiento()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Agendar una orden de servicio desde el call center con diferentes datos",
  "description": "",
  "keyword": "Esquema del escenario",
  "tags": [
    {
      "name": "@CP002_Agendamiento_Servicio"
    }
  ]
});
formatter.step({
  "name": "el usuario realiza una solicitud de agendamiento con los siguientes datos",
  "rows": [
    {
      "cells": [
        "Id",
        "IdServicio",
        "IdZona",
        "IdCuadrilla",
        "IdEstado",
        "FechaInicio",
        "FechaFin"
      ]
    },
    {
      "cells": [
        "0",
        "1997",
        "94",
        "105",
        "1",
        "2023-10-25 16:00",
        "2023-10-25 16:30"
      ]
    }
  ],
  "keyword": "Cuando "
});
formatter.match({
  "location": "StepAgendarServicio.elUsuarioRealizaUnaSolicitudDeAgendamientoConLosSiguientesDatos(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "la orden de servicio debe ser agendada correctamente",
  "keyword": "Entonces "
});
formatter.match({
  "location": "StepAgendarServicio.laOrdenDeServicioDebeSerAgendadaCorrectamente()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: \nExpected: \u003c200\u003e\n     but: was \u003c404\u003e\r\n\tat net.serenitybdd.screenplay.ErrorTally.throwSummaryExceptionFrom(ErrorTally.java:36)\r\n\tat net.serenitybdd.screenplay.ErrorTally.reportAnyErrors(ErrorTally.java:30)\r\n\tat net.serenitybdd.screenplay.Actor.should(Actor.java:301)\r\n\tat co.com.infotrack.smartwork.agendamiento.definition.agendarservicio.StepAgendarServicio.laOrdenDeServicioDebeSerAgendadaCorrectamente(StepAgendarServicio.java:52)\r\n\tat ✽.la orden de servicio debe ser agendada correctamente(src/test/resources/features/02_Agendar_Servicio.feature:14)\r\n",
  "status": "failed"
});
});