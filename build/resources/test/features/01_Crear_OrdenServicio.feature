#Autor: Jhon Quiñones Arboleda
#language: es

@CP001_Creacion_OrdenServicio
Característica: Proceso de agendamiento de servicios

  Esquema del escenario: Crear una orden de servicio desde el call center
    Dado que en el call center se desea crear una orden de servicio con los siguientes datos
      | Tipo Identificacion | Identificacion   | Dv   | Codigo cliente  | Nombre   | Correo electronico | Celular   | Ubicacion   | Complemento   | Ciudad   | Departamento   |
      | <TipoID>            | <Identificacion> | <Dv> | <CodigoCliente> | <Nombre> | <Email>            | <Celular> | <Ubicacion> | <Complemento> | <Ciudad> | <Departamento> |
    Y se ingresan los siguientes datos del servicio
      | Codigo del servicio | Clase servicio  | Tipo Servicio  | Prioridad   | Hora inicio  | Hora fin  | Zonas   | Observacion   |
      | <CodigoServicio>    | <ClaseServicio> | <TipoServicio> | <Prioridad> | <HoraInicio> | <HoraFin> | <Zonas> | <Observacion> |
    Y se ingresan los siguientes datos del producto
      | Serial   | Productos   | Falla   |
      | <Serial> | <Productos> | <Falla> |
    Cuando se crea la orden de servicio
    Entonces se verifica que la orden de servicio se ha creado correctamente

    Ejemplos:
      | TipoID | Identificacion | CodigoCliente | Nombre          | Email                          | Celular    | CodigoServicio | ClaseServicio | TipoServicio  | Prioridad | HoraInicio | HoraFin  | Zonas | Observacion        | Serial        | Productos          | Falla     | Ubicacion      | Complemento | Ciudad | Departamento | Dv |
   #    | Cédula de ciudadanía | X              | CC-123        | R. Automotion 2 | jhon.quinones@infotrack.com.co | 1234567890 | 01             | Domicilio     | Mantenimiento | Alta      | 07:00 AM   | 05:00 PM | X     | Servicio de prueba | 4800356789212 | Cafetera Eléctrica | BOTA AGUA       | Cl. 118 #19-52 | Complemento |||
      | NIT    | X              | CC-123        | R. Automotion 3 | jhon.quinones@infotrack.com.co | 1234567890 | 01             | Domicilio     | Mantenimiento | Alta      | 07:00 AM   | 05:00 PM | X     | Servicio de prueba | 4800356789212 | Campana Extractora | BOTA AGUA | Cl. 118 #19-52 | Complemento | bogota | Bogota       | 7  |
#      | Cédula de ciudadanía | X              | CC-123        | R. Automotion 4 | jhon.quinones@infotrack.com.co | 1234567890 | 01             | Domicilio     | Mantenimiento | Alta      | 07:00 AM   | 05:00 PM | X     | Servicio de prueba | 4800356789212 | Olla Arrocera      | PILOTO SE APAGA | Cl. 118 #19-52 | Complemento |||
#      | Cédula de ciudadanía | X              | CC-123        | R. Automotion 5 | jhon.quinones@infotrack.com.co | 1234567890 | 01             | Domicilio     | Mantenimiento | Alta      | 07:00 AM   | 05:00 PM | X     | Servicio de prueba | 4800356789212 | Refrigeradora      | Piloto se apaga | Cl. 118 #19-52 | Complemento |||


  #Actualmente el proceso de creación de servicios esta cambiando por ajustes de Challenger
  #Motivo por el cual toca refactorizar este proyecto.