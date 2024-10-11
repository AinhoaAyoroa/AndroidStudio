# Contador App

Este proyecto es una aplicación de Android que permite contar números con tres botones: Sumar, Restar y Resetear.

## Funciones del proyecto

- **Contador**: Muestra el valor del contador actual.
- **Sumar**: Incrementa el contador en 1 cada vez que se presiona el botón.
- **Restar**: Disminuye el contador en 1 cada vez que se presiona el botón.
- **Resetear**: Establece el contador a 0.

## Estructura del código

- **MainActivity.kt**: Contiene la lógica principal de la aplicación. Gestiona las interacciones con los botones.
  - `contador`: Variable que guarda el estado actual del contador.
  - `sumarButton`: Incrementa el contador.
  - `restarButton`: Decrementa el contador.
  - `resetButton`: Restablece el contador a 0.
  
- **activity_main.xml**: Define la interfaz gráfica. Contiene un `TextView` para mostrar el contador y tres `Button` para las funciones de sumar, restar y resetear.

## Cómo usar la aplicación

1. Presiona el botón "Sumar" para incrementar el contador.
2. Presiona el botón "Restar" para disminuir el contador.
3. Presiona el botón "Resetear" para reiniciar el contador a 0.
