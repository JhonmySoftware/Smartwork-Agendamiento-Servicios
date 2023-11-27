$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/01_Crear_OrdenServicio.feature");
formatter.feature({
  "name": "Proceso de agendamiento de servicios",
  "description": "",
  "keyword": "Característica",
  "tags": [
    {
      "name": "@CP001_Creacion_OrdenServicio"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Crear una orden de servicio desde el call center",
  "description": "",
  "keyword": "Esquema del escenario"
});
formatter.step({
  "name": "que en el call center se desea crear una orden de servicio con los siguientes datos",
  "keyword": "Dado ",
  "rows": [
    {
      "cells": [
        "Tipo Identificacion",
        "Identificacion",
        "Codigo cliente",
        "Nombre",
        "Correo electronico",
        "Celular",
        "Ubicacion",
        "Complemento",
        "Ciudad",
        "Departamento"
      ]
    },
    {
      "cells": [
        "\u003cTipoID\u003e",
        "\u003cIdentificacion\u003e",
        "\u003cCodigoCliente\u003e",
        "\u003cNombre\u003e",
        "\u003cEmail\u003e",
        "\u003cCelular\u003e",
        "\u003cUbicacion\u003e",
        "\u003cComplemento\u003e",
        "\u003cCiudad\u003e",
        "\u003cDepartamento\u003e"
      ]
    }
  ]
});
formatter.step({
  "name": "se ingresan los siguientes datos del servicio",
  "keyword": "Y ",
  "rows": [
    {
      "cells": [
        "Codigo del servicio",
        "Clase servicio",
        "Tipo Servicio",
        "Prioridad",
        "Hora inicio",
        "Hora fin",
        "Zonas",
        "Observacion"
      ]
    },
    {
      "cells": [
        "\u003cCodigoServicio\u003e",
        "\u003cClaseServicio\u003e",
        "\u003cTipoServicio\u003e",
        "\u003cPrioridad\u003e",
        "\u003cHoraInicio\u003e",
        "\u003cHoraFin\u003e",
        "\u003cZonas\u003e",
        "\u003cObservacion\u003e"
      ]
    }
  ]
});
formatter.step({
  "name": "se ingresan los siguientes datos del producto",
  "keyword": "Y ",
  "rows": [
    {
      "cells": [
        "Serial",
        "Productos",
        "Falla"
      ]
    },
    {
      "cells": [
        "\u003cSerial\u003e",
        "\u003cProductos\u003e",
        "\u003cFalla\u003e"
      ]
    }
  ]
});
formatter.step({
  "name": "se crea la orden de servicio",
  "keyword": "Cuando "
});
formatter.step({
  "name": "se verifica que la orden de servicio se ha creado correctamente",
  "keyword": "Entonces "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Ejemplos",
  "rows": [
    {
      "cells": [
        "TipoID",
        "Identificacion",
        "CodigoCliente",
        "Nombre",
        "Email",
        "Celular",
        "CodigoServicio",
        "ClaseServicio",
        "TipoServicio",
        "Prioridad",
        "HoraInicio",
        "HoraFin",
        "Zonas",
        "Observacion",
        "Serial",
        "Productos",
        "Falla",
        "Ubicacion",
        "Complemento",
        "Ciudad",
        "Departamento"
      ]
    },
    {
      "cells": [
        "Cédula de ciudadanía",
        "X",
        "CC-123",
        "R. Automotion 1",
        "jhon.quinones@infotrack.com.co",
        "1234567890",
        "01",
        "Domicilio",
        "Mantenimiento",
        "Alta",
        "07:00 AM",
        "05:00 PM",
        "X",
        "Servicio de prueba",
        "4800356789212",
        "Nevera",
        "Piloto se apaga",
        "Cl. 118 #19-52",
        "Complemento",
        "Bogota",
        "Bogota"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Crear una orden de servicio desde el call center",
  "description": "",
  "keyword": "Esquema del escenario",
  "tags": [
    {
      "name": "@CP001_Creacion_OrdenServicio"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que en el call center se desea crear una orden de servicio con los siguientes datos",
  "rows": [
    {
      "cells": [
        "Tipo Identificacion",
        "Identificacion",
        "Codigo cliente",
        "Nombre",
        "Correo electronico",
        "Celular",
        "Ubicacion",
        "Complemento",
        "Ciudad",
        "Departamento"
      ]
    },
    {
      "cells": [
        "Cédula de ciudadanía",
        "X",
        "CC-123",
        "R. Automotion 1",
        "jhon.quinones@infotrack.com.co",
        "1234567890",
        "Cl. 118 #19-52",
        "Complemento",
        "Bogota",
        "Bogota"
      ]
    }
  ],
  "keyword": "Dado "
});
formatter.match({
  "location": "StepCrearServicio.queEnElCallCenterSeDeseaCrearUnaOrdenDeServicioConLosSiguientesDatos(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se ingresan los siguientes datos del servicio",
  "rows": [
    {
      "cells": [
        "Codigo del servicio",
        "Clase servicio",
        "Tipo Servicio",
        "Prioridad",
        "Hora inicio",
        "Hora fin",
        "Zonas",
        "Observacion"
      ]
    },
    {
      "cells": [
        "01",
        "Domicilio",
        "Mantenimiento",
        "Alta",
        "07:00 AM",
        "05:00 PM",
        "X",
        "Servicio de prueba"
      ]
    }
  ],
  "keyword": "Y "
});
formatter.match({
  "location": "StepCrearServicio.seIngresanLosSiguientesDatosDelServicio(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se ingresan los siguientes datos del producto",
  "rows": [
    {
      "cells": [
        "Serial",
        "Productos",
        "Falla"
      ]
    },
    {
      "cells": [
        "4800356789212",
        "Nevera",
        "Piloto se apaga"
      ]
    }
  ],
  "keyword": "Y "
});
formatter.match({
  "location": "StepCrearServicio.seIngresanLosSiguientesDatosDelProducto(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se crea la orden de servicio",
  "keyword": "Cuando "
});
formatter.match({
  "location": "StepCrearServicio.seCreaLaOrdenDeServicio()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "se verifica que la orden de servicio se ha creado correctamente",
  "keyword": "Entonces "
});
formatter.match({
  "location": "StepCrearServicio.seVerificaQueLaOrdenDeServicioSeHaCreadoCorrectamente()"
});
formatter.result({
  "status": "passed"
});
});