# chatbot-App-Kotlin
# Grüße-Chatbot

Dies ist ein einfacher Chatbot, der Grüße sendet. Der Chatbot ist in Kotlin implementiert und verwendet die `readln()`-Funktion zum Einlesen von Benutzereingaben.

## Verwendung

1. Klonen Sie dieses Repository oder laden Sie den Quellcode herunter.
2. Navigieren Sie zum Verzeichnis des Chatbot-Projekts.
3. Kompilieren Sie das Projekt mit dem Kotlin-Compiler.
4. Führen Sie die generierte ausführbare Datei aus.
5. Befolgen Sie die Anweisungen, um mit dem Chatbot zu interagieren.

## Funktionen

- Begrüßt den Benutzer beim Start.
- Sendet verschiedene Grüße abhängig von der Benutzereingabe.
- Erkennt "Tschüss" als Signal zum Beenden des Chats.

## Beispielinteraktion

------------------------------------------------------------------
# Pseudocode:
Hauptfunktion:
    ZeigeWillkommensnachricht()
    Solange Eingabe nicht "Tschüss" ist:
        Eingabe = LiesBenutzereingabe()
        SendeGruß(Eingabe)
    ZeigeAbschiedsnachricht()

Funktion ZeigeWillkommensnachricht():
    Drucke "Willkommen beim Grüße-Chatbot!"

Funktion ZeigeAbschiedsnachricht():
    Drucke "Auf Wiedersehen! Bis zum nächsten Mal."

Funktion SendeGruß(Eingabe):
    Fall Eingabe:
        "Hallo":
            Drucke "Hallo! Wie geht es dir?"
        "Gut":
            Drucke "Das freut mich zu hören!"
        "Schlecht":
            Drucke "Das tut mir leid. Kann ich etwas tun, um zu helfen?"
        "Danke":
            Drucke "Kein Problem! Hab einen schönen Tag!"
        Andernfalls:
            Drucke "Ich habe dich nicht verstanden. Kannst du es noch einmal sagen?"

Funktion LiesBenutzereingabe():
    Drucke "Deine Nachricht: "
    Eingabe = LiesZeile()
    Rückgabe Eingabe
----------------------------------------------
