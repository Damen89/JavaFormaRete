# Installazione e Configurazione ambiente

# Installazione Jdk & JRE in Win 10
1. Cerca Java JDK su Google
2. Prendere Java se development kit 17 versione installer
3. Lanciare installazione della jdk

Oss: durante l'installazione viene settata di default la cartella per la jdk e per la jre, noi le possiamo cambiare andando a selezionare una cartella come quella del corso e installare all'interno. Ma non è questo il caso. Attenzione solo a mettere il nome della cartella così come viene suggerita

### Verificare se configurata
1. Aprire Prompt dei comandi
2. Lanciare:
 
```cli
echo %JAVA_HOME%
```
se ritorana il nome della variabile allora non è configurata

## Variabile d'ambiente JAVA_HOME
Se voglio utilizzare questa versione della mia Jre per ogni progetto e software che andrò a creare devo settare la variabile d'ambiente.

Procedura:

1. Start
2. Cerchiamo Variabili
3. Click su Modifica variabili d'ambiente legate al sistema
3. Varibili d'ambiente
4. Nella sezione Variabili di sistema -> Nuova
5. Nome: JAVA_HOME; Percorso: il percorso il percorso della cartella jre
6. premere su OK

Riprovare adesso con la cli del terminale, se stampa il percorso della variabile è tutto ok.
Se provo a lanciare "java" mi darà una serie di comandi vari 

## Variabile d'ambiente PATH
per poter utilizzare Java da console in Windows, è necessario aggiungere il percorso dove si trova il file java.exe (o javac.exe per la compilazione) alla variabile d'ambiente PATH.

Procedura:
1. apri le variabili d'ambiente in Windows
2. fai doppio clic sulla variabile PATH
3. clicca su Nuovo
4. iserisci il percorso della directory bin che si trova nel JDK oppure %JAVA_HOME%\bin
5. clicca su OK per chiudere tutte le finestre

## Installazione Eclipse su Win
1. Scaricare l'installer
2. Scegliere la versione di Eclipse che si vuole installare, nel mio caso EclipseEE
