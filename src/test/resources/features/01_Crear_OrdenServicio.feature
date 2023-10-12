#Autor: Jhon Quiñones Arboleda
#language: es

@CP001_Creacion_OrdenServicio
Característica: Proceso de agendamiento de servicios

  Esquema del escenario: Crear una orden de servicio desde el call center
    Dado que en el call center se desea crear una orden de servicio con los siguientes datos
      | Tipo Identificacion | Identificacion   | Codigo cliente  | Nombre   | Correo electronico | Celular   | Ubicacion   | Complemento   |
      | <TipoID>            | <Identificacion> | <CodigoCliente> | <Nombre> | <Email>            | <Celular> | <Ubicacion> | <Complemento> |
    Y se ingresan los siguientes datos del servicio
      | Codigo del servicio | Clase servicio  | Tipo Servicio  | Prioridad   | Hora inicio  | Hora fin  | Zonas   | Observacion   |
      | <CodigoServicio>    | <ClaseServicio> | <TipoServicio> | <Prioridad> | <HoraInicio> | <HoraFin> | <Zonas> | <Observacion> |
    Y se ingresan los siguientes datos del producto
      | Serial   | Productos   | Falla   |
      | <Serial> | <Productos> | <Falla> |
    Cuando se crea la orden de servicio
    Entonces se verifica que la orden de servicio se ha creado correctamente

    Ejemplos:
      | TipoID               | Identificacion | CodigoCliente | Nombre          | Email                          | Celular    | CodigoServicio | ClaseServicio | TipoServicio  | Prioridad | HoraInicio | HoraFin  | Zonas | Observacion        | Serial        | Productos                | Falla         | Ubicacion      | Complemento |
      | Cédula de ciudadanía | 2898885399     | CC-123        | R. Automotion 1 | jhon.quinones@infotrack.com.co | 1234567890 | 01             | Domicilio     | Mantenimiento | Alta      | 07:00 AM   | 05:00 PM | X     | Servicio de prueba | 4800356789212 | Ascensor de Carga 1000Kg | Desnivelación | Cl. 118 #19-52 | Complemento |
      | Cédula de ciudadanía | 2167835991     | CC-123        | R. Automotion 1 | jhon.quinones@infotrack.com.co | 1234567891 | 01             | Domicilio     | Mantenimiento | Alta      | 07:00 AM   | 05:00 PM | X     | Servicio de prueba | 4800356789212 | Ascensor de Carga 1000Kg | Desnivelación | Cl. 118 #19-52 | Complemento |
      | Cédula de ciudadanía | 2169735992     | CC-124        | R. Automotion 2 | jhon.quinones@infotrack.com.co | 1234567892 | 01             | Domicilio     | Mantenimiento | Alta      | 07:00 AM   | 05:00 PM | X     | Servicio de prueba | 4800356789212 | Ascensor de Carga 1000Kg | Desnivelación | Cl. 119 #20-53 | Complemento |
      | Cédula de ciudadanía | 2169835993     | CC-125        | R. Automotion 3 | jhon.quinones@infotrack.com.co | 1234567893 | 01             | Domicilio     | Mantenimiento | Alta      | 07:00 AM   | 05:00 PM | X     | Servicio de prueba | 4800356789212 | Ascensor de Carga 1000Kg | Desnivelación | Cl. 120 #21-54 | Complemento |
      | Cédula de ciudadanía | 2169835994     | CC-126        | R. Automotion 4 | jhon.quinones@infotrack.com.co | 1234567894 | 01             | Domicilio     | Mantenimiento | Alta      | 07:00 AM   | 05:00 PM | X     | Servicio de prueba | 4800356789212 | Ascensor de Carga 1000Kg | Desnivelación | Cl. 121 #22-55 | Complemento |
      | Cédula de ciudadanía | 2169875995     | CC-127        | R. Automotion 5 | jhon.quinones@infotrack.com.co | 1234567895 | 01             | Domicilio     | Mantenimiento | Alta      | 07:00 AM   | 05:00 PM | X     | Servicio de prueba | 4800356789212 | Ascensor de Carga 1000Kg | Desnivelación | Cl. 122 #23-56 | Complemento |
      | Cédula de ciudadanía | 2169835996     | CC-128        | R. Automotion 6 | jhon.quinones@infotrack.com.co | 1234567896 | 01             | Domicilio     | Mantenimiento | Alta      | 07:00 AM   | 05:00 PM | X     | Servicio de prueba | 4800356789212 | Ascensor de Carga 1000Kg | Desnivelación | Cl. 123 #24-57 | Complemento |