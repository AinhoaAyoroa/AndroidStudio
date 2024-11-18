# **Memòria del Projecte Comptador**

## **Introducció**

Aquest treball té com a objectiu implementar un comptador en tres formats diferents, explorant diverses eines i arquitectures proporcionades pel desenvolupament Android:

1. **Comptador**: Una implementació bàsica que utilitza `Intent` per passar dades entre activitats.
2. **ComptadorComposable**: Una versió que utilitza Jetpack Compose per a la construcció d'interfícies declaratives modernes.
3. **ComptadorMVVM**: Una implementació basada en l'arquitectura MVVM (Model-View-ViewModel), que ofereix una millor separació de responsabilitats.

Aquest projecte no només busca implementar les funcionalitats sol·licitades, sinó també reflexionar sobre les eines i arquitectures que millor s'adapten a diferents contextos i necessitats.

## **Objectius**

1. **Familiaritzar-se amb Jetpack Compose** com a eina declarativa per al disseny d'UI.
2. **Implementar l'arquitectura MVVM** per entendre com organitzar projectes grans i complexos.
3. Comparar les diferents arquitectures i extreure conclusions sobre els seus avantatges i inconvenients.
4. Crear una solució que sigui funcional i ben documentada.

## **Estructura dels Projectes**

### **1. Comptador**
Aquest projecte es basa en la implementació bàsica d'un comptador que incrementa, decrementa, es resseteja i mostra el valor actual en una segona activitat.

#### **Característiques**
- Dues activitats: `MainActivity` i `MostraComptadorActivity`.
- Comunicació entre activitats mitjançant `Intent`.
- Ús d'elements tradicionals d'Android com `TextView` i `Button`.

#### **Modificacions Realitzades**
- S'han afegit els botons de restabliment i decrement.
- S'han eliminat els comentaris redundants, deixant només els estrictament necessaris.
- Codi lleugerament refactoritzat per millorar la llegibilitat.

### **2. ComptadorComposable**
Aquest projecte utilitza Jetpack Compose per construir la interfície de manera declarativa.

#### **Característiques**
- Interfície totalment basada en composables (`@Composable`).
- Gestió d'estat amb `rememberSaveable` per mantenir el comptador en canvis d'orientació.
- Ús d'una `Row` per col·locar els botons d'increment, decrement i restabliment.

#### **Modificacions Realitzades**
- S'ha afegit la funcionalitat per ressetejar el comptador.
- Botons reordenats dins d'una fila (`Row`) per optimitzar l'ús de l'espai.
- Refactorització per simplificar el codi i eliminar redundàncies.

### **3. ComptadorMVVM**
Aquest projecte segueix el patró MVVM per separar clarament la lògica de negoci de la interfície d'usuari.

#### **Característiques**
- `ViewModel` per gestionar l'estat del comptador.
- Observació del `LiveData` per actualitzar la interfície automàticament.
- Dues activitats: `MainActivity` i `MostraComptadorActivity`.

#### **Modificacions Realitzades**
- S'han afegit les funcions `resetearComptador` i `decrementarComptador` al `ViewModel`.
- La vista es sincronitza amb els canvis al `LiveData`.
- Eliminació de comentaris innecessaris per simplificar el codi.

#### **Reflexió MVVM**
Amb MVVM, podríem prescindir de passar dades amb `Intent` a la segona activitat, ja que aquesta podria accedir directament al mateix `ViewModel`. Això simplifica la comunicació entre activitats i reforça la centralització de l'estat.


## **Conclusions**

1. **Comptador** és una bona solució per a projectes petits o senzills, però presenta limitacions quan el projecte creix.
2. **ComptadorComposable** introdueix un enfocament més modern i declaratiu, sent una opció recomanada per a noves aplicacions.
3. **ComptadorMVVM** proporciona la millor separació de responsabilitats i escalabilitat, però requereix més temps d'aprenentatge i implementació.

## **Repositori i Documentació**

El codi dels tres projectes i aquesta memòria es troben disponibles al següent repositori de GitHub: [Enllaç al repositori](https://github.com/usuari/exemple-repositori).

Cada projecte està documentat amb un `README.md` que detalla les funcionalitats i com executar-lo.


## **Referències**

- [Documentació oficial de Jetpack Compose](https://developer.android.com/jetpack/compose)
- [Arquitectura MVVM en Android](https://developer.android.com/jetpack/guide)
- [Guia de Markdown a GitHub](https://guides.github.com/features/mastering-markdown/)
