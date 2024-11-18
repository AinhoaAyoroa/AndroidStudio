# COMPTADOR AMB 

Sobre el projecte del **comptador amb MVVM**, afegirem les modificacions necessàries per tal que suporti la possibilitat de **ressetejar** el comptador i **decrementar-lo**.

## Objectiu

Definir les funcions necessàries al ViewModel i fer ús d'aquestes des de la vista.

## Instruccions

1. **Definir les funcions al ViewModel**:
   - Afegir funcions per ressetejar i decrementar el comptador.

2. **Modificar la vista per utilitzar les noves funcions**:
   - Afegir botons per ressetejar i decrementar el comptador.
   - Utilitzar les funcions del ViewModel des de la vista.

## Exemple de codi

### ViewModel

```kotlin
btAdd.setOnClickListener {
    comptadorViewModel.incrementarComptador()
}

btRes.setOnClickListener {
    comptadorViewModel.decrementarComptador()
}

btReset.setOnClickListener {
    comptadorViewModel.resetearComptador()
}
```
