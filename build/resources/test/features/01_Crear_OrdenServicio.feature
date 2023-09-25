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
      | TipoID               | Identificacion | CodigoCliente | Nombre     | Email            | Celular    | CodigoServicio | ClaseServicio | TipoServicio | Prioridad | HoraInicio | HoraFin | Zonas  | Observacion        | Serial  | Productos  | Falla   | Ubicacion      | Complemento     |
      | Cedula de ciudadanía | 1012835836     | CC-123        | Juan Perez | juan@example.com | 1234567890 | SERV-001       | Clase A       | Tipo A       | Alta      | 09:00      | 13:00   | Zona 1 | Servicio de prueba | 1234567 | Producto X | Falla Y | Cl. 118 #19-52 | Usaquén, Bogotá |
    #  | Cédula de ciudadanía | 9876543210     | CC-456        | Maria Lopez | maria@example.com | 9876543210 | SERV-002       | Clase B       | Tipo B       | Baja      | 10:00      | 14:00   | Zona 2 | Otra observacion   | 7654321 | Producto Y | Falla Z |





