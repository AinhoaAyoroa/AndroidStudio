# COMPTADOR AMB COMPOSE

Partirem del projecte **ComptadorComposable**, que tenim al repositori GitHub de la unitat.

## Objectiu

Modificar el codi necessari per tal d'afegir els botons de **decrementar** i **ressetejar** el comptador.

## Instruccions

1. **Utilitzar la funció composable `Row`**:
   - La funció `Row` ens permet organitzar diversos composables en una fila, de la mateixa manera que `Column` ho fa en una columna.

2. **Afegir els botons**:
   - Afegir un botó per decrementar el comptador.
   - Afegir un botó per ressetejar el comptador.

## Exemple de codi

```kotlin
Row (
    horizontalArrangement = Arrangement.SpaceEvenly,
    verticalAlignment = Alignment.CenterVertically,
    modifier = Modifier.fillMaxSize()
    ){
      Button(onClick = { comptador-- }) {
          Text(text = "-", fontSize = 34.sp)
      }
      Spacer(modifier = Modifier.width(78.dp))
      Button(onClick = { comptador++ }) {
          Text(text = "+", fontSize = 33.sp)
      }
}
```
