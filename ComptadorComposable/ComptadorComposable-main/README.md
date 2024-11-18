# ComptadorComposable

Aquest projecte implementa un comptador utilitzant Jetpack Compose, que permet construir interfaces d'usuari declaratives de manera eficient.

## Característiques

- Mostra un comptador al centre de la pantalla amb opcions per:
  - Incrementar el valor.
  - Decrementar el valor.
  - Reiniciar el valor.
- Utilitza `rememberSaveable` per preservar l'estat del comptador, fins i tot en rotacions de pantalla.
- Inclou un botó per obrir una segona activitat que mostra el valor actual del comptador.

## Modificacions

- S'han afegit botons per disminuir i reiniciar el comptador en una fila utilitzant el component `Row`.
- La funcionalitat de **reset** preserva la reactivitat i actualització automàtica del valor mostrat.
- S'ha refactoritzat el codi per eliminar comentaris innecessaris.

## Llibreries utilitzades

- [Jetpack Compose](https://developer.android.com/jetpack/compose): Per a la implementació declarativa de la UI.
- [Material3](https://developer.android.com/jetpack/androidx/releases/compose-material3): Per a utilitzar components moderns d'interfície d'usuari.

## Com instal·lar

1. Obriu el projecte a Android Studio.
2. Compileu i executeu l'aplicació en un dispositiu o emulador Android.
3. Interactueu amb els botons per comprovar les funcionalitats.

## Conclusions

Aquest projecte demostra com Jetpack Compose simplifica el desenvolupament d'interfícies i millora la gestió d'estats gràcies a eines com `rememberSaveable`.
