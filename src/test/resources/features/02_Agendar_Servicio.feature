#Autor: Jhon Quiñones Arboleda
#language: es

@CP002_Agendamiento_Servicio
Característica: Proceso de agendamiento de servicios

  Antecedentes:
    Dado que el usuario tiene acceso al servicio de agendamiento

  Esquema del escenario: Agendar una orden de servicio desde el call center con diferentes datos
    Cuando el usuario realiza una solicitud de agendamiento con los siguientes datos
      | Id   | IdServicio   | IdZona   | IdCuadrilla   | IdEstado   | FechaInicio   | FechaFin   |
      | <Id> | <IdServicio> | <IdZona> | <IdCuadrilla> | <IdEstado> | <FechaInicio> | <FechaFin> |
    Entonces la orden de servicio debe ser agendada correctamente

    Ejemplos:
      | Id | IdServicio | IdZona | IdCuadrilla | IdEstado | FechaInicio      | FechaFin         |
      | 0  | 2125       | 111    | 141         | 1        | 2023-11-28 19:00 | 2023-11-28 19:30 |









