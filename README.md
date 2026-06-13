![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧠 Actividad Sumativa 1: Realizando validación, excepciones y relaciones entre clases
# 🌲 Sistema de Gestión - Llanquihue Tour

## 👤 Autor del proyecto
- **Nombre completo:** Fabrizio Fernandini
- **Ramo:** Desarrollo Orientado a Objetos I
- **Sección:** 005A
- **Carrera:** Analista Programador Computacional
- **Sede:** Campus Virtual

---

## 📘 Descripción general del sistema
Este proyecto corresponde a la Actividad Sumativa 1: Realizando validación, excepciones y relaciones entre clases.

El proyecto fue desarrollado a partir de un caso contextualizado, abordando problemáticas de información duplicada y desorganizada, gestión manual de registros por parte del cliente, falta de diferenciación entre roles y poca reutilización de estructuras.

---

## 🧱 Estructura general del proyecto

```plaintext
📁 src/
   ├── app/         # Clase principal con el método main.
   ├── model/       # Clases de dominio (Persona, Cliente, Empleado, Guia, Operador, Proveedor, Rut y Direccion.)
   ├── util/       # Utilidades y validaciones.
````

## Estructura del proyecto
```plaintext
📁 src/
   ├── app/
   |    └───Main.java
   ├── model/
   |    └─── Cliente.java
   |    └─── Direccion.java
   |    └─── Empleado.java
   |    └─── Guia.java
   |    └─── Operador.java
   |    └─── Persona.java
   |    └─── Proveedor.java
   |    └─── Rut.java
   ├── util/
       └─── RutInvalidoException.java
       └─── TextoVacioException.java
       └─── ValidadorRut.java
       └─── ValidadorTextos.java
````

---

## 🚀 Instrucciones de Ejecución y Compilación

Para clonar, abrir y ejecutar este proyecto localmente, sigue los pasos a continuación:

### 📋 Requisitos Previos
* Tener instalado **Java JDK 25** (como Eclipse Temurin 25).
* Tener un entorno de desarrollo compatible, idealmente **IntelliJ IDEA**.

### 💻 Opción 1: Desde IntelliJ IDEA (Recomendado)
1. **Clonar el proyecto:** Abre tu terminal y clona el repositorio ejecutando:
   ```bash
   git clone https://github.com/Capa8cl/poo1-llanquihue-tour-sumativa1.git
   ```

2. Abrir en el IDE: Abre IntelliJ IDEA, selecciona File > Open y elige la carpeta raíz poo1-llanquihue-tour-sumativa1.
3. Verificar el SDK: Asegúrate de que el proyecto esté asociado a tu JDK 25 en File > Project Structure > Project.
4. Ejecutar: En el árbol del proyecto, navega hasta src/app/Main.java, haz clic derecho sobre el archivo y selecciona Run 'Main.main()' (o haz clic en el botón de Play verde ▶️ en la barra superior).

### 🖥️ Opción 2: Desde la Terminal (Consola del Sistema)

Si deseas compilar y correr el sistema sin usar la interfaz de un IDE, abre tu consola, sitúate en la carpeta raíz del proyecto con `cd poo1-llanquihue-tour-sumativa1` y ejecuta:

1. **Compilar todos los paquetes:**
   Este comando compila las clases respetando sus dependencias y guarda los ejecutables en la carpeta `out`:
   ```bash
   javac -d out src/app/Main.java src/model/*.java src/util/*.java
   ```

2. **Ejecutar la aplicación:**
   Inicia el programa llamando a la clase principal desde la carpeta de salida:
   ```bash
   java -cp out app.Main
   ```

---

**Repositorio GitHub:** https://github.com/Capa8cl/poo1-llanquihue-tour-sumativa1

**Fecha de entrega:** 08/06/2026

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Sumativa 1




