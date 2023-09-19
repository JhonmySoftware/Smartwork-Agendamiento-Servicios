# Automatización de Pruebas con Patrón de Diseño Screenplay en Java

Este proyecto utiliza Java, el patrón de diseño Screenplay, Serenity BDD y Gradle para la automatización de pruebas.

## Descripción

Este proyecto tiene como objetivo automatizar las pruebas del proceso de creación del servicio y agendamiento en el sistema de información Smartwork. Utiliza el patrón de diseño Screenplay, que permite escribir pruebas más legibles y mantenibles al separar las acciones de los actores y las interacciones con el sistema bajo prueba.

## Requisitos

- [Java](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Gradle](https://gradle.org/)
- [Serenity BDD](http://www.thucydides.info/docs/serenity-staging/)
- [Intellij](https://www.jetbrains.com/idea/)

## Instalación

1. Clona este repositorio en tu máquina local:

   ```shell
   git clone https://github.com/tuusuario/tuproyecto.git

## Estructura del proyecto - Screenplay
<p class="has-line-data" data-line-start="0" data-line-end="21">src/<br>
├── main/<br>
│   ├── java/<br>
│   │   ├── &lt;project_name&gt;/<br>
│   │   │   ├── model/                   # Clases que representan los objetos del dominio<br>
│   │   │   ├── tasks/                   # Tareas que el actor puede realizar<br>
│   │   │   ├── interactions/            # Interacciones que el actor puede realizar<br>
│   │   │   ├── user_interface/          # Page Objects y elementos de la interfaz de usuario<br>
│   │   │   ├── questions/               # Preguntas que el actor puede hacer<br>
│   │   │   └── utils/                   # Utilidades generales<br>
│   │   └── resources/                   # Recursos para la automatización<br>
│   │       ├── webdriver/               # Drivers de navegadores<br>
│   │       └── serenity.conf            # Configuración de Serenity<br>
└── test/<br>
├── java/<br>
│   ├── &lt;project_name&gt;/<br>
│   │   ├── features/                 # Escenarios de prueba escritos en lenguaje natural<br>
│   │   ├── runners/                  # Clases que ejecutan las pruebas<br>
│   │   └── stepdefinitions/          # Pasos para los escenarios de prueba<br>
└── resources/<br>
└── features/                     # Archivos de características de pruebas escritos en Gherkin</p>




### Reportes
El Reporte automático de pruebas se obtendrá a través de Gradle. Este Reporte informará sobre los resultados de la ejecución de cada caso de prueba. Incluirá las pruebas que pasaron y las que fallaron, los errores encontrados, la tasa de éxito y el tiempo transcurrido.
##### Comando:  gradle clean test aggregate -Dtags=@Requerimiento01

## License
MIT
**Free Software**
