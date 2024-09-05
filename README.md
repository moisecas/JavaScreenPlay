# Screenplay Automation Project

Este proyecto utiliza el patrón de diseño Screenplay para la automatización de pruebas con Serenity BDD y Cucumber. El objetivo del proyecto es validar la funcionalidad de la página [Demoblaze](https://www.demoblaze.com/), específicamente interactuando con la selección de categorías y sub-funciones.

## Estructura del Proyecto

El proyecto está estructurado en los siguientes paquetes principales:

- **`co.com.screenplay.project.ui`:** Contiene los selectores y mapeos de la interfaz de usuario (UI) como categorías y botones.
- **`co.com.screenplay.project.tasks`:** Define las acciones que los actores pueden realizar, como seleccionar categorías o funciones aleatorias.
- **`co.com.screenplay.project.questions`:** Contiene las validaciones necesarias para verificar que la funcionalidad se ejecuta correctamente.
- **`co.com.screenplay.project.stepdefinition`:** Mapea los pasos definidos en los archivos `.feature` de Cucumber a las acciones y tareas dentro del proyecto.
- **`co.com.screenplay.project.utils`:** Utilidades como generación de datos aleatorios y constantes globales.

## Tecnologías Utilizadas

- **Serenity BDD:** Framework para reportes de pruebas y gestión de flujo de pruebas automatizadas.
- **Cucumber:** Herramienta para definir y ejecutar pruebas basadas en el comportamiento (BDD).
- **Screenplay Pattern:** Patrón de diseño utilizado para mejorar la mantenibilidad y legibilidad de los scripts de automatización.
- **Java 18:** Lenguaje de programación principal del proyecto.
- **Gradle:** Sistema de construcción para la gestión de dependencias y ejecución de pruebas.

## Instalación y Configuración

1. **Clona el repositorio:**

    ```bash
    git clone https://github.com/tu-usuario/tu-repositorio.git
    ```

2. **Navega al directorio del proyecto:**

    ```bash
    cd projectBaseCourse
    ```

3. **Construye el proyecto con Gradle:**

    ```bash
    gradle clean build
    ```

4. **Ejecución de las pruebas:**

    ```bash
    gradle test
    ```

## Estructura de Features

Los archivos `.feature` están ubicados en `src/test/resources/features/`. Aquí se define el comportamiento esperado de las funcionalidades bajo prueba.

Ejemplo de un feature:

```gherkin
Feature: Open demoblaze page

  As Moiso,
  I want to test the elements card and sub-functions,
  So that I can check the robustness and error control of the application or web page.

  Background:
    Given "Moiso" opens the test website

  @successful
  Scenario: Validation of the ID Card Elements function
    And he wants to validate the elements card function
    When he randomly selects one of the sub-functions
    Then he should see the name of the selected option in the header
