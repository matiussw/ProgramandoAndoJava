# ProgramandoAndoJava

Colección de ejercicios y ejemplos de Java con fines educativos, desarrollados como práctica de programación (estructuras condicionales, ciclos, arreglos, manejo de excepciones y persistencia de datos con JDBC/SQLite). El material corresponde al recorrido de guías de aprendizaje ("Guía 1", "Guía 2") y puede haberse usado en el contexto de formación SENA - Análisis y Desarrollo de Software (ADSO).

No es una aplicación única y cohesiva, sino un conjunto de ejercicios independientes organizados por guía, más un pequeño sistema de ejemplo (gestión de un restaurante) que integra los conceptos vistos.

## Tecnologías

- **Java 21** (probado con Temurin 21)
- **Swing** (`JOptionPane`, `JTextField`, `JPasswordField`) para las interfaces de los ejercicios
- **JDBC + SQLite** para persistencia de datos, usando el driver [`sqlite-jdbc`](https://github.com/xerial/sqlite-jdbc) (`src/lib/sqlite-jdbc-3.53.2.0.jar`)
- Sin gestor de dependencias (no hay `pom.xml` ni `build.gradle`): el `.jar` del driver está incluido directamente en el repositorio
- Configurado para **Visual Studio Code** (carpeta `.vscode/`) con la extensión de Java (Language Support for Java)

## Estructura del proyecto

```
├── mibasededatos.db          # Base de datos SQLite usada por los ejercicios de persistencia
├── src/
│   ├── Main.java              # Punto de entrada: menú principal (Guía 1 / Guía 2)
│   ├── lib/
│   │   └── sqlite-jdbc-*.jar  # Driver JDBC para SQLite
│   ├── ConexionDb/
│   │   ├── ConexionDB.java       # Conexión JDBC a mibasededatos.db
│   │   └── InicializarDB.java    # Creación de tabla "productos" de ejemplo
│   ├── Guia1/                    # Ejercicios de estructuras condicionales, ciclos y arreglos
│   │   ├── GuiaMain.java         # Menú de la Guía 1
│   │   └── EjercicioN.java       # Un ejercicio por archivo (año bisiesto, IMC, factorial,
│   │                              # tabla de multiplicar, figuras con asteriscos, etc.)
│   └── Guia2/                    # Ejercicios de manejo de excepciones y persistencia
│       ├── Guia2Main.java        # Menú de la Guía 2
│       ├── EjemploTryCatch.java / Ejercicio1.java   # Ejemplos de try/catch
│       ├── MainPersistenciaData.java                # Menú de ejercicios con base de datos
│       └── Restaurante/                              # Mini sistema de ejemplo (patrón MVC)
│           ├── Modelo/       # Entidades: Usuarios, Menu, Mesas, Pedidos + creación de tablas
│           ├── Controlador/  # Lógica de login y gestión del menú (CRUD básico sobre SQLite)
│           └── Vista/        # Pantallas Swing de login y menú
└── .vscode/
    └── settings.json          # Referencia a las librerías (jars) del proyecto para VS Code
```

El ejemplo de **Restaurante** (`Guia2/Restaurante`) es el más completo: crea tablas de usuarios, menú, mesas y pedidos en SQLite, permite iniciar sesión y, según el rol (`admin`/`vendedor`), agregar o consultar platos del menú.

## Cómo ejecutarlo

### Opción 1: Visual Studio Code (recomendada)

1. Abre la carpeta del proyecto en VS Code con la extensión **Extension Pack for Java** instalada.
2. El archivo `.vscode/settings.json` ya referencia el driver JDBC (`src/lib/sqlite-jdbc-3.53.2.0.jar`), así que las dependencias se resuelven automáticamente.
3. Abre `src/Main.java` y ejecuta con el botón **Run** (o `Run Java` desde el menú contextual).

### Opción 2: Línea de comandos

Requiere Java 21 (o compatible) instalado.

```bash
# Compilar todo el proyecto, incluyendo el driver JDBC en el classpath
javac -cp "src/lib/sqlite-jdbc-3.53.2.0.jar" -d bin $(find src -name "*.java")

# Ejecutar, incluyendo el driver JDBC y las clases compiladas en el classpath
java -cp "bin:src/lib/sqlite-jdbc-3.53.2.0.jar" Main
```

> En Windows, reemplaza `:` por `;` en el `-cp` de ambos comandos.

Al ejecutar `Main`, se muestra un menú (vía `JOptionPane`) para elegir entre los ejercicios de la Guía 1 o la Guía 2. Los ejercicios que usan base de datos crean/actualizan `mibasededatos.db` en la raíz del proyecto mediante SQLite.

## Notas

- Este repositorio es material de práctica/aprendizaje, no una aplicación de producción.
- Al ser ejercicios independientes, algunos archivos duplican utilidades simples (por ejemplo, distintas formas de leer datos por consola o por diálogo).
