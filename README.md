# 📱 Práctica 1 - "Implementación de Múltiples Pantallas en Android"

## 📌 Descripción
Esta práctica consiste en desarrollar una aplicación móvil en **Kotlin** que demuestra la gestión de múltiples pantallas usando **Activities** y **Fragments**.

La app incluye **navegación entre distintos Fragments**, donde cada uno muestra un tipo diferente de elemento de interfaz de usuario. Esto permite observar cómo se estructuran, organizan y conectan los componentes visuales dentro de una aplicación Android.

## 📲 Desarrollo de la Aplicación
La aplicación incluye los siguientes **Fragments**:

1. **Pantalla 1: Campos de texto** → `EditText`
2. **Pantalla 2: Botones** → `Button`, `ImageButton`, `FloatingActionButton`
3. **Pantalla 3: Elementos de selección** → `CheckBox`, `RadioButton`, `Switch`
4. **Pantalla 4: Listas** → `RecyclerView` / `ListView`
5. **Pantalla 5: Elementos de información** → `TextView`, `ImageView`, `ProgressBar`

## 🧭 Navegación
- Se implementó un **menú de navegación** en la **MainActivity** para acceder a cada Fragment.
- Cada Fragment incluye:
  - 📝 **Título descriptivo**
  - 🎨 **Ejemplos visuales funcionando**
  - 💡 **Breve explicación de su uso**
  - ⚡ **Demostración interactiva**
  - 
## 🖼️ Evidencias 

<p align="center">
  <img width="360" height="800" src="https://github.com/user-attachments/assets/b37b5acd-4d67-4ef1-9300-d4d021ba73cf" />
</p>

<p align="center">
  <img width="360" height="800" src="https://github.com/user-attachments/assets/09b88055-6583-4376-b96b-ea27e4396775" />
</p>

<p align="center">
  <img width="360" height="800" src="https://github.com/user-attachments/assets/22e21c2a-43f5-494c-9bc1-861f7d00a947" />
</p>

<p align="center">
  <img width="360" height="800" src="https://github.com/user-attachments/assets/3e9edd20-805e-46a6-8f3f-3dc452c67808" />
</p>

<p align="center">
  <img width="360" height="800" src="https://github.com/user-attachments/assets/0db7e2b8-abb8-4d1e-aca5-8144c72a7844" />
</p>

<p align="center">
  <img width="360" height="800" src="https://github.com/user-attachments/assets/ea19fc4d-6583-4190-b2e7-5ec10cba53e3" />
</p>

<p align="center">
  <img width="360" height="800" src="https://github.com/user-attachments/assets/63c709a3-d5ac-48e7-8865-58798d8a8009" />
</p>

<p align="center">
  <img width="360" height="800" src="https://github.com/user-attachments/assets/8e87d578-fad6-4807-9cd8-8c951a9d1b5b" />
</p>

<p align="center">
  <img width="360" height="800" src="https://github.com/user-attachments/assets/ebef50fa-7ea6-4cd2-b16a-756c35a145d6" />
</p>

<p align="center">
  <img width="360" height="800" src="https://github.com/user-attachments/assets/7f17d49f-c93e-40fd-b7ed-95f0cd894529" />
</p>

<p align="center">
  <img width="360" height="800" src="https://github.com/user-attachments/assets/88df26c0-2b65-401b-a515-f08da7a56e86" />
</p>

<p align="center">
  <img width="360" height="800" src="https://github.com/user-attachments/assets/58b57f8a-0fde-4756-9c5a-5e45fa826c0a" />
</p>

<p align="center">
  <img width="360" height="800" src="https://github.com/user-attachments/assets/3f357d96-5452-4b71-a6bd-9ab7f741cdc5" />
</p>

### VIDEO DEL FUNCIONAMIENTO 
https://github.com/user-attachments/assets/1f17c648-b5dd-4833-b414-4eec12873b10

## 🛠️ Instrucciones de uso

1. **Descargar o clonar el repositorio** en Android Studio.  

2. **Abrir el proyecto** y esperar a que termine la sincronización de Gradle.  

3. **Conectar un dispositivo Android** o configurar un emulador.  

4. **Ejecutar la aplicación** usando el botón **Run**.  

5. **Explorar la aplicación**: La **MainActivity** permite acceder a los distintos Fragments:

   - **Pantalla 1:** Campos de texto (`EditText`)  
   - **Pantalla 2:** Botones (`Button`, `ImageButton`, `FloatingActionButton`)  
   - **Pantalla 3:** Elementos de selección (`CheckBox`, `RadioButton`, `Switch`)  
   - **Pantalla 4:** Listas (`RecyclerView` / `ListView`)  
   - **Pantalla 5:** Elementos de información (`TextView`, `ImageView`, `ProgressBar`)  

## ⚠️ Dificultades y cómo se resolvieron

Durante el desarrollo de la aplicación se presentaron algunas dificultades:

### 1. Navegación entre Fragments y Activities
- **Problema:** Inicialmente, algunos botones no abrían el Fragment correcto o la aplicación se cerraba inesperadamente al cambiar de pantalla.  
- **Solución:** Se revisó la implementación de `FragmentTransaction` y se aseguraron los **IDs correctos** en el menú de navegación.
### 2. Compatibilidad de layouts con distintos tamaños de pantalla
- **Problema:** Algunos elementos se desbordaban o se veían desalineados en dispositivos con resoluciones diferentes.  
- **Solución:** Se utilizaron **ConstraintLayout** y **ScrollView** para mantener los elementos correctamente alineados y responsivos.

## 💡 Hallazgos

- La separación de responsabilidades entre **Activities** y **Fragments** facilita la gestión de la interfaz y la navegación.

