# ComptadorMVVM

Aquest projecte implementa un comptador utilitzant l'arquitectura MVVM (Model-View-ViewModel). Aquesta arquitectura separa la lògica de negoci de la interfície, millorant la mantenibilitat i escalabilitat del codi.

## Característiques

- Mostra un comptador amb les següents opcions:
  - Incrementar el valor.
  - Decrementar el valor.
  - Reiniciar el valor.
- L'estat del comptador és gestionat pel `ViewModel` mitjançant `LiveData`, que garanteix la sincronització automàtica amb la interfície gràfica.
- Permet obrir una segona activitat que mostra el valor actual del comptador.

## Modificacions

- S'han afegit mètodes al `ViewModel` per gestionar les accions de decrementar i reiniciar.
- Els botons corresponents s'han implementat a la vista principal amb observadors de `LiveData`.
- La segona activitat continua utilitzant intents per rebre el valor del comptador, però s'ha investigat la possibilitat d'utilitzar el mateix `ViewModel`.

## Llibreries utilitzades

- [Android Architecture Components](https://developer.android.com/topic/libraries/architecture):
  - `ViewModel`: Per gestionar la lògica de negoci i estat.
  - `LiveData`: Per sincronitzar automàticament els valors entre el model i la vista.

## Com instal·lar

1. Obriu el projecte a Android Studio.
2. Compileu i executeu l'aplicació en un dispositiu o emulador Android.
3. Interactueu amb els botons per comprovar les funcionalitats.

## Resultats

- **Vista principal**: Gestiona les accions i observa el valor del comptador.
- **Segona activitat**: Mostra el comptador utilitzant intents. Encara que podria compartir el `ViewModel`, aquesta funcionalitat no s'ha implementat completament per mantenir l'estructura original.

## Conclusions

L'ús de MVVM permet separar clarament les responsabilitats del codi. Tot i que podríem optimitzar el pas de dades entre activitats compartint el `ViewModel`, això requereix consideracions addicionals com el `ViewModelStoreOwner`.
